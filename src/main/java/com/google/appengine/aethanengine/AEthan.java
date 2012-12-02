package com.google.appengine.aethanengine;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * AEthan Engine
 */
public class AEthan
{

   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
   

   
   //////////////////////////////////////////////////////////////////////////////////
   /////////////////////CONSTANTS
   //////////////////////////////////////////////////////////////////////////////////
   // public enum GameAI {AI_DETERMINE_BATTING_ORDER, AI_DETERMINE_FIELDING};
   //TODO Replace Constants with enums or something better
   public static final int AI_DETERMINE_BATTING_ORDER = 0;
   public static final int AI_DETERMINE_FIELDING = 1;

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
      
      //Manager AI Test
      homeTeam.manager.aiGameAction(AI_DETERMINE_BATTING_ORDER,homeTeam);
      awayTeam.manager.aiGameAction(AI_DETERMINE_BATTING_ORDER,awayTeam);
      homeTeam.manager.aiGameAction(AI_DETERMINE_FIELDING,homeTeam);
      awayTeam.manager.aiGameAction(AI_DETERMINE_FIELDING,awayTeam);
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
