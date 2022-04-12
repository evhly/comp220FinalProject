import java.util.ArrayList;

public class Enemy extends Character {
    private String name;
    private String type;
    private ArrayList<Item> dropList;
    private Weapon weapon;

    public Enemy(int h, String n, String t, Weapon w, ArrayList<Item> dl) {
        super(h);
    }

    public Item dropItem(){
        return null;
    }

    @Override
    public String printStats() {
        return "Enemy:\n"+name+" the "+type+"\n"+"Weapon: "+weapon+"\nHealth remaining: " + health;
    }
}
