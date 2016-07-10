/*
 *CAIlogic.java
 *Authored: IAMKHOVA
 */


package com.google.appengine.aethanengine;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import com.google.appengine.aethanengine.COffensiveRating;
import com.google.appengine.aethanengine.CDefensiveRating;
import com.google.appengine.aethanengine.AEthan;

/*
 * CAIlogic Handels Game Logic Routines
 */
public class CAIlogic
{

  //STRUCTS

  class Fielding {
    String pitcher = new String();
    String firstBaseman = new String();
    String secondBaseman= new String();
    String thirdBaseman= new String();
    String catcher= new String();
    String shortstop= new String();
    String rightFielder= new String();
    String leftFielder= new String();
    String centerFielder= new String();
   
 }
 
   // This part of the brain stores the player feedback after scouting another player. Used mostly for Pitcher/Batter scenaories
   class PlayerScouted {
 
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
     }

     // Declaring Thought Structure Here
    Fielding thoughts_fielding = new Fielding();
    ArrayList thoughts_currentbattingorder = new ArrayList();
    PlayerScouted thoughts_playerScouted = new PlayerScouted(); // Set up thoughts to store scouted player info
  
    /** Thoughts for next pitch type */
    int thoughts_nextPitch = 0;
    
    /** Thoughts for strike zone X coordinates */
    int thoughts_strikezoneX= 0;
  
    /** Thoughts for strike zone Y coordinates */
    int thoughts_strikezoneY = 0;
    

  // Implement Logging
   private static final Logger LOG = Logger.getLogger(CAIlogic.class.getName());
   
   /*********************************************************************************************************************************************
    * AI To Determine Batting Order
    */
   public void aiDetermineBattingOrder(CTeam team)
   {
      LOG.info("AI.. DetermineBattingOrder");

      //TODO Batting Order set First to Last.. no logic here now
      for (int x = 0; x < 10; x++)
      {
         thoughts_currentbattingorder.add(team.player[x].humanID.toString());
      }

      //Logging
      LOG.info("Batting Order: " + thoughts_currentbattingorder);
      

   }
   
   /********************************************************************************************************************************************
    * AI To Determine Fielding
    */
   public void aiDetermineFielding(CTeam team)
   {
     LOG.info("AI.. DetermineFielding");
     
     //TODO put together some real logic code.. right now first in first out
     thoughts_fielding.pitcher = team.player[0].humanID.toString();
     thoughts_fielding.firstBaseman = team.player[1].humanID.toString();
     thoughts_fielding.secondBaseman = team.player[2].humanID.toString();
     thoughts_fielding.thirdBaseman = team.player[3].humanID.toString();
     thoughts_fielding.catcher = team.player[4].humanID.toString();
     thoughts_fielding.shortstop = team.player[5].humanID.toString();
     thoughts_fielding.rightFielder = team.player[6].humanID.toString();
     thoughts_fielding.leftFielder = team.player[7].humanID.toString();
     thoughts_fielding.centerFielder = team.player[8].humanID.toString();
     
     LOG.info("AI.. Fielding thinking done.");

   }
   
   /*
    * AI to Handle Pitching
    */
    public void aiActionDeterminePitch(CTeam team)
    {
      boolean pitch = false;
      double pcontact;
      double pgap;
      double ppower;
      double peye;
      double pbaserunning;
    
      LOG.info("AI.. Determine Pitching");
      
      // TODO Examine Field for base runner to abort out of pitch
      // this needs to be set up as a loop
      pitch = true;
      
      //TODO Examine Batter   
      
    }
    
     /*
      * We ante to look at player and store the intepertation of stats
      */
    public void aiScoutPlayer(CTeam team, int playerid)
    {
        // Right now we handel perfect scouting. Later on will have to add some degraded logic based on skill.
        // I'm thinking of something along how many times the person has played against the other person, if 
        // they have been on the same team or not, and if they spent any time in pre-game stuff
        
        thoughts_playerScouted.contact = team.player[playerid].offensiveRating.getContact();
        thoughts_playerScouted.gap = team.player[playerid].offensiveRating.getGap();
        thoughts_playerScouted.power = team.player[playerid].offensiveRating.getPower();
        thoughts_playerScouted.eye = team.player[playerid].offensiveRating.getEye();
        thoughts_playerScouted.avoidK = team.player[playerid].offensiveRating.getAvoidK();
        thoughts_playerScouted.runningSpeed = team.player[playerid].offensiveRating.getRunningSpeed();
        thoughts_playerScouted.stealingBases = team.player[playerid].offensiveRating.getStealingBases();
        thoughts_playerScouted.baseRunning = team.player[playerid].offensiveRating.getBaseRunning();
        thoughts_playerScouted.sacrificeBunt = team.player[playerid].offensiveRating.getSacrificeBunt();
        thoughts_playerScouted.buntForHit = team.player[playerid].offensiveRating.getBuntForHit();
        thoughts_playerScouted.hitterType = team.player[playerid].offensiveRating.getHitterType();
        
        LOG.info("AI.. Player Scouted. Player Contact:" + thoughts_playerScouted.contact);
      
    }
    
    /*
     * Choose Pitch
     */
    public void aiChoosePitch()
    {
    
      //Lets start off with two pitches and simple equation.. Four Seam Fastball and "Normal"
      //If contact > 5 then normal.. if less then 5 then faseball
      // 1 = Four Seam Fastball 2 = Normal
      
      if (thoughts_playerScouted.contact > 5)
       {
          thoughts_nextPitch = 2;
          LOG.info("Pitching Normal Ball. Batter Contact :" + thoughts_playerScouted.contact);
        }else
        {
          thoughts_nextPitch = 1;
          LOG.info("Pitching Four Seam Fast Ball. Batter Contact :" + thoughts_playerScouted.contact);
        }
      
      
      
      
    }
    
   /**
   * This is the logic that helps determine where the player wants to pitch the ball.
   * The accuracy of their pitch will be determine by the player's control stats. 
   * @param args Unused.
   * @return Nothing.
   */ 
   public void aiChoosePitchLocation()
     {
     
     //For right now lets just say that the player always wants to throw a strike.
     //Stirike zone is 0,100,200 so the middle would be 100,00
     //TODO seems this would work better with a vector system.
     
     thoughts_strikezoneX = 100;
     thoughts_strikezoneY = 100;
     
     
   }

}