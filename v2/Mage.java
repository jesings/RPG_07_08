public class Mage extends Protagonist{
    private int MP;
	private int magic;
	protected String[] spellBook = new String[3];
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
