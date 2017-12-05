public class Wraith extends Monster{
    protected int magic;
    public Wraith(){
	monsterType="Wraith";
	HP=(int)Math.random()*100+100;
	strength=(int)Math.random()*15;
	defense=(int)Math.random()*20+5;
	magic =(int)Math.random()*20+15;
	magicDef=(int)Math.random()*30+15;
    }
    public String toString(){
	    return super.toString()+
		"Magic Attack: "+ magic + System.lineSeparator();
    }
}
