package com.google.appengine.aethanengine;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;

public class CBall
{
   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
   

public class BallDirection
{
  double strikeZoneX;
  double strikeZoneY;
  int ballThrowDirection;
  
}
   UUID ballID;
   double velocityMPH;
   double spin;
   BallDirection zone = new BallDirection();
      
   public CBall()
   {
      // Initalize Class
      LOG.info("Initalizing CBall()");
      ballID = UUID.randomUUID();
      velocityMPH = 0.0;
      spin = 0.0;
      zone.strikeZoneX = 0.0;
      zone.strikeZoneY = 0.0;
      int ballThrowDirection = 0;      
   }
}