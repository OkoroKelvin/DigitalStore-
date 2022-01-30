package Lambda;

public class FirstLambda {
    public static void main(String[] args) {
        Supplier<String> supplier =() -> "Hello!";
        String string = supplier.get();
        System.out.println("String ="+ string);

        Consumer<String> consumer = System.out::println;
    }
}
