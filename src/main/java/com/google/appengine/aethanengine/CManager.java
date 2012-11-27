package com.google.appengine.aethanengine;

import com.google.appengine.aethanengine.CPerson;
import com.google.appengine.aethanengine.CTeam;
import com.google.appengine.aethanengine.MainServlet;

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

   //Brain Code
   //These are all the logic thoughts the manager has floating in his head
   ArrayList thoughts_BattingOrder = new ArrayList();


////////////////////////////////////////////////////////////////////////////////////
//////////////// AI FUNCTIONS //////////////////////////////////////////////////////
   /*
    * AI To Determine Batting Order
    */
   public void aiDetermineBattingOrder(CTeam team)
   {
      LOG.info("AI.. DetermineBattingOrder");

      //Batting Order set First to Last.. no logic here now
      for (int x = 0; x < 10; x++)
      {
         thoughts_BattingOrder.add(team.player[x].humanID.toString());
      }

      //Logging
      LOG.info("Batting Order: " + thoughts_BattingOrder);

   }

}
