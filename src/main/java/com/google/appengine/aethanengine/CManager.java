package com.google.appengine.aethanengine;

import com.google.appengine.aethanengine.CPlayer;
import com.google.appengine.aethanengine.CTeam;
import com.google.appengine.aethanengine.GameStats;
import com.google.appengine.aethanengine.MainServlet;

import java.util.logging.Logger;
import com.google.appengine.aethanengine.MainServlet;
import com.google.appengine.aethanengine.AEthan;

import java.util.ArrayList;
import java.util.logging.Logger;

/*
 * CManager Class
 * This is the Baseball Team Manager/Coach and controls stragety AI
 */
public class CManager extends CPerson
{
   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
    

////////////////////////////////////////////////////////////////////////////////////
//////////////// AI FUNCTIONS //////////////////////////////////////////////////////
   /*
    * Manager Higher Level Brain Function
    */    
   public void aiGameAction(int value, CTeam team)
   {
     switch (value)
     {
       case AEthan.AI_DETERMINE_BATTING_ORDER:
             brain.aiDetermineBattingOrder(team);
       break;
       case AEthan.AI_DETERMINE_FIELDING:
             brain.aiDetermineFielding(team);
       default:
       break;
     }
   } 
  
}
