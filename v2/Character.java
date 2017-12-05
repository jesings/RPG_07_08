public class Character{
    protected int HP;
    protected int strength;
    protected int defense;
    protected int magicDef;
    protected double attack;
    protected String[] effectsList;
    protected int[] durations;
    public boolean isAlive(){
        return HP > 0;
    }
    public int getDefense(){
        return defense;
    }
    public void lowerHP(int damage){
        HP -= damage;
    }
    public String[] getEffects(){
	return effects;
    }
    public String[] getDurations(){
	return durations;
    }
    public void iterateDurations(){
	for(int p = 0;p < durations.length;p++){
	    durations[p]--;
	}	
    }
    public int attack(Character victim){
        int damageDealing = (int) (strength * attack - victim.getDefense());
        if(damageDealing >0){
            victim.lowerHP(damageDealing);
            return damageDealing;
        }
        else{ 
            return 0;
        }
    }
}
