package Practice;
import java.util.Scanner;

public class breakCont {
    public static void main(String[] args) {
        
        int i = 1;
        while (i<10) {
            if (i==6) {
                i++;
                continue;
            } 
            System.out.println(i);
            i++;
        }
        System.out.println("done");

        Scanner scanner = new Scanner(System.in);

        int sayi;
        while(true) {
            System.out.println("-1- Sayisini gir");

            sayi = scanner.nextInt();

            if (sayi == 1 ) {
                break;
            }
        }
        scanner.close();
    }
    
}
