import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products =new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
    public int getTotalCost(){
       return products.stream()
               .mapToInt(Product ::getPrice)
               .sum();
    }
    public Order checkout(Customer customer){
        Payment p = customer.getCard().makePayment(getTotalCost());
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
