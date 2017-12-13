public class Mage extends Protagonist{
    private int MP;
	private int magic;
	protected String[] spellBook = new String[3];
	public int magicAttack(Monster victim,String spell){
		MageSpell myMagic = new MageSpell(this,spell);
		victim.lowerHP(myMagic.getDamage());
		if (myMagic.getEffect() != null){
			victim.effect = myMagic.getEffect();
			victim.duration = myMagic.getDuration();
		}
		return myMagic.getDamage();
	}
	public int magicSelf(String spell){
		MageSpell myMagic = new MageSpell(this,spell);
		if (spell.equals("Buff")){
			effect = myMagic.getEffect();
			duration = myMagic.getDuration();
		} else {
			lowerHP(myMagic.getDamage());
		}
		return Math.abs(myMagic.getDamage());
	}
    public Mage(String name){
		super(name);
		MP = 100;
		magic = 75;
		defense -= 10;
		magicDef += 10;
	}
	public int getMagic(){
		return magic;
	}
	public void useMP(int amt){
		MP -= amt;
	}
	public int getMP(){
		return MP;
	}
	public String toString(){
		return super.toString() + ", the Mage";
	}
}
