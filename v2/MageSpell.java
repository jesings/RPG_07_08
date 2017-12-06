public class MageSpell{
    private int damage;
    private int duration = 1;
	private String effect;
    public MageSpell(Mage caster,String spellType){
		if(spellType == "Healing"){
			damage = (int) (-.3 * magic);
			caster.changeMP(25);
		}
		else if (spellType == "Magic Missile"){
			damage = (int) (magic * .6 * attack);
			caster.changeMP(15);
		}
		else if (spellType == "Poison"){
			damage = (int) (.1 * magic * attack);
			duration = (int) (.08 * magic);
			effect = "Poisoned";
			caster.changeMP(20);
		}
		else if (spellType == "Stun"){
			damage = (int) (.2 * magic * attack);
			effect = "Stunned";
			duration = 2;
			caster.changeMP(20);
		}
		else if (spellType == "Buff"){
			duration = (int) (.08 * magic);
			caster.changeMP(10);
		}
    }
}
