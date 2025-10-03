package exceptionhandling;

public class ThrowExample {
    public static void cekUmur(int umur) {
        if (umur < 17) {
            throw new ArithmeticException("Umur belum cukup untuk mendaftar!");
        } else {
            System.out.println("Umur valid, silakan lanjut.");
        }
    }

    public static void main(String[] args) {
        cekUmur(15);  // ini akan melempar Exception
        System.out.println("Program selesai.");
    }
}

    
