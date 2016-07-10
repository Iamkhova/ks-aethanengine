package com.google.appengine.aethanengine;
import java.util.logging.Logger;

public class CTeam
{
   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
   
   int teamID;
   String teamName;
   String teamName2;
   CPlayer[] player = new CPlayer[10];
 //TODO This is Temp Roster Size
   public CManager manager = new CManager();
    
   
   public CTeam()
   {
     teamID = 0;
     teamName = "";
     teamName2 = "";
   }
   
   public void createTeam(String name1, String name2)
   {
    LOG.info("Creating Team");

    teamName = name1;
    teamName2 = name2;
    
    for (int x = 0; x < 10; x++){
			  // Create Players for Team;
        LOG.info("Player About to be born");
		  	player[x] = new CPlayer();
		    player[x].testCreate();
        LOG.info("Player Born : " + x);

			
}
   
   // Create Manager For Team
       manager.testCreate();
   
   LOG.info("Team Created");


   }
   
 }



