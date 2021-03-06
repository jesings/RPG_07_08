/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/

// shorthand, used to read from CLI
import java.io.*;   
import java.util.*;

public class YoRPG
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Mage pat;   //Is it man or woman?
  private Monster smaug; //Friendly generic monster name?

  private int moveCount;
  private boolean gameOver;
  private int difficulty;
  private int mageType;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG()
  {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    precondition:  
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame()
  {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    } catch ( IOException e ) { }

    s = "\nChoose your mage: \n";
    s += "\t1: DarkMage\n";
    s += "\t2: GreyMage\n";
    s += "\t3: LightMage\n";
    s += "Selection: ";
    System.out.print( s );
    try {
	    mageType = Integer.parseInt( in.readLine() );
    } catch ( IOException e ) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    } catch ( IOException e ) { }

    //instantiate the player's character
    if (mageType==1){
	pat=new DarkMage(name);
    }
    else if(mageType==2){
	pat=new GreyMage(name);
    }
    else{
	pat=new LightMage(name);
    }
  
  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    @return the boolean value of
        "the player survives"
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2;
    int MErate=(int)(Math.random()*3);
    String spellNow = null;
    if ( Math.random() >= ( difficulty / 3.0 +0.2) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );
	    if(MErate==0){
		smaug = new Skeleton();
	    }
	    else if(MErate==1){
		smaug = new Wisp();
	    }
	    else{
		smaug = new Wraith();
	    }

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel special?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!\n\t3: Positively Magical!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        if ( i == 2 )
          pat.specialize();
        else{
          pat.normalize();
          if(i==3){
            try{
              if (pat.getMP() < 0)
                Integer.parseInt("43564fds");
              System.out.println("Cast thine spell!");
              for(int j = 0;j<3;j++)
                System.out.println(j + ": " + pat.spellBook[j]);
              spellNow = pat.spellBook[Integer.parseInt(in.readLine())];
            } catch(IOException e){} catch(Exception e){System.out.println("Invalid to cast a spell here");}

          }
        }
        if(i != 3)
          d1 = pat.attack( smaug );
        else if (!spellNow.equals("Healing") && !spellNow.equals("Buff")){
          d1 = pat.magicAttack(smaug,spellNow);
        }
        else{
          d1 = 0;
          System.out.println(pat.getName() + " has heal'd theirself for " + pat.magicSelf(spellNow) + " hit pointes.");
        }

        if (smaug.getEffect() != null){
          smaug.iterateDuration();
        if (smaug.getDuration() == 0){
          System.out.println("Ye olde monster is no longer " + smaug.getEffect());
          smaug.setEffect(null);
        }
        if (smaug.getEffect().equals("Poisoned")){
          smaug.lowerHP(8);
          System.out.println("Ye olde monster is poison'd and has lost 8 of its hit pointes. It is left with " + smaug.getHP() + "hit pointes.");
        }
        if (smaug.getEffect().equals("Stunned")){
          d2 = 0;
          System.out.println("Ye olde monster was stunn'd!");
        }
        else
          d2 = smaug.attack( pat );
        }
        else d2 = smaug.attack( pat );
        if (pat.getEffect() != null){
          pat.iterateDuration();
          if (pat.getDuration() == 0){
            pat.normalize();
            pat.setEffect(null);
            System.out.println(pat.getName() + " is no longer buff'd.");
          }
          else
            pat.buff();
        }

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage, " + smaug.getHP() + " pointes of healthe remain.");

        System.out.println( "\n" + "Ye Olde "+ smaug.monsterType +" smacked " + pat.getName() +
                            " for " + d2 + " points of damage, " + pat.getHP() + " pointes of healthe remain.");
        System.out.println(pat.getMP() + " pointes of magick remain.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde "+smaug.monsterType+" hath been slain!" );
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else
    
    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args )
  {
    // As usual, uncomment progressively in tiny steps

    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters < MAX_ENCOUNTERS ) {
        if ( !game.playTurn() )
            break;
        encounters++;
        System.out.println();
    }

    System.out.println( "Thy game doth be over." );
  }//end main

}//end class YoRPG
