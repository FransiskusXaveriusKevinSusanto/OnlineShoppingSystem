# 🛒 OnlineShoppingSystem

## 👋 Pengenalan
Ini adalah repository kumpulan program OOP Java mengenai sistem Online Shop yang di buat oleh kelompok 8 yang beranggotakan:

- Fransiskus Xaverius Kevin Susanto (50424473)
- Muhammad Abyaz Khairullah (50424761) (Cro1ssant07(akun github))
- Muhammad Rafliyanto Nugroho (50424906) (Kanaka431(akun github))
- M Izza Anura Hafidz (50424660)

## 🛒 [OnlineShoppingSystem1](https://github.com/FransiskusXaveriusKevinSusanto/OnlineShoppingSystem/tree/main/OnlineShoppingSystem1)

### 🧠 Ini adalah folder program java sistem online shopping yang menggunakan OOP:
- Class
- Constructor
- Encapsulation
- Inheritance
- Access

### 📜 Deskripsi
Ini adalah sistem manajemen produk berbasis Java yang mencakup berbagai jenis produk seperti pakaian (`Clothing`) dan elektronik (`Electronics`). Setiap produk memiliki atribut dasar seperti nama, harga, dan ID produk, serta atribut khusus sesuai kategori produknya.

### 📁 Struktur Proyek
Proyek ini terdiri dari beberapa kelas utama:
- `Product.java` – Kelas dasar untuk semua produk, dengan atribut `name`, `price`, dan `productId`.
- `Clothing.java` – Subkelas dari `Product`, menambahkan atribut `size` untuk pakaian.
- `Electronics.java` – Subkelas dari `Product`, menambahkan atribut `brand` dan `warranty` untuk produk elektronik.
- `Main.java` – Kelas utama untuk menjalankan program dan menguji fungsionalitas produk.

### 📘 Penjelasan Cara Program Bekerja

Program ini merupakan implementasi dari konsep Object-Oriented Programming (OOP) dalam bentuk sistem online shopping sederhana yang menggunakan pewarisan (inheritance), enkapsulasi, dan overriding method. Kelas Product berfungsi sebagai superclass yang menyimpan atribut umum untuk semua produk seperti nama, harga, dan ID produk. Di dalamnya juga terdapat konstruktor untuk inisialisasi serta metode getInfo() yang mengembalikan informasi dasar produk dalam format teks.

Dua subclass, yaitu Electronics dan Clothing, mewarisi atribut dan method dari Product, lalu menambahkan atribut khusus masing-masing seperti brand dan warranty untuk Electronics, serta size untuk Clothing. Kedua subclass ini juga melakukan override pada method getInfo() agar dapat menampilkan informasi tambahan sesuai kategori produk. Di dalam MainApp, objek dari masing-masing subclass dibuat dan ditampilkan ke layar dengan memanggil getInfo(), sehingga menghasilkan keluaran yang lengkap dan terstruktur sesuai jenis produk yang diwakili.


## 🛒 [OnlineShoppingSystem2](https://github.com/FransiskusXaveriusKevinSusanto/OnlineShoppingSystem/tree/main/OnlineShoppingSystem2)

### 🧠 Ini adalah folder program java sistem online shopping yang menggunakan OOP:
- Polymorphism (tanpa array/loop)
- Abstract Class
- Interface
- Enum
- Date & Time (java.time)
- Inner Class

### 📜 Deskripsi
Program ini mensimulasikan sistem belanja online sederhana dengan konsep OOP. Kelas abstrak `Product` diwarisi oleh `Electronics` dan `Clothing`, yang keduanya mengimplementasikan interface `Discountable` untuk menghitung harga setelah diskon. Enum `Size` digunakan pada `Clothing`, dan inner class `Specification` terdapat pada `Electronics`. Kelas `MainApp` membuat dan menampilkan data produk tanpa menggunakan array atau loop.

### 📁 Struktur Proyek
Proyek ini terdiri dari beberapa kelas utama:
* `Product.java` – Kelas abstrak sebagai dasar dari semua produk, memiliki atribut `createdAt` untuk mencatat waktu pembuatan objek, serta method abstrak `getCategory()` dan `getInfo()`.
* `Discountable.java` – Interface yang mendefinisikan method `getDiscountedPrice(double discountPercentage)` untuk menghitung harga setelah diskon.
* `Size.java` – Enum yang berisi nilai ukuran untuk produk pakaian, yaitu `XS`, `S`, `M`, `L`, dan `XL`.
* `Electronics.java` – Subkelas dari `Product` yang mengimplementasikan interface `Discountable`. Menambahkan atribut `name`, `price`, dan inner class `Specification` yang menyimpan informasi `weight` dan `brand`.
* `Clothing.java` – Subkelas dari `Product` yang mengimplementasikan interface `Discountable`. Menambahkan atribut `name`, `price`, dan `size` yang bertipe `Size`.
* `MainApp.java` – Kelas utama untuk menjalankan program. Membuat masing-masing objek produk secara manual tanpa loop dan menampilkan informasi produk termasuk diskon.

### 📘 Penjelasan Cara Program Bekerja
Program ini merupakan contoh implementasi konsep inheritance (pewarisan), interface, dan enum dalam pemrograman Java untuk merepresentasikan produk dengan kategori yang berbeda, yaitu elektronik dan pakaian. Kelas abstrak Product menjadi kelas dasar yang menyimpan informasi umum seperti waktu pembuatan produk (createdAt) dan mendefinisikan metode abstrak getCategory() dan getInfo() yang wajib diimplementasikan oleh kelas turunannya. 

Kelas Clothing dan Electronics merupakan subclass dari Product yang mengimplementasikan interface Discountable untuk menghitung harga produk setelah diberikan diskon. Clothing menggunakan enum Size untuk menentukan ukuran baju, sedangkan Electronics memiliki inner class Specification yang menyimpan detail spesifikasi seperti berat dan merek produk elektronik. Pada kelas MainApp, dibuat objek dari kedua kelas tersebut, kemudian informasi produk, waktu pembuatan, dan harga setelah diskon ditampilkan menggunakan format tanggal dan format mata uang yang sesuai dengan lokal Indonesia.


## 🛒 [OnlineShoppingSystem3](https://github.com/FransiskusXaveriusKevinSusanto/OnlineShoppingSystem/tree/main/OnlineShoppingSystem3)

### 🧠 Ini adalah folder program java sistem online shopping yang menggunakan OOP:
- Exception Handling
- ArrayList
- Set
- Map


## 🚀 Cara Menjalankan Program
- Pilih salah satu dari 3 tipe program Online Shopping System yang ingin di jalankan
- Kompilasi semua file 
```bash
javac. *.java
```
- Jalankan programnya
```bash
java *
```

### Contoh Output
- OnlineShoppingSystem1
```bash
=== Produk Elektronik ===
Product ID: 1001
ASUS Vivobook - $1999.99 - Brand: ASUS - Warranty: 24 months

=== Produk Pakaian ===
Product ID: 2002
Hoodie Polos - $10.25 - Size: L
```
- OnlineShoppingSystem2
```bash
=======Produk Elektronik=======
Kategori: Electronics
Info Produk: Laptop (Brand: Lenovo, Berat: 2.5kg, Harga Awal: Rp29.999.999,00)
Dibuat pada: 2025-07-08T00:38:41.334986400
Diskon yang tersedia: 30.0%
Harga setelah diskon 30%: Rp20.999.999,30

=======Produk Baju=======
Kategori: Clothing
Info Produk: Shirt (Brand: Polo, Ukuran: M, Harga Awal: Rp250.000,00)
Dibuat pada: 2025-07-08T00:38:41.342510200
Diskon yang tersedia: 15.0%
Harga setelah diskon 15%: Rp212.500,00
```
- OnlineShoppingSystem3
```bash
Masukkan nama pelanggan: n

=== Menu Utama ===
1. Daftar Produk
2. Keranjang Belanja
3. Selesai / Bayar
Masukkan pilihan: 1

=== Daftar Produk Tersedia ===
ID: 1 - Laptop - Rp17.999.999,10
ID: 2 - Smartphone - Rp5.399.999,10
ID: 3 - Shirt - Rp200.000,00
ID: 4 - Jacket - Rp600.000,00
Ketik ID produk untuk lihat info / beli, atau ketik 0 untuk kembali.
Pilihan: 1

Laptop (Brand: Lenovo, Berat: 2.5kg, Harga Awal: Rp19.999.999,00)
Diskon: 10.0%
Harga setelah diskon: Rp17.999.999,10
Dibuat pada: 2025-07-09T14:58:58.750512100
1. Tambahkan ke keranjang
2. Kembali
Pilih aksi: 1
Produk berhasil ditambahkan ke keranjang.

=== Daftar Produk Tersedia ===
ID: 1 - Laptop - Rp17.999.999,10
ID: 2 - Smartphone - Rp5.399.999,10
ID: 3 - Shirt - Rp200.000,00
ID: 4 - Jacket - Rp600.000,00
Ketik ID produk untuk lihat info / beli, atau ketik 0 untuk kembali.
Pilihan: 0

=== Menu Utama ===
1. Daftar Produk
2. Keranjang Belanja
3. Selesai / Bayar
Masukkan pilihan: 3

=== Ringkasan Belanja ===
Laptop (Brand: Lenovo, Berat: 2.5kg, Harga Awal: Rp19.999.999,00)
Harga setelah diskon: Rp17.999.999,10
Total yang harus dibayar: Rp17.999.999,10

Terima kasih telah berbelanja, n!
```
