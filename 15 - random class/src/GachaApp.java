import java.util.Random;

public class GachaApp {
    public static void main(String[] args) {


        Random random = new Random();
        double hoki = 0;
        double incrs = 0;

        for (int pity = 0; pity <= 90 ; pity++){
            if (pity < 75){
                hoki = random.nextDouble() * (101 - 0.6) + 0.6;  // percentase 0.6 (0.6 - 100)
            } else if (pity >= 75 ){
                incrs += 6;
                hoki = random.nextDouble() * (101 - incrs) + incrs;}  // percentase meningkat 6
//            } else if (pity == 90){
//                hoki = 100;
//            }

            System.out.println("pity ke-" + pity + " hoki: " + String.format("%.2f", hoki));

            if (hoki >= 100){
                System.out.println("LU DAPAT NAHIDA CUIII");
                break;
            }
        }

    }
}
