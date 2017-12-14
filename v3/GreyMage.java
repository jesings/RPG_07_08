public class GreyMage extends Mage{
    public GreyMage(String name){
        super(name);
        spellBook[0] = "Buff";
        spellBook[1] = "Poison";
        spellBook[2] = "Magic Missile";
    }
    public String toString(){
        return super.toString() + " that does not specialize in either kind of Magic";
    }
}