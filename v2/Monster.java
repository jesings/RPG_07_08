//Made by Matthew Ming and Jonathan Singer
public class Monster extends Character{
    protected String monsterType;
    public Monster(){
     HP=(int)Math.random()*100+100;
     strength=(int)Math.random()*45+30;
     defense=(int)Math.random()*20+5;
     attack=Math.random()*2.5;
     magicDef=(int)Math.random()*25;
     monsterType="Monster";
    }
    public String toString(){
	return monsterType+System.lineSeparator()
	    + "HP: " + HP + System.lineSeparator()+
	    "Attack: "+ strength + System.lineSeparator()+
	     "Defense: "+ defense + System.lineSeparator()+
	    "Magic Defense: "+ magicDef + System.lineSeparator()+
	    "Attack Modifier: "+ attack + System.lineSeparator();
    }
 }
 
