import java.util.Objects;

/**
 - awas jangan tertukar, ini class objects, bukan object
 - object adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk operasi object atau melakukan
 pengecekan sebelum operasi-nya dilakukan

 Beberapa method

 - hashCode()
 - toString()
 - equals(o)
 -isNull()
 */


public class Main {
    public static void main(String[] args) {


        Person.cekInfo(null);

        System.out.println();

        Person.cekInfo(new Person("Dzaky",18));
    }
}