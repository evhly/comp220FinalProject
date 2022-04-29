import java.util.Map;

public class Potion extends Item {

    /**
     * constructor
     * @param n = the name of potion
     */

   // Map<String, Integer> weaponsEffectiveness; this is class for a single potion



    public Potion(String n) {
        super(n);
    }


    /**
     * this method applies whatever the effect of the potion is to the hero's stats
     * @param h = the hero effected
     */
    public void applyEffectToHero(Hero h){

        // Todo: a series of if statements, one for each potion type
        // eg if (this.name.equals(health) {  h.heal( ...
        // if strength --- set hero's strenghtboost to true...


    }

    //later add a strength potion
}
