package com.google.appengine.aethanengine;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * AEthan Engine
 */
public class AEthan {

	private static final Logger LOG = Logger.getLogger(MainServlet.class
			.getName());

	// ////////////////////////////////////////////////////////////////////////////////
	// ///////////////////CONSTANTS
	// ////////////////////////////////////////////////////////////////////////////////
	// public enum GameAI {AI_DETERMINE_BATTING_ORDER, AI_DETERMINE_FIELDING};
	// TODO Replace Constants with enums or something better
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
	public AEthan() {
		// Initialize Class

		homeTeam = new CTeam();
		awayTeam = new CTeam();
		stats = new GameStats();

	}

	/*
	 * Create Two Teams for Testing
	 */
	public void createTest() {

		homeTeam.createTeam("Raleigh", "Storm");
		LOG.info("Home Team Created");

		awayTeam.createTeam("Cary", "WildCats");

		LOG.info("Away Team Created");

		// Manager AI Test
		homeTeam.manager.aiGameAction(AI_DETERMINE_BATTING_ORDER, homeTeam);
		awayTeam.manager.aiGameAction(AI_DETERMINE_BATTING_ORDER, awayTeam);
		homeTeam.manager.aiGameAction(AI_DETERMINE_FIELDING, homeTeam);
		awayTeam.manager.aiGameAction(AI_DETERMINE_FIELDING, awayTeam);

	}

	/*
	 * =0 Siming GameStats
	 */
	public GameStats simGame() {

		LOG.info("Simming Game... ");

		stats.homeTeamFinalScore = 5;
		stats.awayTeamFinalScore = 6;

		return this.stats;
	}

	/*
	 * getBenchTeam Pulls players and assign them to bench bench has 10 players
	 */
	private void getBenchTeam(CTeam team) {

		home1 = team.player[0];

	}

	/*
	 * advanceInningHalf Advances game a hald inning
	 */
	private void advanceInningHalf() {
		stats.inning += 0.05;
		LOG.info("Advanced half inning");
	}

	/*
	 * resetInning Resets Inning data back to default
	 */
	private void resetInning() {
		stats.currentBalls = 0;
		stats.currentStrikes = 0;
		stats.currentOuts = 0;
		LOG.info("Inning stats reset");

	}
	
	/*
	 * addBall
	 */
	private void addBall() {
		stats.currentBalls += 1;
		LOG.info("Balls increase.")
	}
	
	/*
	 * addStrike
	 */
	private void addStrike() {
		stats.CurrentStrikes +=1 ;
		LOG.info("Strikes increase.")
	}
	
	/*
	 * addOut
	 */
	private void addOut() {
		stats.CurrentOuts +=1;
		LOG.info("Outs increase.")
	
	}
	
	/*
	 * testSimSession simulate in game session
	 */
	private void testSimHalfInning()
	{
		CUtil util = new CUtil();
		
		if (util.teamAtbat(inning) == true)
		{
			LOG.info("Home Team at bat");
		}else
		{
			LOG.info("Away Team at bat.")
		}
	}

}
