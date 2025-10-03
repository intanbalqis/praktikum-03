public class PackageExample {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> produk = new java.util.HashMap<>();

        // Menambahkan data produk
        produk.put(101, "Sabun");
        produk.put(102, "Shampoo");
        produk.put(103, "Pasta Gigi");

        // Menampilkan daftar produk
        System.out.println("Daftar Produk: " + produk);

        // Mengakses data berdasarkan kode produk
        System.out.println("Produk dengan kode 102: " + produk.get(102));

        // Menghapus data produk
        produk.remove(101);
        System.out.println("Setelah penghapusan: " + produk);
    }
}
