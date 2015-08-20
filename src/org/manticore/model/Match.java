package org.manticore.model;

public class Match {
	private User winner;
	private User loser;
	
	public Match(User winner, User loser) {
		this.winner = winner;
		this.loser = loser;
	}
}
