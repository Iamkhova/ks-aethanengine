package com.google.appengine.aethanengine;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;


/*
 * CPerson base class. Define basic attributes for all people in game.
 */
public class CPerson
{

   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());
   
   UUID humanID; // Unique ID for each person created in the game.. overkill?

   String firstName;

   String lastName;

   String nickname;

   int heightInches;

   int weightPounds;

   int date_of_birth; //TODO need to define completly

   int city_of_birth;

   int nationality;
   
   /*
    * Initalizing Class
    */
   public CPerson()
   {
      // Initalize Class
      LOG.info("Initalizing CPerson()");
      
      humanID = UUID.randomUUID();
      firstName = "ftest";
      lastName = "ltest";
      nickname = "ntest";
      heightInches = 0;
      weightPounds = 0;
      date_of_birth = 0;
      city_of_birth = 0;
      nationality = 0;
   }
   
   public void create()
   {
     createRandom();
   }
   
   /*
    * Create a Random Person
    */
   
   public void createRandom()
   {
     CUtil util = new CUtil();
     firstName = util.getName(0);
     lastName = util.getName(1);
     
      LOG.info("Person Created" + firstName + " " + lastName + " ID " + humanID);
     
      nickname = "ntest";
      heightInches = 72;
      weightPounds = 200;
      date_of_birth = 11;
      city_of_birth = 0;
      nationality = 0;
      
      LOG.info("Random stats Built)");
 
   }

}
