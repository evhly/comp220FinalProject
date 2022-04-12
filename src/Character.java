public abstract class Character {
    protected int health;

    public Character(int h){
        health = h;
    }
     public void takeDamage(int d){
        health = health - d;
     }

     public boolean isDead(){
        if (health <= 0){
            return true;
        } else{
            return false;
         }
     }

     public abstract String printStats();
}
