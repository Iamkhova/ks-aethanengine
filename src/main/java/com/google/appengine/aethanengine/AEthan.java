package com.google.appengine.aethanengine;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AEthan
{

   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   CTeam homeTeam;
   CTeam awayTeam;
   GameStats stats;
   CPlayer home1;
   CPlayer home2;

   /*
    * Initalize Vlass
    */
   public AEthan()
   {
	    // Initialize Class
		
	    homeTeam = new CTeam();
	    awayTeam = new CTeam();
	    stats = new GameStats();
    }

    /*
     * Create Two Teams for Testing
     */  
    public void createTest()
    {
		  homeTeam.createTeam("Raleigh", "Storm");
      LOG.info("Home Team Created");

		  awayTeam.createTeam("Cary", "WildCats");
		
      LOG.info("Away Team Created");
    }
	
	/*
   * Siming GameStats
   */
   public GameStats simGame()
   {
		 	LOG.info("Simming Game... ");
  
		    stats.homeTeamFinalScore = 5;
	      stats.awayTeamFinalScore = 6;
		
		return this.stats;
	 }
 
  /*
   * getBenchTeam
   * Pulls players and assign them to bench
   * bench has 10 players
   */
  private void getBenchTeam(CTeam team)
  {
  
    home1 = team.player[0]; 
    
  }
		
}
