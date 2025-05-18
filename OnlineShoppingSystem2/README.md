# 🛒 OnlineShoppingSystem2

## 👥 Anggota Kelompok
- Fransiskus Xaverius Kevin Susanto (50424473)
- Muhammad Abyaz Khairullah (50424761) (Cro1ssant07(akun github))
- Muhammad Rafliyanto Nugroho (50424906) (Kanaka431(akun github))
- M Izza Anura Hafidz (50424660)

## 🧠 Konsep OOP yang Digunakan
- **Abstract Class**: `Product` sebagai superclass abstrak untuk produk.
- **Interface**: `Discountable` untuk mendefinisikan perilaku diskon.
- **Enum**: `Size` untuk ukuran baju.
- **Inner Class**: `Specification` di dalam `Electronics`.
- **Polymorphism**: Penggunaan variabel bertipe `Product` dan casting ke `Discountable`.
- **Inheritance**: `Clothing` dan `Electronics` mewarisi `Product`.

## 📁 Struktur File
- `Product.java` → Kelas abstrak dasar untuk semua produk.
- `Discountable.java` → Interface yang menentukan metode `getDiscountedPrice()`.
- `Size.java` → Enum untuk ukuran pakaian.
- `Clothing.java` → Produk pakaian dengan atribut ukuran dan merek.
- `Electronics.java` → Produk elektronik dengan spesifikasi inner class.
- `MainApp.java` → Menjalankan simulasi dan menampilkan informasi produk.

## 💻 Fitur
- Menampilkan informasi detail dari produk `Clothing` dan `Electronics`.
- Menampilkan waktu pembuatan produk (`createdAt`).
- Menghitung dan menampilkan harga setelah diskon.
- Format harga menggunakan lokal Indonesia (`Rp`).

## 🔄 Cara Kerja Program (Ringkasan)
Program ini membuat dua jenis produk (elektronik dan pakaian), lalu menampilkan informasi kategori, detail produk, waktu dibuat, dan harga setelah diskon, menggunakan konsep OOP seperti inheritance, interface, inner class, dan polymorphism.

## 🛠️ Cara Menjalankan
1. Compile semua file:
   ```bash
   javac *.java
   ```
2. Jalankan program utama:
   ```bash
   java MainApp
   ```
