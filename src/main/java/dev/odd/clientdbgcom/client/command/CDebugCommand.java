package dev.odd.clientdbgcom.client.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import dev.odd.clientdbgcom.ClientDebugCommands;
import dev.odd.clientdbgcom.client.F3Option;
import dev.odd.clientdbgcom.mixin.client.KeyboardF3Mixin;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.Option;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.Logger;

@SuppressWarnings({"unchecked", "rawtypes"})
public class CDebugCommand {
    private static final Logger CDCLogger = ClientDebugCommands.CDCLogger;

    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        LiteralArgumentBuilder<FabricClientCommandSource> literalArgumentBuilder =
                (LiteralArgumentBuilder) CommandManager.literal("cdbg");

        F3Option[] options = F3Option.values();

        MinecraftClient instance = MinecraftClient.getInstance();
        for (int i = 0; i < options.length; i++) {
            F3Option option = options[i];
            if (option.hasExtra()) {
                continue;
            }

            literalArgumentBuilder
                    .then((LiteralArgumentBuilder) CommandManager.literal(option.getCommand()).executes(context -> {
                        return ((boolean) ((KeyboardF3Mixin) instance.keyboard).invokeProcessF3(option.getKey())) ? 1 : -1;
                    }));
        }

        literalArgumentBuilder.then(
                (LiteralArgumentBuilder) CommandManager.literal(F3Option.CYCLERENDERDISTANCE.getCommand())
                        .then(CommandManager.argument("distance", IntegerArgumentType.integer())
                                .executes(CDebugCommand::setRenderDistance)));

        dispatcher.register(literalArgumentBuilder);
        CDCLogger.info("Successfully registered debug commands");
    }

    private static int setRenderDistance(CommandContext<ServerCommandSource> context) {
        MinecraftClient instance = MinecraftClient.getInstance();
        Option.RENDER_DISTANCE.set(
                instance.options,
                MathHelper.clamp(
                        IntegerArgumentType.getInteger(context, "distance"),
                        Option.RENDER_DISTANCE.getMin(),
                        Option.RENDER_DISTANCE.getMax()
                )
        );
        ((KeyboardF3Mixin) instance.keyboard).invokeDebugLog("debug.cycle_renderdistance.message", instance.options.viewDistance);
        return 1;
    }
}
