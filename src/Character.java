public abstract class Character {
    protected int health;

    /**
     * Constructor
     * @param h is the amount of health the character has
     */
    public Character(int h){
        health = h;
    }

    /**
     * This method reduces the character's health
     * @param d = the amount of health the character will lose
     */
     public void takeDamage(int d){
        health = health - d;
     }

    /**
     * @return true if the character is dead
     */
    public boolean isDead(){
        if (health <= 0){
            return true;
        } else{
            return false;
         }
     }

     public abstract String getStats();
}
