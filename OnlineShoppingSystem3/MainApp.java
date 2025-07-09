import java.util.*;
import java.text.NumberFormat;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        TransactionManager transactionManager = new TransactionManager();
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        productManager.addProduct(new Electronics(1, "Laptop", 19999999, 2.5, "Lenovo"));
        productManager.addProduct(new Electronics(2, "Smartphone", 5999999, 0.3, "Samsung"));
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
                        double hargaAkhir = (p instanceof Discountable d)
                                ? d.getDiscountedPrice(p.getDiscountPercentage())
                                : p.getPrice();

                        System.out.println(p.getInfo());
                        System.out.println("Harga setelah diskon: " + rupiahFormat.format(hargaAkhir));
                        total += hargaAkhir;
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
                        double hargaAkhir = (p instanceof Discountable d)
                                ? d.getDiscountedPrice(p.getDiscountPercentage())
                                : p.getPrice();

                        System.out
                                .println("ID: " + p.getId() + " - " + p.name + " - " + rupiahFormat.format(hargaAkhir));
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
                        if (selected instanceof Discountable d) {
                            System.out.println("Diskon: " + selected.getDiscountPercentage() + "%");
                            System.out.println("Harga setelah diskon: " + rupiahFormat.format(
                                    d.getDiscountedPrice(selected.getDiscountPercentage())));
                            System.out.println("Dibuat pada: " + selected.getCreatedAt());
                        }
                        System.out.println("1. Tambahkan ke keranjang");
                        System.out.println("2. Kembali");
                        System.out.print("Pilih aksi: ");

                        String action = input.nextLine();

                        System.out.println();
                        if (action.equals("1")) {
                            Set<Product> cart = transactionManager.getCustomerPurchases(customerName);
                            if (cart.contains(selected)) {
                                System.out.println("Produk sudah ada di dalam keranjang.");
                            } else {
                                transactionManager.addPurchase(customerName, selected);
                                System.out.println("Produk berhasil ditambahkan ke keranjang.");
                            }
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
                        double hargaAkhir = (p instanceof Discountable d)
                                ? d.getDiscountedPrice(p.getDiscountPercentage())
                                : p.getPrice();

                        System.out.println(p.getInfo());
                        System.out.println("Harga setelah diskon: " + rupiahFormat.format(hargaAkhir));
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
