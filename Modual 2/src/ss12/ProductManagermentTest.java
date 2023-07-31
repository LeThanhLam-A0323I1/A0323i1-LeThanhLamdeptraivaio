package ss12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManagermentTest {
    public static void main(String[] args) {
        List<Product> productList1 = new ArrayList<Product>();
        List<Product> productList2 = new LinkedList<Product>();
        ProductManager productManager1 = new ProductManager(productList1);
        ProductManager productManager2 = new ProductManager(productList2);
        Scanner scanner = new Scanner(System.in);

        // Test ArrayList
        System.out.println("Test ArrayList:");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("4. Show Product List");
        System.out.println("5. Search Product");
        System.out.println("6. Sort Products by Price (Ascending)");
        System.out.println("7. Sort Products by Price (Descending)");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
            }
        }
    }
}
