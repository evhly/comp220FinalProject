import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Character {
    private String name;
    private String type;
    private ArrayList<Item> dropList;
    private Weapon weapon;

    /**
     * constructor
     * @param h = health of enemy
     * @param n = the name of enemy
     * @param t = the type the enemy is
     * @param w = the weapon it uses
     * @param dl = a list of items for the enemy to drop
     */
    public Enemy(int h, String n, String t, Weapon w, ArrayList<Item> dl) {
        super(h);
        name = n;
        type = t;
        dropList = dl;
        weapon = w;
    }

    /**
     * This method causes the enemy to drop an item once dead.
     * @return an item for the hero to pick up and use
     */
    public Item dropItem(){
        Random rand = new Random(dropList.size());
        int r = rand.nextInt();
        return dropList.get(r);
    }

    /**
     * provides an update on the current situation the enemy is in
     * @return string of stats
     */
    @Override
    public String getStats() {
        return "Enemy:\n"+name+" the "+type+"\n"+"Weapon: "+weapon+"\nHealth remaining: " + health;
    }
}
