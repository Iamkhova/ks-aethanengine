package com.google.appengine.aethanengine;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import com.google.appengine.aethanengine.AEthan;
import java.util.logging.Logger;

public class CAction
{
 // Implement Logging
private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
  

  public void actionPitchBall()
  {
    
  }
  
  public void actionScoutPlayer(CTeam team)
  {
    String opposingPlayerName;
    
    opposingPlayerName = team.player[0].firstName;
    LOG.info(opposingPlayerName);
    
    
  }

}