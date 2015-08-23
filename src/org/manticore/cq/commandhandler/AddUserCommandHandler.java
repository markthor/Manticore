package org.manticore.cq.commandhandler;

import java.io.IOException;

import org.manticore.cq.command.AddUserCommand;
import org.manticore.cq.command.AddUserCommandResult;
import org.manticore.model.User;
import org.manticore.persistence.PersistenceManager;

public class AddUserCommandHandler extends CommandHandler {

	public static AddUserCommandResult execute(AddUserCommand c) {
		try {
			PersistenceManager.getInstance().createUser(new User(c.getName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AddUserCommandResult();
	}
}
