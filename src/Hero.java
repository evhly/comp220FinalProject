import java.util.Map;
import java.util.Set;

public class Hero extends Character {
    private Set<Weapon> weapons; //weapons must be unique, so set
    private Map<Potion,Integer> potions; //key, value  potion, number of that kind
    // healthPotion, 5   means 5 health potions
    private String name;
    private int baseStrength;
    private int strength;

    public Hero(int h, String n, String s, int bs) {
        super(h);
        //give hero one weapon and one potion to start
    }

    public void addItem(Item i){
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
        return null;
    }
}
