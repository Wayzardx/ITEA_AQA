package HomeWork7;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String color;
    private int price;

    public Product(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // Створюємо список товарів
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Kid toy car", "black", 244));
        productList.add(new Product("Apple Juice BONY", "white", 35));
        productList.add(new Product("Chocolade bar Troya", "yellow", 25));
        productList.add(new Product("Book Java basic", "pink", 33));
        productList.add(new Product("Rainbow toy", "rainbow", 112));

        System.out.println("All Products:");
        productList.stream()
                .forEach(p -> System.out.println(p.getName() + " - " + p.getColor() + " - " + p.getPrice()));

        // Enter product color
        String color = "black";
        System.out.println("Product color " + color + ":");
        productList.stream()
                .filter(p -> p.getColor().equals(color))
                .forEach(p -> System.out.println(p.getName() + " - " + p.getColor() + " - " + p.getPrice()));

        // Need enter price to get a list of products above this price!
        int priceHolder = 500;
        System.out.println("Products above price " + priceHolder + ":");
        productList.stream()
                .filter(p -> p.getPrice() > priceHolder)
                .forEach(p -> System.out.println(p.getName() + " - " + p.getColor() + " - " + p.getPrice()));
    }
}