public class DarkMage extends Mage{
    public DarkMage(String name){
        super(name);
        spellBook[0] = "Poison";
        spellBook[1] = "Stun";
        spellBook[2] = "Magic Missile";
    }
    public String toString(){
        return super.toString() + " that specializes in Dark Magic";
    }
}