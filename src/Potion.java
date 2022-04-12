public class Potion extends Item {

    /**
     * constructor
     * @param n = the name of potion
     */
    public Potion(String n) {
        super(n);
    }

    /**
     * this method applies whatever the effect of the potion is to the hero's stats
     * @param h = the hero effected
     */
    public void applyEffect(Hero h){
        // switch on name
       // if (h.equals("health")) {
            h.heal(5);


    }

    //later add a strength potion
}
