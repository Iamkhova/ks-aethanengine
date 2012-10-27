package com.google.appengine.aethanengine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

public class MainServlet extends HttpServlet
{

   private static final long serialVersionUID = 1L;
   private static final Logger LOG = Logger.getLogger(MainServlet.class.getName());

   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
   {

      LOG.info("Starting AEthanEngine ");
      resp.setContentType("text/plain");
      resp.getWriter().println("Starting AEthanEngine");
      AEthan game = new AEthan();
      GameStats stats;

      game.createTest();
      stats = game.simGame();
      
      LOG.info("AwayTeam: " + stats.awayTeamFinalScore);


   }

}