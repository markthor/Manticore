package org.manticore.cq;

import org.manticore.cq.command.AddUserCommand;
import org.manticore.cq.command.AddUserCommandResult;
import org.manticore.cq.commandhandler.AddUserCommandHandler;

public class CqFacade {
	private static CqFacade instance = new CqFacade();
	
	
	public static void main(String[] args) {
		AddUserCommand c = new AddUserCommand("Markt", "Mr");
		getInstance().execute(c);
	}
	
	public AddUserCommandResult execute(AddUserCommand c) {
		return AddUserCommandHandler.execute(c);
	}
	
	public static CqFacade getInstance() {
		return instance;
	}
}
