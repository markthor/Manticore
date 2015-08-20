package org.manticore.cq.commandhandler;

import org.manticore.cq.command.AddUserCommand;
import org.manticore.cq.command.AddUserCommandResult;
import org.manticore.persistence.PersistenceManager;

public class AddUserCommandHandler extends CommandHandler {

	public AddUserCommandResult execute(AddUserCommand c) {
		PersistenceManager.getInstance().createUser(new User(c.)
		return new AddUserCommandResult();
	}
}
