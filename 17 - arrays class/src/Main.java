/**
 singkat aja, array class adalah class yang berisikan static method yang bisa kita gunakan untuk memanipulasi
 data array, seperti pencarian dan pengurutan
 */

import java.util.Arrays;

/**
 method method

 - binarySearch(array, value)       : mencari value di array
 - copyOf()                         : menyalin data array
 - equals(array1, array2)           : membandingkan array1 dan array2
 - sort(array)                      : mengurutkan array
 - toStrinf(array)                  : mengembalikan representasi string
 */


public class Main {
    public static void main(String[] args) {


        String[] waifu = {"Tsukatsa", "Mikasa", "Miku"};
        System.out.println(Arrays.toString(waifu));
        Arrays.sort(waifu);
        System.out.println(Arrays.toString(waifu));

        System.out.println(Arrays.binarySearch(waifu, "Miku"));  // returnnya yaitu integer index
        System.out.println(Arrays.binarySearch(waifu, "sakura beban"));

        String[] waifuCopy = Arrays.copyOf(waifu, 2);
        String[] waifuCopyWithRange = Arrays.copyOfRange(waifu, 1, 3);  // sampai index sebelum 3 (3 tidak masuk)
        System.out.println(Arrays.toString(waifuCopy));
        System.out.println(Arrays.toString(waifuCopyWithRange));
    }
}