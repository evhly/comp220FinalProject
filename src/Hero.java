import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Hero extends Character {
    private Set<Weapon> weapons; //weapons must be unique, so set
    private Map<Potion,Integer> potions; //key, value  potion, number of that kind
    // healthPotion, 5   means 5 health potions
    private String name;
    private int baseStrength;
    private int strength;
    private ArrayList<Item> items;


    /**
     * constructor
     * @param h = health of hero
     * @param n = hero's name
     * @param s = strength
     * @param bs = base strength
     */
    public Hero(int h, String n, int s, int bs) {
        super(h);
        name = n;
        strength = s;
        baseStrength = bs;
        //give hero one weapon and one potion to start - health is a potion
    }

    public String getName() {
        return name;
    }

    /**
     * this method adds items to the hero's inventory
     * @param i = the item being added.
     */
    public void addItem(Item i){
        items.add(i);
        //if potion, potion, etc.
    }

    /**
     * adds health to hero
     * @param h = the amount of health added
     */
    public void takeDamage(int h){
        //super...
        super.takeDamage(h);

    }
    //add strength
    //reset to base (What does this do?)



    /**
     * provides an update on the hero's current stats
     * @return string of stats
     */
    @Override
    public String getStats() {
        //print list of weapons and potions
       return "weapons: " + weapons + '\n' + "potions: " + potions;
    }

    public Set<Weapon> getWeapon (Weapon w) { // does this seem okay??
        weapons.add(w);
        return weapons;
    }
}
