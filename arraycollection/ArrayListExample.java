import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");

        System.out.println("Daftar Buah:");
        for (String b : buah) {
            System.out.println(b);
        }
    }
}

