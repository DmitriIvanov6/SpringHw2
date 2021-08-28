import java.util.ArrayList;
import java.util.List;

public class Cart {
    private ProductRepository pr;
    private List<Product> cartProducts;

    public Cart(ProductRepository pr) {
        this.pr = pr;
        this.cartProducts = new ArrayList<>();
    }

    public boolean addToCart(int id) {
        if (pr.findById(id) != null) {
            cartProducts.add(pr.findById(id));
            return true;
        }
        return false;
    }

    public boolean removeFromCart(int id) {
        return cartProducts.removeIf(p -> p.getId() == id);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "pr=" + pr +
                ", cartProducts=" + cartProducts +
                '}';
    }
}
