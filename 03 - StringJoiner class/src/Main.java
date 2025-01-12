import java.util.StringJoiner;

/**
 - StringJoiner adalah class yang bisa digunakan untuk membuat string sequence yang dipisahkan dengan delimiter/pemisah
 - StringJoiner juga mendukung prefix(teks pembuka) dan suffix(teks penutup) jika kita ingin menambhkannya
 - ini sangat bagus ketika ada kasus misal kita ingin memprint array dengan format yang kita mau misalnya
 */

public class Main {
    public static void main(String[] args) {

        StringJoiner name = new StringJoiner(",");
        name.add("John");
        name.add("Jane");
        System.out.println(name);

        StringJoiner weap = new StringJoiner(", ","[","]");
        weap.add("Sacifical");
        weap.add("Favonious");
        weap.add("Iron String");
        System.out.println(weap);
        System.out.println();


        String[] waifus = new String[] {"Mikasa", "Tsukasa", "Miku"};
        StringJoiner joiner = new StringJoiner(", ", "(",")");
        for (String w : waifus){
            joiner.add(w);
        }

        String waifu = joiner.toString();
        System.out.println(waifu);



    }
}