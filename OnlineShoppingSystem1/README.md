# OnlineShopping

## Deskripsi
Ini adalah sistem manajemen produk berbasis Java yang mencakup berbagai jenis produk seperti pakaian (`Clothing`) dan elektronik (`Electronics`). Setiap produk memiliki atribut dasar seperti nama, harga, dan ID produk, serta atribut khusus sesuai kategori produknya.

## Struktur Proyek
Proyek ini terdiri dari beberapa kelas utama:
- `Product.java` – Kelas dasar untuk semua produk, dengan atribut `name`, `price`, dan `productId`.
- `Clothing.java` – Subkelas dari `Product`, menambahkan atribut `size` untuk pakaian.
- `Electronics.java` – Subkelas dari `Product`, menambahkan atribut `brand` dan `warranty` untuk produk elektronik.
- `Main.java` – Kelas utama untuk menjalankan program dan menguji fungsionalitas produk.

## Instalasi & Cara Menggunakan
1. Pastikan Anda memiliki **Java Development Kit (JDK)** terinstal di sistem Anda.
2. Clone repositori ini:
   ```sh
   https://github.com/FransiskusXaveriusKevinSusanto/OnlineShoppingSystem.git

## Penjelasan Cara Program Bekerja

Program ini merupakan implementasi dari konsep Object-Oriented Programming (OOP) dalam bentuk sistem online shopping sederhana yang menggunakan pewarisan (inheritance), enkapsulasi, dan overriding method. Kelas Product berfungsi sebagai superclass yang menyimpan atribut umum untuk semua produk seperti nama, harga, dan ID produk. Di dalamnya juga terdapat konstruktor untuk inisialisasi serta metode getInfo() yang mengembalikan informasi dasar produk dalam format teks.

Dua subclass, yaitu Electronics dan Clothing, mewarisi atribut dan method dari Product, lalu menambahkan atribut khusus masing-masing seperti brand dan warranty untuk Electronics, serta size untuk Clothing. Kedua subclass ini juga melakukan override pada method getInfo() agar dapat menampilkan informasi tambahan sesuai kategori produk. Di dalam MainApp, objek dari masing-masing subclass dibuat dan ditampilkan ke layar dengan memanggil getInfo(), sehingga menghasilkan keluaran yang lengkap dan terstruktur sesuai jenis produk yang diwakili.
