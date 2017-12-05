//Made by Matthew Ming and Jonathan Singer
public class Monster extends Character{
    public Monster(){
     HP=(int)Math.random()*100+100;
        strength=(int)Math.random()*45+30;
     defense=(int)Math.random()*20+5;
     attack=Math.random()*2.5;
    }
    public String toString(){
	return "This is a monster."+System.lineSeparator()+ "HP: "+HP+System.lineSeparator()+ strength+" attack "+System.lineSeparator()+" attack "+" attack.";
    }
 }
 
