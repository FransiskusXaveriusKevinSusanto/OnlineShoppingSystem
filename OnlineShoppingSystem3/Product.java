import java.time.LocalDateTime;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public abstract class Product {
    protected int id;
    protected String name;
    protected double price;
    protected LocalDateTime createdAt;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public double getPrice() {
        return price;
    }

    public String formatPrice() {
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return rupiahFormat.format(price);
    }

    public abstract String getCategory();

    public abstract String getInfo();

    protected double discountPercentage;

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
