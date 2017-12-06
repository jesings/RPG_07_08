public class Wisp extends Monster{
    protected int magic;
    public Wisp(){
	super();
	monsterType="Wisp";
	HP -= 50;
	strength=(int)(Math.random()*5);
	defense -= 10;
	magic =(int)(Math.random()*10+5);
	magicDef += 10;
    }
        public String toString(){
	    return super.toString()+
		"Magic Attack: "+ magic + System.lineSeparator();
    }
}
