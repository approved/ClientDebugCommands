package dev.odd.clientdbgcom.client.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

import org.apache.logging.log4j.Logger;

import dev.odd.clientdbgcom.ClientDebugCommands;
import dev.odd.clientdbgcom.client.F3Option;
import dev.odd.clientdbgcom.mixin.client.KeyboardF3Mixin;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.command.CommandManager;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class CDebugCommand {
    private static final Logger CDCLogger = ClientDebugCommands.CDCLogger;

    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        LiteralArgumentBuilder<FabricClientCommandSource> literalArgumentBuilder = (LiteralArgumentBuilder) CommandManager
                .literal("cdbg");

        F3Option[] options = F3Option.values();

        for (int i = 0; i < options.length; i++) {
            F3Option option = options[i];
            literalArgumentBuilder
                    .then((LiteralArgumentBuilder) CommandManager.literal(option.getCommand()).executes(context -> {
                        MinecraftClient instance = MinecraftClient.getInstance();
                        return ((boolean) ((KeyboardF3Mixin) instance.keyboard).invokeProcessF3(option.getKey())) ? 1
                                : -1;
                    }));
        }

        dispatcher.register(literalArgumentBuilder);
        CDCLogger.info("Successfully registered debug commands");
    }

}
