package ss12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}

class ProductManager {
    private List<Product> productList;

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Added product: " + product);
    }

    public void updateProduct(int id) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                product.setName(newName);
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                System.out.println("Updated product: " + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                System.out.println("Deleted product: " + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    public void showProductList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProduct(String name) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println("Found product: " + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    public void sortProductsByPriceAscending() {
        productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Sorted by price (Ascending): ");
        showProductList();
    }

    public void sortProductsByPriceDescending() {
        productList.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        System.out.println("Sorted by price (Descending): ");
        showProductList();
    }
}
