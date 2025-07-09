/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Nivinity
 */
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
        initializeProducts();
    }

    private void initializeProducts() {
        productList.add(new Clothing("Kaos Polos", 50000, 1, "M"));
        productList.add(new Clothing("Jaket Hoodie", 150000, 2, "L"));
        productList.add(new Electronics("Headphone", 250000, 3, 12));
        productList.add(new Electronics("Smartphone", 2000000, 4, 24));
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(int id) {
        for (Product p : productList) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        return null;
    }
}
