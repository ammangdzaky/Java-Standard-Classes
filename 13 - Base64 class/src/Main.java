import java.util.Base64;

/**
 - buat programer web pasti tahu tentang base64, yaitu encoding yang bisa digunakan untuk mengubah binary data ke text yang aman
 - aman disini bukan dari sisi security, tapi aman dari kesalahan parsing
 */

public class Main {
    public static void main(String[] args) {

        String data = "username admin pass admin1234";

        // mengubah binary ke teks
        String encode = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encode);

        // mengubah ke sebaliknya (teks ke binary)
        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);
    }
}