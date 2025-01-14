/**
 - scanner sebenarnya bagiaan dari Java IO (input output), dan ini akan dibahas di materi terpisah
 - namun sekarang kita akan bahas sekilas tentang class scanner
 - class scanner hadir sejak java 5
 - class scanner adalah class yang digunakan untuk membaca input, entah dari file, console, dll
 - class scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar membuat program java menggunakan console / terminal
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 method

 - nextLine()           : membaca string
 - nextInt()            : membaca int
 - nextLong()           : membaca long
 - nextBoolean()        : membaca booleean
 dll
 */


public class Main {
    public static void main(String[] args) {

        System.out.println("ANGGAP SAJA INI APLIKASI PENAMBAH NILAI\n");

        Scanner sc = new Scanner(System.in);  // System.in artinya nanti dia baca dari console

        System.out.print("masukkan nilai kamu : ");

        int nilaiAwal = sc.nextInt();


        if (nilaiAwal < 75) {
            System.out.print("lu blum lulus, mau pake apk nambah nilai? (true/false)    : ");
            boolean mau = sc.nextBoolean();
            if (mau == false) {
                System.out.println("yaudah, lu gak lulus");
            } else {
                System.out.print("Masukkan nilai tambahan   : ");
                while (true) {
                    var nilaiTambahan = sc.nextInt();
                    nilaiAwal += nilaiTambahan;
                    if (nilaiAwal < 75) {
                        System.out.println("masih belum cukup bjir, tambah lagi");
                    } else {
                        break;
                    }
                }
            }
        }

        if (nilaiAwal >= 75) {
            System.out.println("selamat, anda lulus dengan nilai : " + nilaiAwal);
        }


    }
}