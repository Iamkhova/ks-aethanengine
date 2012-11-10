package com.google.appengine.aethanengine;

import com.google.appengine.aethanengine.MainServlet;

import java.util.Random;
import java.util.logging.Logger;

/*
 * Handels Offensive Ratings
 */
public class COffensiveRating
{

   // Set up Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   double contact;

   double gap;

   double power;

   double eye;

   double avoidK;

   double runningSpeed;

   double stealingBases;

   double baseRunning;

   double sacrificeBunt;

   double buntForHit;

   int hitterType;

   /*
    * Init the class
    */
   public COffensiveRating()
   {
      contact = 0.0;
      gap = 0.0;
      power = 0.0;
      eye = 0.0;
      avoidK = 0.0;
      runningSpeed = 0.0;
      stealingBases = 0.0;
      baseRunning = 0.0;
      sacrificeBunt = 0.0;
      buntForHit = 0.0;
      hitterType = 0;
   }

   /*
    * Generate Random Values
    */
   public void generateValues()
   {

      Random generator = new Random();
      contact = generator.nextDouble() * 10.0;
      gap = generator.nextDouble() * 10.0;
      power = generator.nextDouble() * 10.0;
      eye = generator.nextDouble() * 10.0;
      avoidK = generator.nextDouble() * 10.0;
      runningSpeed = generator.nextDouble() * 10.0;
      stealingBases = generator.nextDouble() * 10.0;
      baseRunning = generator.nextDouble() * 10.0;
      sacrificeBunt = generator.nextDouble() * 10.0;
      buntForHit = generator.nextDouble() * 10.0;
      
      LOG.info("Random Stats Built)");

   }

}
