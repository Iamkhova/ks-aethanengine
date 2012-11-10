package com.google.appengine.aethanengine;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Class CPitchRating
 */
public class CPitchRating
{

   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   double stuff;

   double movement;

   double control;

   double stamina;

   double hold_runners;

   int groundball;

   int velocity;

   /*
    * Init Class
    */
   public void CPitchRating()
   {
      stuff = 0.0;
      movement = 0.0;
      control = 0.0;
      stamina = 0.0;
      hold_runners = 0.0;
      groundball = 0;
      velocity = 0;
   }

   /*
    * Generate Random Values for Class
    */
   public void generateValues()
   {
      Random generator = new Random();
      stuff = generator.nextDouble() * 10.0;
      movement = generator.nextDouble() * 10.0;
      control = generator.nextDouble() * 10.0;
      stamina = generator.nextDouble() * 10.0;
      hold_runners = generator.nextDouble() * 10.0;
      groundball = 10;
      velocity = 5;

      LOG.info("Random Stats Built");

   }
}
