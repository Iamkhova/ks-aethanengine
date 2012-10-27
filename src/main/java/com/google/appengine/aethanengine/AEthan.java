package com.google.appengine.aethanengine;

public class AEthan
{
	Team homeTeam;
	Team awayTeam;
	GameStats stats;
	
	public AEthan(){
	// Initialize Class
		
	homeTeam = new Team();
	awayTeam = new Team();
	stats = new GameStats();
	
		
	}
	
	public void createTest(){
	// Create Sample Data Set To Run Test
		
		// Creating Two Teams for Test
		homeTeam.createTeam("Raleigh");
		awayTeam.createTeam("Cary");
		
	}
	
	public GameStats simGame(){
		 
		
		stats.homeTeamFinalScore = 5;
		stats.awayTeamFinalScore = 6;
		
		return this.stats;
	}
		
}