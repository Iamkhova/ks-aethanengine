package com.google.appengine.aethanengine;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;

public class CBall
{
   // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
   
   UUID ballID;
   int speed;
   int direction;
   int type;
   int state;
   
   public CBall()
   {
      // Initalize Class
      LOG.info("Initalizing CBall()");
      
      ballID = UUID.randomUUID();
      speed = 0;
      direction = 0;
      type = 0;
      state = 0;     
   }
}