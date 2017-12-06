public class Character{
    protected int HP;
    protected int strength;
    protected int defense;
    protected int magicDef;
    protected double attack;
    protected String effect;
    protected int duration;
    public boolean isAlive(){
        return HP > 0;
    }
    public int getDefense(){
        return defense;
    }
    public void lowerHP(int damage){
        HP -= damage;
    }
    public String getEffect(){
        return effect;
    }
    public void setEffect(String e){
        effect = e;
    }
    public int getDuration(){
        return duration;
    }
    public void iterateDuration(){
        duration--;
    }
    public double getAttack(){
        return attack;
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
