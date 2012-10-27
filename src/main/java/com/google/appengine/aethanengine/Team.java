package com.google.appengine.aethanengine;

/**
 * <p>
 * This is the base class for each Person modeled in the game universe
 * </p>
 */
public class Team {

/**************************************************************************/
/* VARIABLES															  */
/**************************************************************************/
	
	//Constants
	final int ROSTERSIZE = 10; //MaxTeam Size TODO Will make RosterSize Dynamic
	
	// Variables
	String team_city; // Team City Name
	Player[] player = new Player[ROSTERSIZE];
	
/**************************************************************************/
/* METHODS																  */
/**************************************************************************/

	/*
	 * Set Team Data
	 */
	public void setTeamName(String city, String nickname){
		
		team_city = city;
	}
	
	/*
	 * Create Sample Team
	 */
	public void createTeam(String _teamCity){
		
		team_city = _teamCity;
		
		for (int x = 0; x < ROSTERSIZE; x++){
			// Create Players for Team;
			player[x] = new Player();
			player[x].createPlayer("Joe");
			
		}
		
		
		
	}
		
}
