import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<Product> productList = new ArrayList<>();

    public ProductRepository() {

        productList.add(new Product(1, 1.1f, "Product1"));
        productList.add(new Product(2, 2.2f, "Product2"));
        productList.add(new Product(3, 3.3f, "Product3"));
        productList.add(new Product(4, 4.4f, "Product4"));
        productList.add(new Product(5, 5.5f, "Product5"));
    }

    public Product findById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Product> findAll() {
        return productList;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "productList=" + productList +
                '}';
    }
}
