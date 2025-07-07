import java.util.*;

public class TransactionManager {
    private Map<String, Set<Product>> transactions = new HashMap<>();

    public void addPurchase(String customerName, Product product) {
        transactions.putIfAbsent(customerName, new HashSet<>());
        transactions.get(customerName).add(product);
    }

    public Set<Product> getCustomerPurchases(String customerName) {
        return transactions.getOrDefault(customerName, new HashSet<>());
    }
}
