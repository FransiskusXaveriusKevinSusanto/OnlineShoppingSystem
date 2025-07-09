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

public class TransactionManager {
    private List<String> history;

    public TransactionManager() {
        history = new ArrayList<>();
    }

    public void saveTransaction(String customerName, List<CartItem> cart) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelanggan: ").append(customerName).append("\n");
        sb.append("Daftar Belanja:\n");

        double total = 0;

        for (CartItem item : cart) {
            Product p = item.getProduct();
            int qty = item.getQuantity();
            double price = p.getPrice();
            double discount = (p instanceof Discountable) ? ((Discountable) p).getDiscount() : 0;
            double finalPrice = price - discount;
            double subtotal = finalPrice * qty;

            sb.append("- ").append(p.getName())
              .append(" - Rp").append(price)
              .append(" (-Rp").append(discount).append(") (")
              .append(qty).append("x)\n");

            total += subtotal;
        }

        sb.append("Total: Rp").append(total).append("\n");
        history.add(sb.toString());

        System.out.println(sb.toString());
    }
}
    



