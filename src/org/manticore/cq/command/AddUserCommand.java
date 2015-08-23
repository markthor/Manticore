package org.manticore.cq.command;

public class AddUserCommand extends Command {
	private String name;
	private String salutation;
	
	public AddUserCommand(String name, String salutation) {
		this.name = name;
		this.salutation = salutation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
}
