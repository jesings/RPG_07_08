public class Wraith extends Monster{
    protected int magic;
    public Wraith(){
	super();
	monsterType="Wraith";
	HP += 10; 
	strength -= (int)Math.random()*15;
	defense -= 10;
	magic =(int)Math.random()*20+15;
	magicDef += 25;
    }
    public String toString(){
	    return super.toString()+
		"Magic Attack: "+ magic + System.lineSeparator();
    }
}
