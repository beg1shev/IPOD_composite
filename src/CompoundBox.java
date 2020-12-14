import java.util.ArrayList;
import java.util.List;

public class CompoundBox implements Product {
    private String name;
    private int price;
    private List<Product> Products;

    public CompoundBox(String name) {
        this.name = name;
        this.price = 0;
        this.Products = new ArrayList<>();
    }

    @Override
    public int calcPrice() {
        Products.forEach(product -> {
            price += product.calcPrice();
        });
        return price;
    }

    @Override
    public void printName() {
        Products.forEach(Product::printName);
    }

    public void addProduct(Product product) {
        Products.add(product);
    }

    public void removeProduct(Product product) {
        Products.remove(product);
    }
}
