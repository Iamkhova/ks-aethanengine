package com.google.appengine.aethanengine;
import java.util.logging.Level;
import java.util.logging.Logger;



public class AEthan
{

private static final Logger LOG = Logger.getLogger(
MainServlet.class.getName());

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
		 
		LOG.info("Simming Game... ");
  
		stats.homeTeamFinalScore = 5;
		stats.awayTeamFinalScore = 6;
		
		return this.stats;
	}
		
}