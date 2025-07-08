public class Electronics extends Product implements Discountable {
    private Specification spec;

    public Electronics(int id, String name, double price, double weight, String brand) {
        super(id, name, price);
        this.spec = new Specification(weight, brand);
        setDiscountPercentage(10);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public String getInfo() {
        return name + " (Brand: " + spec.brand + ", Berat: " + spec.weight + "kg, Harga Awal: " + formatPrice() + ")";
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    private class Specification {
        double weight;
        String brand;

        Specification(double weight, String brand) {
            this.weight = weight;
            this.brand = brand;
        }
    }
}
