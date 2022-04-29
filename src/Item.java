public abstract class Item {
    private String name;

    /**
     * constructor
     * @param n = the name of the item
     */
    public Item(String n){
        name = n;
    }

    public String getName() {
        return name;
    }
}
