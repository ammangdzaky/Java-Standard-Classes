/**
 - string adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang dilakukan
 di Java adalah membuat String baru
 - jika kita ingin memanipulasi string dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan memakan memory yang cukup besar,
 untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder
 */

/**
 StringBuffer vs StringBuilder

 - kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunkan untuk memanipulasi String
 - yang membeddakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe
 - jika kita ingin memanipulasi String secara paraler bersamaan, disarankan menggunakan StringBuffer, namun jika tidak butuh paraler,
 cukup gunakan StringBuilder
 - karena StringBuffer dibuat agar thread save, maka secara otomatis performanya lebih lambat dibandtingkan StringBuilder
 */

import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {


        String mikasa = "Mikasa";
        mikasa = "Mikasa Ackerman";
        /**
         diatas: di dalam memory ada dua data yaitu "mikasa" dan "mikasa ackerman"
         jadi penggunaan seperti ini tidak direkomendasikan, apalagi jika misal kita ingin memanipuasi banyak string
         */


        // KODE : menggunakan string builder

        // append
        StringBuilder name = new StringBuilder();
        name.append("Mikasa");
        name.append(" ");
        name.append("Ackerman");
        String waifu = name.toString();  // di memory hanya ada satu data

        StringBuilder nama = new StringBuilder("dzaky");

        // insert(int offset, String str)
        nama.insert(0, "Abdurrahman ");
        System.out.println(nama);
        System.out.println();

        // delete(int start, int end)
        nama.delete(12, nama.length());
        System.out.println(nama);
        System.out.println();

        // replace(int start, int end, String str)
        nama.replace(0, nama.length(), "Asep");
        System.out.println(nama);
        System.out.println();

        // reverse()
        nama.reverse();
        System.out.println(nama);
        System.out.println();

        // charAt(int index)
        System.out.println(nama);
        System.out.println(nama.charAt(3));
        System.out.println();

        // substring(int start, int end)  -> param int end bisa kosong, jadi mengambil sampai akhir strng
        System.out.println(nama.substring(0));
        System.out.println(nama.substring(0,2));
        System.out.println();

        // setCharAt(int index, char ch)
        nama.setCharAt(0,'A');
        System.out.println(nama);


    }
}