package ClassN.InnerClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen");
        String islemler = "Islemler\n"
                        +"1. Daire alani hesaplama\n"
                        +"2. Ücgen cevresi hesaplama \n"
                        +"3. Ic carpim hesaplama";
        
        while (true) {
            System.out.println(islemler);
            System.out.println("Islemi seciniz: ");

            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("done");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Dairenin Yari Capi: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);
            }
            else if (islem.equals("2")) {
                System.out.println("Kenar 1: ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2: ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3: ");
                int kenar3 = scanner.nextInt();

                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);

            }
            else if (islem.equals("3")) {
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");

                Problem.Fizik.icCarpim(vec1, vec2);
            }

            else {
                System.out.println("Gecersiz Islem");
            }


        }

    }
    
}
