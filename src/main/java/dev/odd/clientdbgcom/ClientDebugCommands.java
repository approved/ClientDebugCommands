package dev.odd.clientdbgcom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.odd.clientdbgcom.client.command.CDebugCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.command.v1.ClientCommandManager;

public class ClientDebugCommands implements ModInitializer {
	public static final Logger CDCLogger = LogManager.getFormatterLogger("ClientDebugCommands");

	@Override
	public void onInitialize() {
		CDebugCommand.register(ClientCommandManager.DISPATCHER);

		CDCLogger.info("ClientDebugCommands loaded");
	}
}
