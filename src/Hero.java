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

    public Hero(int h, String n, int s, int bs) {
        super(h);
        name = n;
        strength = s;
        baseStrength = bs;
        //give hero one weapon and one potion to start - health is a potion
    }

    public void addItem(Item i){
        items.add(i);
        //if potion, potion, etc.
    }

    public void heal(int h){

        //super...
    }

    //add strength
    //reset to base

    @Override
    public String printStats() {
        //print list of weapons and potions
       return "weapons: " + weapons + '\n' + "potions: " + potions;

    }
}
