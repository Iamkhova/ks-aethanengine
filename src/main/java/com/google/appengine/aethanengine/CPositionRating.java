package com.google.appengine.aethanengine;

import com.google.appengine.aethanengine.MainServlet;

import java.util.Random;
import java.util.logging.Logger;

/*
 * Class CPositionRating
 * Position Rating Stats for Player
  */
public class CPositionRating
{
   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   double position_pitcher;

   double position_catcher;

   double position_firstbase;

   double position_secondbase;

   double position_thirdbase;

   double position_shortstop;

   double position_leftfield;

   double position_centerfield;

   double position_rightfield;

   /*
    * Init Class
    */
   public CPositionRating()
   {
      position_pitcher = 0.0;
      position_catcher = 0.0;
      position_firstbase = 0.0;
      position_secondbase = 0.0;
      position_thirdbase = 0.0;
      position_shortstop = 0.0;
      position_leftfield = 0.0;
      position_centerfield = 0.0;
      position_rightfield = 0.0;
   }

   /*
    * Generate Random Values
    */
   public void generateValues()
   {

      Random generator = new Random();

      position_pitcher = generator.nextDouble() * 10.0;
      position_catcher = generator.nextDouble() * 10.0;
      position_firstbase = generator.nextDouble() * 10.0;
      position_secondbase = generator.nextDouble() * 10.0;
      position_thirdbase = generator.nextDouble() * 10.0;
      position_shortstop = generator.nextDouble() * 10.0;;
      position_leftfield = generator.nextDouble() * 10.0;
      position_centerfield = generator.nextDouble() * 10.0;
      position_rightfield = generator.nextDouble() * 10.0;
      
      LOG.info("Random Stats Built)");

     
   }

}
