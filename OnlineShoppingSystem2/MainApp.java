import java.text.NumberFormat;
import java.util.Locale;

public class MainApp {
    private static final NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"));

    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 29999999, 2.5, "Lenovo");
        Clothing shirt = new Clothing("Shirt", 250000, Size.M, "Polo");

        System.out.println("=======Produk Elektronik=======");
        printProductDetails(laptop, 30);
        System.out.println();
        System.out.println("=======Produk Baju=======");
        printProductDetails(shirt, 15);
    }

    public static void printProductDetails(Product product, double discountPercentage) {
        System.out.println("Kategori: " + product.getCategory());
        System.out.println("Info Produk: " + product.getInfo());
        System.out.println("Dibuat pada: " + product.getCreatedAt());

        if (product instanceof Discountable d) {
            System.out.printf("Diskon yang tersedia: %.1f%%\n", discountPercentage);
            double finalPrice = d.getDiscountedPrice(discountPercentage);
            System.out.println("Harga setelah diskon " + (int)discountPercentage + "%: " + rupiahFormat.format(finalPrice));
        }
    }
}
