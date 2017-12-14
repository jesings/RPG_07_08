public class LightMage extends Mage{
    public LightMage(String name){
        super(name);
        spellBook[0] = "Healing";
        spellBook[1] = "Buff";
        spellBook[2] = "Magic Missile";
    }
    public String toString(){
<<<<<<< HEAD
        return super.toString() + ",a light magician";
=======
        return super.toString() + " that specializes in Light Magic";
>>>>>>> 1ed8f86d29d7c70999d0098eef769d381876f9a5
    }
}
