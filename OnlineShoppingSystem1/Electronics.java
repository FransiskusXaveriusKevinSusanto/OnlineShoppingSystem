public class Electronics extends Product {
    private String brand;
    private int warranty;

    public Electronics(String name, double price, int productId, String brand, int warranty) {
        super(name, price, productId);
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Brand: " + brand + " - Warranty: " + warranty + " months";
    }
}