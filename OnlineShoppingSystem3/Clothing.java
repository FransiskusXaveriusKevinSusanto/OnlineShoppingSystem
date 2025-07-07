public class Clothing extends Product implements Discountable {
    private Size size;
    private String brand;

    public Clothing(int id, String name, double price, Size size, String brand) {
        super(id, name, price);
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }

    @Override
    public String getInfo() {
        return name + " (Brand: " + brand + ", Ukuran: " + size + ", Harga Awal: " + formatPrice() + ")";
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
}
