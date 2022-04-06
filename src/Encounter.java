public class Encounter {
    private String begText;
    private Enemy e1;
    private Hero hero;

    public Encounter(Hero h){
    }

    public boolean battle(){
        //loop
        //ea. loop hero takes a turn (if alive)
        //enemy takes a turn (if alive)
        return false; //if hero dies
        //return true if enemy dies
    }

    public void setBegText(String begText) {
        this.begText = begText;
    }

    public void setE1(Enemy e1) {
        this.e1 = e1;
    }

    public Encounter firstEncounter(){
        return null;
    }

    public Encounter bossEncounter(){
        return null;
    }

    //......
}
