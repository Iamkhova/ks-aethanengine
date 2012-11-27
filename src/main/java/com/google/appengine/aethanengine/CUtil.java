package com.google.appengine.aethanengine;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

import com.google.appengine.api.files.AppEngineFile;
import com.google.appengine.api.files.FileReadChannel;
import com.google.appengine.api.files.FileService;
import com.google.appengine.api.files.FileServiceFactory;
import com.google.appengine.api.files.FileWriteChannel;
import com.google.appengine.api.files.GSFileOptions.GSFileOptionsBuilder;

import java.util.Random;



/*
 * Utility Class for helping develop structure
 */
public class CUtil
{

 // Implement Logging
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   /*
    * Random Integer Generator
    * Not sure if this is still needed
    */
   public int randomInt(int maxNumber)
   {
      Random randomGenerator = new Random();
      int random = randomGenerator.nextInt(maxNumber);

      return random;

   }

   /*
    * TODO build loadXML Class
    */
   public void loadXML()
   {
      // Load XML from Cloud
   }

   /*
    * This is test Datastore Code
    */
   public void addFirstName()
   {
      DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
      Entity ePerson = new Entity("FirstNameEntity");
      ePerson.setProperty("firstName", "Kareem");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Rahed");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Raishad");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Darius");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Christian");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Owen");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Zackary");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Stephen");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Jay");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Marshal");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Frank");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Foster");
      ePerson.setProperty("ISO", "USA");
      ePerson.setProperty("firstName", "Ryan");
      ePerson.setProperty("ISO", "USA");

      datastore.put(ePerson);
   }
   
   /*
    * Returns Name (NameType, Race)
    */
   public String getName(int namePos)
   {
     String name = new String();
     
     int randomNumber = randomInt(10);
  
     if (namePos == 0) // First Name
     {
        // Build Random Teams and Names   
        switch (randomNumber) {
            case 0:  name = "Kareem";
                     break;
            case 1:  name = "Rahed";
                     break;
            case 2:  name = "Raishad";
                     break;
            case 3:  name = "Darius";
                     break;
            case 4:  name = "Stephen";
                     break;
            case 5:  name = "Owen";
                     break;
            case 6:  name = "James";
                     break;
            case 7:  name = "John";
                     break;
            case 8:  name = "Jack";
                     break;
            case 9:  name = "Arthur";
                     break;
            default: name = "Error";
                     LOG.severe("Bad Random Number" + randomNumber);
                     break;        
                     }
            LOG.info("Random First Name Built)");
   }else{
   
      switch (randomNumber) {
            case 0:  name = "Glover";
                     break;
            case 1:  name = "Neal";
                     break;
            case 2:  name = "Webb";
                     break;
            case 3:  name = "Johnson";
                     break;
            case 4:  name = "James";
                     break;
            case 5:  name = "Simpson";
                     break;
            case 6:  name = "Castle";
                     break;
            case 7:  name = "Diamond";
                     break;
            case 8:  name = "Fucner";
                     break;
            case 9:  name = "Cario";
                     break;
            default: name = "Error";
                     LOG.severe("Last Name Bad Random Number" + randomNumber);
                     break;        
                     }
      LOG.info("Random last Name Built)");
     
   }
     
     return name;
   }
}