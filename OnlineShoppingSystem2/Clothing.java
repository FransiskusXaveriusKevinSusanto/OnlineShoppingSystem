public class Clothing extends Product implements Discountable {
    private String name;
    private double price;
    private Size size;

    public Clothing(String name, double price, Size size) {
        super();
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }

    @Override
    public String getInfo() {
        return "Name: " + name + ", Size: " + size + ", Price: " + price;
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price * (1 - discountPercentage / 100);
    }
}
