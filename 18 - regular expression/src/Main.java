/**
 - regular expression atau diisngkat regex adalah cara untuk melakukan pola pencarian
 - biasanya dilakukan untuk pencarian dalam data string
 - secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di aplikasi word
 - regex adalah pencarian yang lebih advanced dibandingkan pencarian text biasanaya, misal kita ingin mencari semua kata yang mengandung
 diawali huruf a dan diakhiri huruf a, dan lain lain
 */

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 - java sudah menyediakan package java.util.regex yang berisikan utilitas untuk melakukan proses regex
 - secara garis bsera terdapat dua class yang dpat kita gunakan, yaitu Pattern class dan Matcher class
 - Pattern class adalah representasi hasil kompilasi dari pola regex yang kita buat
 - Matcher class adalah engine untuk melakukan pencarian dari pattern yang sudah kita buat
 */



public class Main {
    public static void main(String[] args) {

        String pass = "admin1234 admin Admin1234 Ambatukan554 omagad123 omagadaja";
        String[] passwords = pass.split(" ");

        Pattern validPassword = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+");

        for (String password : passwords){
            Matcher matcher = validPassword.matcher(password);
            if (matcher.matches()){
                System.out.println(password);
            }
        }

    }
}