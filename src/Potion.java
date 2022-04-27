import java.util.Map;

public class Potion extends Item {

    /**
     * constructor
     * @param n = the name of potion
     */

    Map<String, Integer> weaponsEffectiveness;

    public Potion(String n) {
        super(n);
    }

    public void weaponEffectiveness () { // if want to assign a number to each weapon type
        weaponsEffectiveness.put();
    }

    /**
     * this method applies whatever the effect of the potion is to the hero's stats
     * @param h = the hero effected
     */
    public void applyEffectToHero(Hero h){
        // switch on name
//       h.getStats(h.getStats() + h)


    }

    //later add a strength potion
}
