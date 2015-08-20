package org.manticore.cq.commandhandler;

import org.manticore.cq.command.Command;
import org.manticore.cq.command.CommandResult;

public interface CommandHandler {
	public CommandResult execute(Command c);
}
