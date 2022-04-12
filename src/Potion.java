public class Potion extends Item {

    public Potion(String n) {
        super(n);
    }

    public void applyEffect(Hero h){
        // switch on name
       // if (h.equals("health")) {
            h.heal(5);


    }

    //later add a strength potion
}
