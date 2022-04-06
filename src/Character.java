public abstract class Character {
    protected int health;

    public Character(int h){
        //health = h;
    }
     public void takeDamage(int d){

     }

     public boolean isDead(){
        return false;
     }


     public abstract String printStats();
}
