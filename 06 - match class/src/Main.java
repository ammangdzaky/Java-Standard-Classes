/**
 class math merupakan class utilities yang berisikan banyak sekali static method untuk operasi numerik, seperti trigonometri,
 logarithm, akar pangkat, dll
 */

/**
 BEBERAPA METHOD DI CLASS MATH

 - abs(x)               : mengembaikan nilai absolut dari x
 - max(a, b)            : mengembalikan nilai maximum dari dua angka
 - min(a, b)
 - round(x)             : membulatkan angka ke bilangan bulat terdekat
 - sqrt(x)              : mengembalikan nilai kuadrat dari x
 - pow(a, b)            : mengembalikan nilai a pangkat b
 - random()             : mengemblikan nilai acak dari  0.0(inklusif) dan 1.0(ekslusif)
 - PI()                 : mendapatkan nilai pi (22/7)
 */



public class Main {
    public static void main(String[] args) {

        System.out.println(Math.max(1000,2000));
        System.out.println(Math.min(1000,2000));

        var phi = Math.PI;
        System.out.println(phi);


    }
}