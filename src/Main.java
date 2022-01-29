import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product meat = new Product("Ram meat",1200);
        Product egg = new Product("Fowl egg",700);
        Product milk = new Product("cow milk", 500);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(meat);
        cart.addProduct(egg);
        cart.addProduct(milk);
        System.out.println(cart.getTotalCost());

    }
}
