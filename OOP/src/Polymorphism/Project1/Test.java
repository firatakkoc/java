package Polymorphism.Project1;
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        System.out.println("Beybalde Programina Hosgeldiniz:");
        System.out.println("Cikis icin: q");
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hnagi Beyblade?: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Shutdown");
                break;
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade =  fabrika.beybladeUret(islem);
                if (beyblade == null) {
                    System.out.println("gecerli isim grin");
                }
                else {
                    beyblade.bligileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }scanner.close();
    }       
}
