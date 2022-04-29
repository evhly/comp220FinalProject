import java.util.Random;
import java.util.Scanner;

public class Encounter {
    private String begText;
    private Enemy e1;
    private Hero hero;
    private Scanner scnr = new Scanner(System.in);
    private Random rand = new Random();

    public Encounter(Hero h){
        hero = h;

    }

    public boolean battle(){
        while(!hero.isDead() || !e1.isDead()){
            System.out.println(hero.getStats());
            System.out.println(e1.getStats());
            System.out.println(hero.getName() + " what do you want to do?");
            System.out.println("Enter 1 to use weapon.");
            // TODO: make this safe -- check for string...
            int choice = scnr.nextInt();
            if (choice==1){
                attackEnemy(hero.getWeapon(0)); //Todo ask which weopon
            }
        }


        System.out.println(e1.getName() + " takes attacks.");
        //hero.takeDamage();   //TODO: update
        //System.out.println("-"+ damage );


        if (hero.isDead()){
            return false; //if hero dies
        }
        else{
            return true; //return true if enemy dies
        }
        //ea. loop hero takes a turn (if alive)    - inventory, stats, what would you like to do? (1,2,3)
        //enemy takes a turn (if alive)
    }

    private void attackEnemy(Weapon weapon) {
        int bound = weapon.getMaxDamage() - (weapon.getMaxDamage()/2); //damage ranges between half and max for that weapon
        int damage = rand.nextInt(bound) + (weapon.getMaxDamage()/2);
        e1.takeDamage(damage);
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
//        int health =
//                name
//                type
//              weapon --- set damage....
//        Enemy en = new Enemy
//                return new Encouner(h, e,...)
        return null;

    }

    public Encounter bossEncounter(){
        return null;
    }




    //......
}
