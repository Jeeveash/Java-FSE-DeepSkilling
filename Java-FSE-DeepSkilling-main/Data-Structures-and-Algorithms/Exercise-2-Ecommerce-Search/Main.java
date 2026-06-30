import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };

        Product linear = Search.linearSearch(products, "Mobile");

        if (linear != null) {
            System.out.println("Linear Search:");
            System.out.println(linear.productId + " " + linear.productName + " " + linear.category);
        }

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product binary = Search.binarySearch(products, "Mobile");

        if (binary != null) {
            System.out.println("Binary Search:");
            System.out.println(binary.productId + " " + binary.productName + " " + binary.category);
        }
    }
}
