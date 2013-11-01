package com.google.appengine.aethanengine;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;

public class CBall
{
   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
   

public class BatZone
{
  int left;
  int right;
  
}
   UUID ballID;
   double velocityMPH;
   double spin;
   BatZone zone = new BatZone();
      
   public CBall()
   {
      // Initalize Class
      LOG.info("Initalizing CBall()");
      ballID = UUID.randomUUID();
      velocityMPH = 0.0;
      spin = 0.0;
      zone.left = 0;
      zone.right = 0;      
   }
}