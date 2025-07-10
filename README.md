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
- Class
- Constructor
- Encapsulation
- Inheritance
- Access
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
Program ini merupakan implementasi konsep OOP (Object-Oriented Programming) dalam Java untuk mensimulasikan sistem belanja online dengan kategori produk elektronik dan pakaian. Kelas abstrak Product menjadi dasar bagi seluruh produk dan menyimpan informasi umum seperti nama, harga, waktu pembuatan (createdAt), serta method abstrak getCategory() dan getInfo() yang wajib diimplementasikan oleh subclass.

Kelas Clothing dan Electronics merupakan subclass dari Product yang mengimplementasikan interface Discountable, sehingga memungkinkan perhitungan harga diskon sesuai kategori: Clothing mendapatkan diskon 10% dan Electronics 5%. Kelas Clothing menggunakan enum Size untuk mewakili ukuran produk, sedangkan Electronics memiliki inner class Specification untuk menyimpan data berat dan merek.

Program menggunakan ProductManager untuk mengelola daftar produk, TransactionManager untuk mencatat transaksi berdasarkan nama pelanggan (menggunakan Map), serta Set untuk menyimpan item dalam keranjang agar tidak ganda. Dalam MainApp, pengguna diminta memasukkan nama, lalu dapat menelusuri produk, menambahkan ke keranjang, melihat keranjang, dan melakukan pembayaran. Harga ditampilkan menggunakan format mata uang Rupiah (NumberFormat).

Setelah pembayaran, program akan menyimpan ringkasan transaksi ke dalam file teks dengan nama berdasarkan pelanggan, dan file tersebut otomatis tersimpan di dalam folder khusus bernama Transaksi. Fitur ini mencerminkan penggunaan File, PrintWriter, dan pengecekan folder dengan File.mkdir() untuk memastikan file tidak tersimpan sembarangan. Diskon juga ditampilkan secara langsung saat menampilkan daftar produk, memberikan transparansi kepada pengguna.


## 🛒 [OnlineShoppingSystem3](https://github.com/FransiskusXaveriusKevinSusanto/OnlineShoppingSystem/tree/main/OnlineShoppingSystem3)

### 🧠 Ini adalah folder program java sistem online shopping yang menggunakan OOP:
- Class
- Constructor
- Encapsulation
- Inheritance
- Access
- Polymorphism (tanpa array/loop)
- Abstract Class
- Interface
- Enum
- Date & Time (java.time)
- Inner Class
- Exception Handling
- ArrayList
- Set
- Map

### 📜 Deskripsi
Program ini mensimulasikan sistem belanja online berbasis teks menggunakan pendekatan pemrograman berorientasi objek (OOP) di Java. Produk dikelompokkan dalam dua kategori utama: Electronics dan Clothing. Setiap kategori memiliki informasi spesifik dan diskon yang diterapkan secara berbeda. Selama program berjalan, pengguna dapat memasukkan nama, memilih produk berdasarkan ID, menambahkan ke keranjang, melihat isi keranjang, dan melakukan pembayaran. Transaksi yang dilakukan otomatis tersimpan dalam file `.txt` dengan nama pelanggan di dalam folder khusus bernama `Transaksi`.

### 📁 Struktur Proyek
Proyek ini terdiri dari beberapa kelas utama:
* `Product.java` – Kelas abstrak dasar bagi semua produk. Menyimpan atribut umum seperti ID, nama, harga, dan waktu pembuatan (`createdAt`). Mewajibkan subclass untuk mengimplementasikan `getCategory()` dan `getInfo()`. Override `equals()` dan `hashCode()` agar produk dengan ID sama dikenali sebagai entitas yang sama dalam `Set`.
* `Discountable.java` – Interface untuk produk yang dapat diberi diskon. Mewajibkan implementasi method `getDiscountedPrice(double percentage)` dan `getDiscountPercentage()`.
* `Size.java` – Enum yang berisi nilai ukuran untuk produk pakaian, yaitu `XS`, `S`, `M`, `L`, dan `XL`.
* `Electronics.java` – Subkelas dari `Product` yang mengimplementasikan interface `Discountable`. Menambahkan atribut `name`, `price`, dan inner class `Specification` yang menyimpan informasi `weight` dan `brand`.
* `Clothing.java` – Subkelas dari `Product` yang mengimplementasikan interface `Discountable`. Menambahkan atribut `name`, `price`, dan `size` yang bertipe `Size`.
* `MainApp.java` – Kelas utama untuk menjalankan program. Membuat masing-masing objek produk secara manual tanpa loop dan menampilkan informasi produk termasuk diskon. Menyediakan menu interaktif untuk input nama pelanggan, menampilkan daftar produk dengan diskon, menambahkan produk ke keranjang, menampilkan isi keranjang, dan menyelesaikan transaksi. Setelah pembayaran, transaksi disimpan ke dalam file `transaksi_<nama>.txt` di folder `Transaksi`.
* `ProductManager.java` – Bertanggung jawab menyimpan dan mengelola semua produk. Menyediakan metode untuk menambahkan produk, mengambil semua produk, dan mencari produk berdasarkan ID dengan penanganan error khusus.
* `ProductNotFoundException.java` – Kelas exception kustom yang akan dilempar jika produk yang dicari tidak ditemukan berdasarkan ID.
* `TransactionManager.java` – Menyimpan seluruh transaksi berdasarkan nama pelanggan menggunakan Map<String, Set<Product>>. Setiap pelanggan memiliki keranjang unik yang hanya dapat berisi satu entri untuk setiap produk.

### ⚙️ Fitur & Logika Tambahan
– Diskon berbeda berdasarkan tipe produk: Clothing mendapat 10%, Electronics mendapat 5%.
– Transaksi disimpan otomatis dalam file teks setelah pembayaran, lengkap dengan ringkasan dan total pembayaran.
– Folder Transaksi akan otomatis dibuat saat pertama kali menyimpan file.
– Sistem mencegah produk yang sama masuk dua kali ke dalam keranjang.
– Menampilkan harga asli, diskon, dan harga setelah diskon.
– Menggunakan NumberFormat untuk menampilkan harga dalam format Rupiah.




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
Masukkan nama pelanggan (atau ketik 'exit' untuk keluar): A

=== Menu Utama ===
1. Daftar Produk
2. Keranjang Belanja
3. Selesai / Bayar
Masukkan pilihan: 1

=== Daftar Produk Tersedia ===
ID: 1 - Laptop - Rp17.999.999,10 (Diskon 10.0%!)
ID: 2 - Smartphone - Rp5.399.999,10 (Diskon 10.0%!)
ID: 3 - Shirt - Rp200.000,00 (Diskon 20.0%!)
ID: 4 - Jacket - Rp600.000,00 (Diskon 20.0%!)
Ketik ID produk untuk lihat info / beli, atau ketik 0 untuk kembali.
Pilihan: 1

Laptop (Brand: Lenovo, Berat: 2.5kg, Harga Awal: Rp19.999.999,00)
Diskon: 10.0%
Harga setelah diskon: Rp17.999.999,10
Dibuat pada: 2025-07-09T22:31:18.493033600
1. Tambahkan ke keranjang
2. Kembali
Pilih aksi: 1

Produk berhasil ditambahkan ke keranjang.

=== Daftar Produk Tersedia ===
ID: 1 - Laptop - Rp17.999.999,10 (Diskon 10.0%!)
ID: 2 - Smartphone - Rp5.399.999,10 (Diskon 10.0%!)
ID: 3 - Shirt - Rp200.000,00 (Diskon 20.0%!)
ID: 4 - Jacket - Rp600.000,00 (Diskon 20.0%!)
Ketik ID produk untuk lihat info / beli, atau ketik 0 untuk kembali.
Pilihan: 1

Laptop (Brand: Lenovo, Berat: 2.5kg, Harga Awal: Rp19.999.999,00)
Diskon: 10.0%
Harga setelah diskon: Rp17.999.999,10
Dibuat pada: 2025-07-09T22:31:18.493033600
1. Tambahkan ke keranjang
2. Kembali
Pilih aksi: 1

Produk sudah ada di dalam keranjang.

=== Daftar Produk Tersedia ===
ID: 1 - Laptop - Rp17.999.999,10 (Diskon 10.0%!)
ID: 2 - Smartphone - Rp5.399.999,10 (Diskon 10.0%!)
ID: 3 - Shirt - Rp200.000,00 (Diskon 20.0%!)
ID: 4 - Jacket - Rp600.000,00 (Diskon 20.0%!)
Ketik ID produk untuk lihat info / beli, atau ketik 0 untuk kembali.
Pilihan: 2

Smartphone (Brand: Samsung, Berat: 0.3kg, Harga Awal: Rp5.999.999,00)
Diskon: 10.0%
Harga setelah diskon: Rp5.399.999,10
Dibuat pada: 2025-07-09T22:31:18.494254900
1. Tambahkan ke keranjang
2. Kembali
Pilih aksi: 2


=== Daftar Produk Tersedia ===
ID: 1 - Laptop - Rp17.999.999,10 (Diskon 10.0%!)
ID: 2 - Smartphone - Rp5.399.999,10 (Diskon 10.0%!)
ID: 3 - Shirt - Rp200.000,00 (Diskon 20.0%!)
ID: 4 - Jacket - Rp600.000,00 (Diskon 20.0%!)
Ketik ID produk untuk lihat info / beli, atau ketik 0 untuk kembali.
Pilihan: 0

=== Menu Utama ===
1. Daftar Produk
2. Keranjang Belanja
3. Selesai / Bayar
Masukkan pilihan: 2

=== Keranjang Belanja ===
Laptop (Brand: Lenovo, Berat: 2.5kg, Harga Awal: Rp19.999.999,00)
Harga setelah diskon: Rp17.999.999,10

Total yang harus dibayar: Rp17.999.999,10

=== Menu Utama ===
1. Daftar Produk
2. Keranjang Belanja
3. Selesai / Bayar
Masukkan pilihan: 3

=== Ringkasan Belanja ===
Laptop (Brand: Lenovo, Berat: 2.5kg, Harga Awal: Rp19.999.999,00)
Harga setelah diskon: Rp17.999.999,10

Total yang harus dibayar: Rp17.999.999,10
Terima kasih telah berbelanja, A!

Transaksi disimpan ke file: Transaksi/transaksi_A.txt

Masukkan nama pelanggan (atau ketik 'exit' untuk keluar): exit
```
