/**
 - ketika aplikasi java kita berjalan, kita bisa melihat informasi environment tempat palikasi java berjalan
 - informasi itu terdapat di class runtime
 - class runtime tidak bisa dibuat, secara otomatis java akan membuat single object. Kita bisa mengakses object tersebut menggunakan
 static method getRuntime() milik class Runtime
 */

/**
 Method di runtime class

 - int availableProcessor()           : mendaptkan jumlah core cpu
 - long freeMemory()                  : mendapatkan jumlah memory bebas di JVM
 - long totalMemory()                 : mendaptkan jumlah total memory di JVM
 - long maxMemory()                   : mendapatkan jumlah maximum memory di JVM
 - void gc()                          : menjalankan garbage collector untuk menghilangkan data di memoryyang sudah tidak terpakai
 */

public class Main {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        System.out.println("available processor: " + rt.availableProcessors());
        System.out.println("free memory: " + rt.freeMemory());
        System.out.println("total memory: " + rt.totalMemory());
        System.out.println("max memory: " + rt.maxMemory());
    }
}