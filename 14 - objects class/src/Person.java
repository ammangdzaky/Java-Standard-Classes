import java.util.Objects;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    public static void cekInfo(Person person){

        if (person != null){
            System.out.println(person.toString());  // ini contoh kalau tidak menggunalkan Object harus di cek terlebih dahulu karena jika null maka akan eror NullPointerException
        }
        System.out.println(Objects.hashCode(person)); // ini menggunakan Objects, walaupun data yang dimasukkan adalah null, tetap tidak eror
    }
}
