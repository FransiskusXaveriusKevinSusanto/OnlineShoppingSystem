public class clothing extends product {
    private String size;

    public clothing(String name, double price, int productId, String size) {
        super(name, price, productId);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Ukuran: " + size;
    }
}
