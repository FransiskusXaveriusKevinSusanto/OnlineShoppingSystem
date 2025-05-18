import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

interface Discountable {
    double getDiscountedPrice(double discountPercentage);
}

enum Size {
    S, M, L, XL, XXL
}

abstract class Product {
    private String name;
    private double price;
    private LocalDateTime createdAt;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getCreatedAt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return createdAt.format(formatter);
    }
    
    public abstract String getCategory();
    
    public abstract String getInfo();
}

class Electronics extends Product implements Discountable {
    private double weight;
    private String brand;
    
    public Electronics(String name, double price, double weight, String brand) {
        super(name, price);
        this.weight = weight;
        this.brand = brand;
    }
    
    @Override
    public String getCategory() {
        return "Elektronik";
    }
    
    @Override
    public String getInfo() {
        return String.format("%s %s - %.1f kg", getBrand(), getName(), getWeight());
    }
    
    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return getPrice() * (1 - discountPercentage / 100);
    }
    
    public double getWeight() {
        return weight;
    }
    
    public String getBrand() {
        return brand;
    }
}

class Clothing extends Product implements Discountable {
    private Size size;
    private String material;
    
    public Clothing(String name, double price, Size size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }
    
    @Override
    public String getCategory() {
        return "Pakaian";
    }
    
    @Override
    public String getInfo() {
        return String.format("%s %s - Ukuran %s", getMaterial(), getName(), getSize());
    }
    
    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return getPrice() * (1 - discountPercentage / 100);
    }
    
    public Size getSize() {
        return size;
    }
    
    public String getMaterial() {
        return material;
    }
}

public class MainApp {
    private static final NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"));

    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 29999999, 2.5, "Lenovo");
        Clothing shirt = new Clothing("Shirt", 250000, Size.M, "Polo");

        System.out.println("=======Produk Elektronik=======");
        printProductDetails(laptop, 30);
        System.out.println();
        System.out.println("=======Produk Baju=======");
        printProductDetails(shirt, 15);
    }

    public static void printProductDetails(Product product, double discountPercentage) {
        System.out.println("Kategori: " + product.getCategory());
        System.out.println("Info Produk: " + product.getInfo());
        System.out.println("Dibuat pada: " + product.getCreatedAt());

        if (product instanceof Discountable d) {
            System.out.printf("Diskon yang tersedia: %.1f%%\n", discountPercentage);
            double finalPrice = d.getDiscountedPrice(discountPercentage);
            System.out.println("Harga setelah diskon " + (int)discountPercentage + "%: " + rupiahFormat.format(finalPrice));
        }
    }
}
