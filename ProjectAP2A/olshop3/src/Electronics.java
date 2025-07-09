/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Nivinity
 */
public class Electronics extends Product implements Discountable {
    private int warrantyMonths;

    public Electronics(String name, double price, int productId, int warrantyMonths) {
        super(name, price, productId);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    @Override
    public String getDetails() {
        return "Electronics - Warranty: " + warrantyMonths + " months";
    }

    @Override
    public double getDiscount() {
        return 0.05 * price; // diskon 5%
    }
}


