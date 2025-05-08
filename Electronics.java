public class Electronics extends Product {
    private int warrantyMonths;

    // Constructor
    public Electronics(String name, double price, int productId, int warrantyMonths) {
        super(name, price, productId);
        this.warrantyMonths = warrantyMonths;
    }

    // Getter dan Setter
    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    // Override getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + " - Warranty: " + warrantyMonths + " months";
    }
}
