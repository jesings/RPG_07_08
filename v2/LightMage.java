public class LightMage extends Mage{
    public LightMage(String name){
        super(name);
        spellBook[0] = "Healing";
        spellBook[1] = "Buff";
        spellBook[2] = "Magic Missile";
    }
    public String toString(){
        return super.toString() + " that specializes in Light Magic";
    }
}