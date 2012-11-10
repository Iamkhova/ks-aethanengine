package com.google.appengine.aethanengine;

import com.google.appengine.aethanengine.CDefensiveRating;
import com.google.appengine.aethanengine.COffensiveRating;
import com.google.appengine.aethanengine.CPerson;
import com.google.appengine.aethanengine.CPitchRating;
import com.google.appengine.aethanengine.CPositionRating;
import com.google.appengine.aethanengine.MainServlet;

import java.util.logging.Logger;

/*
 * CPlayer Class
 */
public class CPlayer extends CPerson
{
   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   int playerID;

   int bats;

   int throwing;

   CDefensiveRating defensiveRating = new CDefensiveRating() ;

   CPositionRating positionalRating = new CPositionRating() ;

   COffensiveRating offensiveRating = new COffensiveRating();

   CPitchRating pitchingRating = new CPitchRating();

   /*
     * Create Sample Random Player
     */
   public void createPlayer()
   {

      createRandom();
      LOG.info("Defensive Rating Generating");
      defensiveRating.generateValues();
      LOG.info("Offensive Rating Generating");
      offensiveRating.generateValues();
      LOG.info("Positional Rating Generating");
      positionalRating.generateValues();
      LOG.info("Pitching Rating Generating");
      pitchingRating.generateValues();
      
      LOG.info("All Ratings Generated");


        }
 
}
