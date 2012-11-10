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
}