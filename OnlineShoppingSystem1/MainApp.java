public class MainApp {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("ASUS Vivobook", 1999.99, 1001, "ASUS", 24);
        Clothing hoodie = new Clothing("Hoodie Polos", 10.25, 2002, "L");

        System.out.println("=== Produk Elektronik ===");
        System.out.println(laptop.getInfo());

        System.out.println("\n=== Produk Pakaian ===");
        System.out.println(hoodie.getInfo());
    }
}