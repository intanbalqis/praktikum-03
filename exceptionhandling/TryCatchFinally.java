package exceptionhandling;
public class TryCatchFinally{
    public static void main(String[] args) {
        try {
            int angka = 10 / 0;
            System.out.println("Hasil: " + angka);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan, meskipun ada error.");
        }
    }
}


    
