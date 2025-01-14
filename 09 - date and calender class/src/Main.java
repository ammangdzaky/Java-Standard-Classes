/**
 - tiap bahsa pemprograman biasanya memiliki representasi tanggal, di Java juga sama, ada class date adn calender yang bisa kita
 gunakan sebagai referensi tanggal
 - sebenarnya java 8 sudah ada cara manipulasi tanggal yang baru menggunakan java date time API, namun itu kita akan bahas di course terpisah
 - sekarang kita akan fokus menggunakan class date and calender
 */

import java.util.Date;
import java.util.Calendar;

/**
 HUBUNGAN DATE DAN CALENDAR

 - class date adalah class representasi tanggal sampai presisi milisecond
 - namun di class date sudah banyak method yang deprecated (tidak direkomendasika digunakan), sehingga untuk memanipulasi date tanggal, kita sekarang
 harus melakukan kombinasi antara class Date dan Calender
 - sederhananya Date untuk reprensetasi tanggal, dan Calender untuk manipulasi tanggal
 */


public class Main {
    public static void main(String[] args) {

        // KODE : menggunakan class date
        Date date = new Date();
        var time = date.getTime();
        System.out.println(date);
        System.out.println(time);


        // KODE : Menggunakan class Calendar
        Calendar kalender = Calendar.getInstance();   // membuat waktu terkini
        System.out.println(kalender.getTime());

        // dalam memanipulasi clander ada dua cara, yaitu set (benar-benar mengubah) dan juga add (hanya menambha, misal skarang
        // thun 2020 trus kita masukkan param 10 pada method add maka returnnya yaitu 2030)

        kalender.set(Calendar.YEAR, 2015);
        kalender.add(Calendar.YEAR, -3);
        kalender.set(Calendar.MONTH, Calendar.DECEMBER);
        kalender.set(Calendar.DAY_OF_MONTH, 12);
        kalender.set(Calendar.HOUR_OF_DAY, 12);
        kalender.set(Calendar.MINUTE, 12);
        kalender.set(Calendar.SECOND, 12);
        kalender.set(Calendar.MILLISECOND, 12);

        System.out.println(kalender.getTime());
        System.out.println(kalender.get(Calendar.DAY_OF_MONTH));
    }
}