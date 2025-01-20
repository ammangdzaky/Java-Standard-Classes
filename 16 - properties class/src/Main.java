import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 - kebanyakan aplikasi java akan menyimpan konfigurasi file ke dalam bentuk properties file
 - properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=)
 - properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita

 properties class adalah class yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties
 */



public class Main {
    public static void main(String[] args) {


        try {

            // mengambil data dari properties (ngeload)
            Properties properties = new Properties();
            properties.load(new FileInputStream("database.properties"));
            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));

            // nyimpan data ke properties (gk perlu filenya ada nanti dibuatkan otomatis)
            properties.put("database.gmail", "=xxxx@xxx.gmail.com"); // param (key, value)
            properties.put("database.number", "00000000");
            properties.store(new FileOutputStream("database.properties"), "harus ada param komentar");

        } catch (IOException e) {
            System.out.println("Eror : " + e.getMessage());
        }


        try{
            Properties prop  = new Properties();
            prop.put("name","name");
            prop.put("age", "age");
            prop.put("gender", "gender");
            prop.store(new FileOutputStream("person.properties"), "membuat file person.properties");  // otomatis membuat file person.properties


        } catch (IOException e){
            System.out.println("Eror : " + e.getMessage());
        }



    }
}