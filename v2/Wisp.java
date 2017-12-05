public class Wisp extends Monster{
    protected int magic;
    public Wisp(){
	HP=(int)Math.random()*50+50;
	strength=(int)Math.random()*5;
	defense=(int)Math.random()*20+5;
	magic =(int)Math.random()*10+5;
	magicDef=(int)Math.random()*20+10;
    }
}
