package Practice;
import java.util.Scanner;

public class forLoop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi girin; ");
        int sayi1 = scanner.nextInt();
        System.out.print("2.Sayi girin; ");
        int sayi2 = scanner.nextInt();

        for (int i = sayi1; i<=sayi2; i++ ) {
            if (i % 2==0){
                System.out.println(i);
            }
        }
        scanner.close();

    }
}
