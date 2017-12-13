public class MageSpell{
    private int damage;
    private int duration = 1;
	private String effect;
    public MageSpell(Mage caster,String spellType){
		if(spellType == "Healing"){
			damage = (int) (-.3 * caster.getMagic());
			caster.useMP(25);
		}
		else if (spellType == "Magic Missile"){
			damage = (int) (caster.getMagic() * .6 * caster.getAttack());
			caster.useMP(15);
		}
		else if (spellType == "Poison"){
			damage = (int) (.1 * caster.getMagic() * caster.getAttack());
			duration = (int) (.08 * caster.getMagic());
			effect = "Poisoned";
			caster.useMP(20);
		}
		else if (spellType == "Stun"){
			damage = (int) (.2 * caster.getMagic() * caster.getAttack());
			effect = "Stunned";
			duration = 2;
			caster.useMP(20);
		}
		else if (spellType == "Buff"){
			effect = "Buffed";
			duration = (int) (.08 * caster.getMagic());
			caster.useMP(10);
		}
	}
	public int getDamage(){
		return damage;
	}
	public int getDuration(){
		return duration;
	}
	public String getEffect(){
		return effect;
	}
}
