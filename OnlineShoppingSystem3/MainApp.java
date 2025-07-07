import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        TransactionManager transactionManager = new TransactionManager();
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        productManager.addProduct(new Electronics(1, "Laptop", 29999999, 2.5, "Lenovo"));
        productManager.addProduct(new Electronics(2, "Smartphone", 9999999, 0.3, "Samsung"));
        productManager.addProduct(new Clothing(3, "Shirt", 250000, Size.M, "Polo"));
        productManager.addProduct(new Clothing(4, "Jacket", 750000, Size.L, "Levi's"));

        System.out.print("Masukkan nama pelanggan: ");
        String customerName = input.nextLine();

        while (true) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Daftar Produk");
            System.out.println("2. Keranjang Belanja");
            System.out.println("3. Selesai / Bayar");
            System.out.print("Masukkan pilihan: ");
            String choice = input.nextLine();

            if (choice.equals("3")) {
                System.out.println("\n=== Ringkasan Belanja ===");
                Set<Product> cart = transactionManager.getCustomerPurchases(customerName);
                if (cart == null || cart.isEmpty()) {
                    System.out.println("Keranjang belanja kosong. Tidak ada yang perlu dibayar.");
                } else {
                    double total = 0;
                    for (Product p : cart) {
                        System.out.println(p.getInfo());
                        total += p.getPrice();
                    }
                    System.out.println("Total yang harus dibayar: " + rupiahFormat.format(total));
                }

                System.out.println("\nTerima kasih telah berbelanja, " + customerName + "!");
                break;
            }

            if (choice.equals("1")) {
                ArrayList<Product> allProducts = productManager.getAllProducts();
                if (allProducts.isEmpty()) {
                    System.out.println("Belum ada produk yang tersedia.");
                    continue;
                }

                while (true) {
                    System.out.println("\n=== Daftar Produk Tersedia ===");
                    for (Product p : allProducts) {
                        System.out.println("ID: " + p.getId() + " - " + p.name + " - " + p.formatPrice());
                    }
                    System.out.println("Ketik ID produk untuk lihat info / beli, atau ketik 0 untuk kembali.");
                    System.out.print("Pilihan: ");
                    int id = input.nextInt();
                    input.nextLine();

                    if (id == 0)
                        break;

                    try {
                        Product selected = productManager.findProductById(id);
                        System.out.println("\n" + selected.getInfo());
                        System.out.println("1. Tambahkan ke keranjang");
                        System.out.println("2. Kembali");
                        System.out.print("Pilih aksi: ");
                        String action = input.nextLine();
                        if (action.equals("1")) {
                            transactionManager.addPurchase(customerName, selected);
                            System.out.println("Produk berhasil ditambahkan ke keranjang.");
                        }

                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            else if (choice.equals("2")) {
                System.out.println("\n=== Keranjang Belanja ===");
                Set<Product> cart = transactionManager.getCustomerPurchases(customerName);
                if (cart == null || cart.isEmpty()) {
                    System.out.println("Keranjang belanja kosong.");
                } else {
                    for (Product p : cart) {
                        System.out.println(p.getInfo());
                    }
                }
            }

            else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        input.close();
    }
}
