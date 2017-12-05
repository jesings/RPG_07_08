class MageSpell(){
    private int damage;
    private int duration = 1;
    private String effect;
    public MageSpell(String spellType){
	if(spellType = "Healing")
	    damage = (int) (-.5 * magic);
	else if (spellType = "Magic Missile")
	    damage = (int) (magic * .6 * attack);
	else if (spellType = "Poison"){
	    damage = (int) (.1 * magic * attack);
	    duration = (int) (.08 * magic);
	    effect = "Poisoned";
	}
	else if (spellType = "Stun"){
	    damage = (int) (.2 * magic * attack);
	    effect = "Stunned";
	}
	else
	    System.out.println("Thou hast cast an invalid spell");
    }

}
