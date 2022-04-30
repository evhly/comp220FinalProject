import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Encounter {
    private String begText;
    private Enemy e1;
    private Hero hero;
    private Scanner scnr = new Scanner(System.in);
    private Random rand = new Random();

    public Encounter(Hero h, Enemy e, String bt){
        hero = h;
        e1 = e;
        begText = bt;
    }

    /**
     *
     * @return true if hero lives and false if enemy wins
     */
    public boolean battle(){
        while(!hero.isDead() || !e1.isDead()){
            System.out.println(hero.getStats());
            System.out.println(e1.getStats());
            System.out.println(hero.getName() + " what do you want to do?");
            System.out.println("Enter 1 to use weapon.");
            int wChoice = scnr.nextInt();
            // TODO: currently only one option for weapon---
           // if (wChoice == 1){
            int damage = attack(hero.getWeapon(0)); //Todo ask which weopon
           // }
            e1.takeDamage(damage);
            System.out.println("You attacked "+ e1.getName()+" for " + damage + " damage.");
            if (e1.isDead()){
                System.out.println("Congratulations! You defeated " + e1.getName() + "!");
                return true;
            }
            int enemyDamage = attack(e1.getWeapon());
            hero.takeDamage(enemyDamage);
            System.out.println(e1.getName()+ " attacked "+ hero.getName() + " for " + enemyDamage + " damage.\n");
            if (hero.isDead()){
                System.out.println("You died! Game over!");
                return false;
            }
        }
        // following code should not be reachable
        return false;
    }

    private int attack(Weapon weapon) {
        int bound = weapon.getMaxDamage() - (weapon.getMaxDamage()/2); //damage ranges between half and max for that weapon
        int damage = rand.nextInt(bound) + (weapon.getMaxDamage()/2);
        return damage;
    }

    /**
     * text at beginnig of each encounter
     * Eg: "You reach the top of a hill and stumble on a Troll. His name is..."...
     * @param begText
     */
    public void setBegText(String begText) {
        this.begText = begText;
    }

    public void setE1(Enemy e1) {
        this.e1 = e1;
    }

    public String getBegText() {
        return begText;
    }

    public static Encounter firstEncounter(Hero h){
        //public Enemy(int h, String n, String t, Weapon w, ArrayList<Item> dl) {
        Weapon club = new Weapon("club", 4);
        ArrayList<Item> drp = new ArrayList<>();
        drp.add(club);
        Enemy en = new Enemy(12, "Eric", "Toad",club,drp);
        String begTxt = "You begin your adventure. \nYou leave your town in search of the great dragon Steve.\n"+
                "But as you enter the woods you encounter your first enemy, Eric the Toad";
        return new Encounter(h, en, begTxt);

    }

    public Encounter bossEncounter(){
        // TODO: create this then call this method from campaign constructor
        return null;
    }




    //......
}
