import java.util.UUID;

/**
 - saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key misalnya
 - java menyediakan sebuah class UUID atau singkatan Universally Unique Identifier
 - UUID adalah format standard untuk membuat unique value yang telah terjamin
 */


public class Main {
    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

        for(int temp = 1; temp <= 20; temp++){
            UUID uuid2 = UUID.randomUUID();
            String unique = uuid2.toString();
            System.out.println(temp + ". " + unique);
        }
    }
}