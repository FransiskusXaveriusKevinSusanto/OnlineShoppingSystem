import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId())
                return;
        }
        products.add(product);
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }

    public Product findProductById(int id) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getId() == id)
                return product;
        }
        throw new ProductNotFoundException("Produk dengan ID " + id + " tidak ditemukan.");
    }

    public ArrayList<Product> getProductsByCategory(String category) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }
}
