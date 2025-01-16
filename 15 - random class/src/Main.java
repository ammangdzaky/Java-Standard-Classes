import java.util.Random;

/**
 random class adalah class yang bisa kita gunakan untuk meng-generate random number
 */


public class Main {
    public static void main(String[] args) {


        Random random = new Random();

        int acak = random.nextInt(100);  // membuat angka acak dari 0-100
        int acak2 = random.nextInt(101) + 101; // membuat angka acak adari 100-200

        System.out.println(acak);
        System.out.println(acak2);
    }
}