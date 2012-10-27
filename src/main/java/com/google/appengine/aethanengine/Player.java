package com.google.appengine.aethanengine;

/**
 * <p>
  * This is class for each of the Player models in the game.
  * </p>
  */
public class Player extends Person
{
   Traits traits; // Player Traits

   OffensiveRating offenseSkill; // Player's offensive skills

   HittingSkills hitSkill; // Player's Hitting skills

   PitchingSkills pitchSkill; // Player's Pitching skills

   FielderSkills fieldSkill; // Player's Fielding skills

   /*
    * Initialize Player Object
    */
   public Player()
   {

      traits = new Traits();
      offenseSkill = new OffensiveRating();

   }

   /*
    * Create Sample Random Player
    */
   public void createPlayer(String _name)
   {

      first_name = _name;
      last_name = _name;

      traits.setRandom();
      offenseSkill.setRandom();

   }
}

/**************************************************************************/
/* CLASS STRUCTS														  */
/**************************************************************************/

/**
 * <p>
  * This is class for each of the Player Trait Ratings in the game.
  * </p>
  */
 class Traits
{

   int loyalty; // Defines the Loyalty of a Player

   int must_win; // Defines the player's desire to be part of a winning setup

   int leader_ability; // Ability to raise the level of players around them

   int clutch_performance; // Ability to perform when the game is on the line

   int consistency; // How reliable is the player

   /*
    * Produce Random  Traits
    */
   public void setRandom()
   {
      loyalty = 10;
      must_win = 10;
      leader_ability = 10;
      clutch_performance = 10;
      consistency = 10;

   }

}

/**
 * <p>
  * This is class for each of the Player Offensive Rating Skills in the game.
  * </p>
  */
 class OffensiveRating
{

   int running_speed; // Defines how fast the player runs around the bases

   int stealing_ability; // Defines player talent to steal bases

   int running_instincts; // Defines success rate at stealing bases

   int sacrifice_bunt; // Ability to bunt in sacrifice situations

   int bunt_for_hit; // Ability to drag bunt for a base hit

   int hitter_type; // Determines if a hitter pulls the ball or sprays it over the field

   /*
    * Produce Random Stats for Offensive Rating
    */
   public void setRandom()
   {
      running_speed = 10;
      stealing_ability = 10;
      running_instincts = 10;
      sacrifice_bunt = 10;
      bunt_for_hit = 10;
      hitter_type = 10;

   }

}

/**
 * <p>
  * This is class for each of the Player Hitting Rating Skills in the game.
  * </p>
  */
 class HittingSkills
{

   int contact_vs_right; // Defines contact vs right hand pitchers

   int power_vs_right; // Defines power vs right hand pitchers

   int contact_vs_left; // Defines contact vs left hand pitchers

   int power_vs_left; // Defines power vs right hand pitchers

   int speed; // Defines Bat Swing Speed TODO Review if needed

   int energy; // Defines player hitting energy
 }

/**
 * <p>
  * This is class for each of the Player Pitching Rating Skills in the game.
  * </p>
  */
 class PitchingSkills
{

   int velocity; // Defines pitching velocity

   int movement; // Define pitchers pitching movement

   int control; // Define pitchers control

   int endurance; // Define pitching endurance

   int energy; // Define pitching energy

}

/**
 * <p>
  * This is class for each of the Player Fielding Rating Skills in the game.
  * </p>
  */
 class FielderSkills
{

   int range; // Defines player range

   int arm; // Defines player arm strength

   int fielding; // Defines player fielding ability
 }

/**
 * <p>
  * This is class for each of the Player Positional Rating Skills in the game.
  * </p>
  */
 class PositionalSkills
{

   int pitcher; // Pitcher Skills TODO Might need to break up into Closer etc..

   int firstbase; // Firstbase Skills

   int secondbase; // Secondbase Skills

   int thirdbase; // Thirdbase Skills

   int catcher; // Catcher Skills

   int rightfield; // Rightfield Skills

   int leftfield; // Leftfield Skills

   int centerfield; // Centerfield Skills

}
