import java.util.StringTokenizer;

/**
 - StringTokenizer adalah class yang bisa digunakan untuk memotong string menjadi token atau string yang lebih kecil
 - kita bisa memotong String dengan delimiter yang kita mau


 */


public class Main {
    public static void main(String[] args) {

        String waifus = "Tsukatsa, Anju, Mikasa, Lena, Miku";
        StringTokenizer st = new StringTokenizer(waifus, ", ");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println("\n" + st);
    }
}