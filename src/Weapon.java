public class Weapon extends Item {
    private int maxDamage;

    /**
     * @param name is the type of weapon
     * @param md is the maximum damage the weapon deals
     */
    public Weapon(String name, int md) {
        super(name);
        maxDamage = md;
    }

    /**
     * @return maximum damage
     */
    public int getMaxDamage() {
        return maxDamage;
    }

}
