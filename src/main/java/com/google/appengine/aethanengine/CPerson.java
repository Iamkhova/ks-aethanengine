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
   
   /*
    * Create a Random Person
    */
   public void createRandom()
   {
     CUtil util = new CUtil();
     int randomNumber = util.randomInt(10);
     
  // Build Random Teams and Names   
        switch (randomNumber) {
            case 0:  firstName = "Kareem";
                     break;
            case 1:  firstName = "Rahed";
                     break;
            case 2:  firstName = "Raishad";
                     break;
            case 3:  firstName = "Darius";
                     break;
            case 4:  firstName = "Stephen";
                     break;
            case 5:  firstName = "Owen";
                     break;
            case 6:  firstName = "James";
                     break;
            case 7:  firstName = "John";
                     break;
            case 8:  firstName = "Jack";
                     break;
            case 9:  firstName = "Arthur";
                     break;
            default: firstName = "Error";
                     LOG.severe("Bad Random Number" + randomNumber);
                     break;        
                     }
            LOG.info("Random First Name Built)");
       randomNumber = util.randomInt(10);
       
         switch (randomNumber) {
            case 0:  lastName = "Glover";
                     break;
            case 1:  lastName = "Neal";
                     break;
            case 2:  lastName = "Webb";
                     break;
            case 3:  lastName = "Johnson";
                     break;
            case 4:  lastName = "James";
                     break;
            case 5:  lastName = "Simpson";
                     break;
            case 6:  lastName = "Castle";
                     break;
            case 7:  lastName = "Diamond";
                     break;
            case 8:  lastName = "Fucner";
                     break;
            case 9:  lastName = "Cario";
                     break;
            default: lastName = "Error";
                     LOG.severe("Last Name Bad Random Number" + randomNumber);
                     break;        
                     }
      LOG.info("Random last Name Built)");
      LOG.info("Player Created" + firstName + " " + lastName + " ID " + humanID);
     
      nickname = "ntest";
      heightInches = 72;
      weightPounds = 200;
      date_of_birth = 11;
      city_of_birth = 0;
      nationality = 0;
      
      LOG.info("Random stats Built)");
 
   }

}
