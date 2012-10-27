package com.google.appengine.aethanengine;

public class Main
{
   /**
   	 * @param args
   	 */
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

      AEthan game = new AEthan();
      GameStats stats;

      game.createTest();
      stats = game.simGame();

      System.out.println("Hello World");
      System.out.println(stats.awayTeamFinalScore);

   }

}