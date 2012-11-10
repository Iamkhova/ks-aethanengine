package com.google.appengine.aethanengine;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Class CDefensiveRating
 * Defensive Rating Stats for Player
 */
public class CDefensiveRating
{

   // Set Logger
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   // Primary Stats
   double catcher_ability;

   double catcher_arm;

   double infield_range;

   double infield_errors;

   double infield_arm;

   double doubleplay_ability;

   double outfield_range;

   double outfield_error;

   double outfield_arm;

   /*
    * Init Class
    */
   public CDefensiveRating()
   {
      catcher_ability = 0.0;
      catcher_arm = 0.0;
      infield_range = 0.0;
      infield_errors = 0.0;
      infield_arm = 0.0;
      doubleplay_ability = 0.0;
      outfield_range = 0.0;
      outfield_error = 0.0;
      outfield_arm = 0.0;
   }
   
   /*
    * Generate Random Values
    */
   public void generateValues()
   {
      
      Random generator = new Random();
           
      catcher_ability = generator.nextDouble() * 10.0;
      catcher_arm = generator.nextDouble() * 10.0;
      infield_range = generator.nextDouble() * 10.0;
      infield_errors = generator.nextDouble() * 10.0;
      infield_arm = generator.nextDouble() * 10.0;
      doubleplay_ability = generator.nextDouble() * 10.0;
      outfield_range = generator.nextDouble() * 10.0;
      outfield_error = generator.nextDouble() * 10.0;
      outfield_arm = generator.nextDouble() * 10.0;
      
      LOG.info("Random Stats Built)");
   }
}
