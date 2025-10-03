package exceptionhandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {
    // method ini melempar IOException
    public static void inputNama() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan nama: ");
        String nama = br.readLine();
        System.out.println("Halo, " + nama);
    }

    public static void main(String[] args) {
        try {
            inputNama();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }
    }
}
