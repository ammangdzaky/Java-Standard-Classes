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

        StringBuilder name = new StringBuilder();
        name.append("Mikasa");
        name.append(" ");
        name.append("Ackerman");
        String waifu = name.toString();  // di memory hanya ada satu data



    }
}