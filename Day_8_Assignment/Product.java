package Day_8_Assignment;
import java.util.Objects;

public class Product {
    int productId;
    String productName;
    double price;
    String category;
    public Product(int productId, String productName, double price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, productName);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        } else {
            Product p = (Product) obj;
            if (this.productId == p.productId && this.productName.equals(p.productName)) {
                return true;
            }
            return false;
        }
    }
    @Override
    public String toString() {
        return "ProductId: " + productId +
               "  ProductName: " + productName +
               "  Price: " + price +
               "  Category: " + category;
    }
    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 55000, "Electronics");
        System.out.println(p);
        Product[] products = {
            new Product(1, "Mobile", 20000, "Electronics"),
            new Product(2, "Table", 8000, "Furniture"),
            new Product(3, "Chair", 3500, "Furniture"),
            new Product(4, "Headphones", 2500, "Accessories")
        };
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        Product p1 = new Product(11, "Mouse", 1200, "Accessories");
        Product p2 = new Product(11, "Mouse", 1500, "Accessories");
        Product p3 = p1;
        Product p4 = null;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1.hashCode() == p3.hashCode());
        System.out.println(p1.getClass() == p3.getClass());
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}