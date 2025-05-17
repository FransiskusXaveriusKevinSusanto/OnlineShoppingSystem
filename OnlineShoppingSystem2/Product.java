import java.time.LocalDateTime;

public abstract class Product {
    protected LocalDateTime createdAt;

    public Product() {
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public abstract String getCategory();

    public abstract String getInfo();
}
