public class Skeleton extends Monster{
    public Skeleton(){
	monsterType="Skeleton";
	HP=(int)Math.random()*100+50;
	strength=(int)Math.random()*25;
	defense=(int)Math.random()*20+5;
	magicDef=(int)Math.random()*10+10;
    }
}
