import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);

    public static Hero createHero(){
        String name;
        System.out.println("Welcome hero!\nWhat is your name?");
        name = scn.next();
        return (new Hero(20,name,10));
    }

    public static void main(String[] args) {
        Hero h1 = createHero();
        Campaign c = new Campaign(h1);
        c.playCampaign();
    }
    // comment

}
