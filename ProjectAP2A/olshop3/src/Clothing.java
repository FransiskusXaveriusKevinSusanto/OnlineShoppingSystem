/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Nivinity
 */
public class Clothing extends Product implements Discountable {
    private String size;

    public Clothing(String name, double price, int productId, String size) {
        super(name, price, productId);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getDetails() {
        return "Clothing - Size: " + size;
    }

    @Override
    public double getDiscount() {
        return 0.10 * price; // diskon 10% dari harga
    }
}


