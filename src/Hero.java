import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hero extends Character {
    private ArrayList<Weapon> weapons; //weapons must be unique, so set
    private Map<Potion,Integer> potions; //key, value  potion, number of that kind
    // healthPotion, 5   means 5 health potions
    private String name;
    private int baseStrength;
    private int strength;
    boolean strengthBoost;
    //private ArrayList<Item> items;



    /**
     * constructor
     * @param h = health of hero
     * @param n = hero's name
     * @param s = strength
     * @param bs = base strength
     */
    public Hero(int h, String n, int bs) {
        super(h);
        name = n;
        strength = bs;
        baseStrength = bs;
        potions = new HashMap<>();
        weapons = new ArrayList<>();
        strengthBoost = false;

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
        // TODO: check if item is a weapon - if so add to weapons arraylist
        // can use instanceof eg if (i instanceof Weapon) { ...
        // if it is a potion, add it to the potions map

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
        return name + "\nhealth: " + super.health + "\nweapons: " + weapons + "\npotions: " + potions;
    }

    public Weapon getWeapon (int index) {
        return weapons.get(index);
    }

    public void heal(int addedHealth) {
        // todo: increase health but not more than maxHealth
    }
}
