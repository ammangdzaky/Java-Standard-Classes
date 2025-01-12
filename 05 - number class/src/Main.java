/**
 - semua number class yang bukan primitf memiliki parent class yang sama, yaitu class Number
 - class Number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe data number lain
 - hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya
 */

/**
 Konversi String ke Number

 - Long,Integer,Short, dan Byte memiliki static method untuk melakukan konversi dari String ke number
 - parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitf
 - ValueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitf
 - method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke number
 */

public class Main {
    public static void main(String[] args) {

        // konversi
        Integer intVal = 10;
        Long longVal = intVal.longValue();
        Byte byteVal = longVal.byteValue();
        Float floatVal = byteVal.floatValue();
        System.out.println(longVal.getClass().getName());
        System.out.println(byteVal.getClass().getName());
        System.out.println(floatVal.getClass().getName());


        // Konversi String ke Nuumber
        String seribu = "1000";
        int primitf = Integer.parseInt(seribu);  // string menjadi int primitf
        Integer nonPrimitf = Integer.valueOf(seribu); // string menjadi Integer non primitf
        System.out.println(seribu);
        System.out.println(primitf);
        System.out.println(nonPrimitf);
        System.out.println(nonPrimitf.equals(seribu));



        String seribuKomaSatu = "1000.1";
//        Integer a = Integer.valueOf(seribuKomaSatu);  //EROR NumberFormatException
        Float flot = Float.valueOf(seribuKomaSatu);
        System.out.println(flot);
    }
}