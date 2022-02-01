package IntStreamOperations;

import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int [] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        System.out.println("Original values: ");
        IntStream.of(values)
                .forEach(valued -> System.out.printf("%d ", valued));
        System.out.println();
        System.out.printf("%nCount: %d%n",IntStream.of(values).count());
        System.out.printf("Min: %d%n",IntStream.of(values).min().getAsInt());
        int totals = IntStream.of(values).sum();
        System.out.println("Total is = "+ totals);
        int minimum = IntStream.of(values).min().getAsInt();
        double averageNumber = IntStream.of(values).average().getAsDouble();
        System.out.printf("%nSum via reduce method: %d%n",IntStream.of(values).reduce(0,(x,y)->x*y));
        System.out.printf("Sum of squares via reduce method: %d%n",IntStream.of(values).reduce(0,(x,y)->x+y*y));
    }
}
