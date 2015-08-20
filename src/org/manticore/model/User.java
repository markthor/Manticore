package org.manticore.model;

public class User {
	private String name;
	private String salutation;
	private static final String DEFAULT_SALUTATION = "Mr";
	
	public User(String name) {
		this.name = name;
		this.salutation = DEFAULT_SALUTATION;
	}
	
	public User(String name, String salutation) {
		this.name = name;
		this.salutation = salutation;
	}
}
