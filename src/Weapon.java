public class Weapon extends Item {
    private int maxDamage;

    public Weapon(String n, int md) {
        super(n);
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
