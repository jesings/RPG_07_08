public class Skeleton extends Monster{
    public Skeleton(){
	super();
	monsterType="Skeleton";
	HP -= 25;
	strength += (int)(Math.random()*5);
	defense += 20;
	magicDef += 5;
    }
}
