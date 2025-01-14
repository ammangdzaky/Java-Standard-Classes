/**
 class system adalah class yang berisikan banyak utility static method di java, contohnya sebelumnya kita sudah sering menggunakan
 method println mmilik field out di class system
 */

/**
 Method di system class

 - String getenv(key)               : mendapatkan environment variable sistem operasi
 - void exit(status)                : mengehentikan program java
 - long currentTimeMilis()          : mendapatkan waktu saat ini dalam milisecond
 - long nanoTime()                  : mendapatkan waktu saat ini dalam nanosecond
 - void gc()                        : menjalankan java garbage collection
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(System.getenv("USERNAME"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.exit(0);

        System.out.println("Kode ini tidak dieksekusi karena javanya keburu di close");
    }
}