import java.util.Map;

public class Catalogue {
    private static Map<String,Product> productMap = Map.of(
            "Wire cable",new Product("Wire cable",200),
            "Electric tooth",new Product("Electric tooth",221)
    );
    public static Product getProduct(String productName){
        return productMap.get(productName);
    }
}
