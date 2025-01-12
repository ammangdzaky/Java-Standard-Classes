/**
 - seperti yang pernah kita bahas di materi Java dasar, String adalah obejct, artinya dia memiliki representasi class-nya
 - ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method apa saja yang tersedia di dokumentasinya
 - cara untuk melihat daftar method dengan cepat:
 tahan ctrl kemudian click class String
 saat sudah di Class String, tekan alt+7 untuk melihat strcture
 */

import java.util.Arrays;

/**
 BEBERAPA METHOD STRING

 - String toLowerCase()     : membuat string baru dengan format lower case
 - String toUpperCase()     : membuat string baru dengan format upper case
 - int length()             : mendapatkan panjang string
 - boolean startsWith(value) : mengecek apakah dimulai dengan string value
 - boolean endsWith(value)  : mengecek apakah diakhiri dengan string value
 - String[] split(value     : memotong string dengan string value
 */


public class Main {
    public static void main(String[] args) {

        // toLowerCase()
        String lower = "LowerCASE";
        System.out.println();
        System.out.println(lower.toLowerCase());


        // toUpperCase()
        String upper = "UpperCASE";
        System.out.println();
        System.out.println(upper.toUpperCase());

        // int length()
        String name = "Tsukasa Tsukoyomi";
        System.out.println();
        System.out.println(name.length());

        // boolean startsWith()
        System.out.println();
        System.out.println(name.startsWith("Tsukasa"));

        // boolean endsWith()
        System.out.println();
        System.out.println(name.endsWith("Tsukasa"));

        // String[] split(value)
        String waifuWaifu = "Tsukasa Mikasa Miku";
        String[] arrayWaifu  = waifuWaifu.split(" ");
        System.out.println();
        System.out.println(Arrays.toString(arrayWaifu));

        int count = 1;
        for (String waifu : arrayWaifu){
            System.out.println(count + ". " + waifu);
            count++;
        }

        // bonus
        String animal = "chicken lion tiger";
        String[] defult = animal.split(" ", -1);  // default dari parameter limit yaitu int < 0 (tidak ada batasan ele di dalam array)
        String[] oneEle = animal.split(" ", 1);   // max satu saja element di dalam array
        String[] twoEle = animal.split(" ", 2);   // max dua saja element di dalam array dst
        String[] threeEle = animal.split(" ", 3);
        System.out.println();
        System.out.println(Arrays.toString(defult));
        System.out.println(Arrays.toString(oneEle));
        System.out.println(Arrays.toString(twoEle));
        System.out.println(Arrays.toString(threeEle));

        //bonus
        System.out.println();
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());  // hanya bernilai true jika ""

        //bonus
        String suki = "shitpost untuk kesehatan iman";
        char[] charSuki = suki.toCharArray();
        System.out.println();
        System.out.println(Arrays.toString(charSuki));
        for (var c : charSuki){
            System.out.println(c);
        }
    }
}