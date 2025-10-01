public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> mahasiswa = new java.util.HashMap<>();

        mahasiswa.put(1, "Budi");
        mahasiswa.put(2, "Ani");
        mahasiswa.put(3, "Siti");

        System.out.println("Daftar Mahasiswa: " + mahasiswa);

        System.out.println("Mahasiswa dengan NIM 2: " + mahasiswa.get(2));

        mahasiswa.remove(1);
        System.out.println("Setelah dihapus: " + mahasiswa);
    }
}
