import java.util.InputMismatchException;
import java.util.Scanner;

public class ApkNambahNilaiDenganException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nilaiAwal = 0;

        while(true) {
            try {
                System.out.print("Masukkan nilai kamu        : ");
                nilaiAwal = sc.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("input harus int . Coba lagi!");
                sc.nextLine(); // membersihkan input yang tidak valid
            }
        }

        if (nilaiAwal < 75){
            System.out.println("Kasian, lu gak lulus");
            boolean mau = false;
            while(true) {
                try {
                    System.out.print("Mau pakai apk nambah nilai? (true/false)    : ");
                    mau = sc.nextBoolean();
                    break;
                } catch (InputMismatchException e){
                    System.out.println("input harus true/ false . Coba lagi!");
                    sc.next();
                }
            }

            if (!mau){
                System.out.println("Yaudah, lu gak lulus");
                return;
            } else{
                while(true){

                    while(true) {
                        try {
                            System.out.print("Masukkan nilai tambahan       : ");
                            int nilaiTambah = sc.nextInt();
                            nilaiAwal += nilaiTambah;
                            break;
                        } catch (InputMismatchException e){
                            System.out.println("input harus int . Coba lagi!");
                            sc.next();
                        }
                    }
                    if (nilaiAwal < 75){
                        System.out.println("Nilai lu belum cukup!");
                    } else{break;}
                }
            }

        }

        System.out.println("Selamat, anda lulus dengan nilai " + nilaiAwal);
    }
}
