//By Jonathan Singer and Matthew Ming
public abstract class Protagonist extends Character{
    protected String name;
    public Protagonist(String myName){
     name = myName;
     HP = 125;
     strength = 100;
     defense = 40;
     attack = 0.4;
    }
    public String getName(){
        return name;
    }
    public void buff(){
        attack += .2;
        defense += 6;
    }
    public void specialize(){
            defense = 5;
            attack = .6;
    }
    public void normalize(){
            defense = 10;
            attack = .4;
    }
    public abstract String toString();
    //One of the many error messages:
    /*          .\GreyMage.java:9: error: cannot find symbol
                return super.toString()
     */
 }
 