public class Electronics extends Product implements Discountable {
    private String name;
    private double price;
    private Specification spec;

    public Electronics(String name, double price, double weight, String brand) {
        super();
        this.name = name;
        this.price = price;
        this.spec = new Specification(weight, brand);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public String getInfo() {
    return name + " (Brand: " + spec.brand + ", Berat: " + spec.weight + "kg)";
    }


    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price * (1 - discountPercentage / 100);
    }

    // Inner class
    class Specification {
        private double weight;
        private String brand;

        public Specification(double weight, String brand) {
            this.weight = weight;
            this.brand = brand;
        }

        public String getSpecs() {
            return "Brand: " + brand + ", Weight: " + weight + "kg";
        }
    }
}
