public class Clothing extends Product implements Discountable {
    private String name;
    private double price;
    private Size size;
    private String brand;

    public Clothing(String name, double price, Size size, String brand) {
        super();
        this.name = name;
        this.price = price;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }

    @Override
    public String getInfo() {
        return name + " (Brand: " + brand + ", Ukuran: " + size + ")";
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price * (1 - discountPercentage / 100);
    }
}
