public class Weapon extends Item {
    private int maxDamage;

    /**
     * @param n is the type of weapon
     * @param md is the maximum damage the weapon deals
     */
    public Weapon(String n, int md) {
        super(n);
        maxDamage = md;
    }

    /**
     * @return maximum damage
     */
    public int getMaxDamage() {
        return maxDamage;
    }
}
