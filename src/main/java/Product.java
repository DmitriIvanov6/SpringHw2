public class Product {
    private int id;
    private float cost;
    private String name;

    public Product(int id, float cost, String name) {
        this.id = id;
        this.cost = cost;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public float getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

}
