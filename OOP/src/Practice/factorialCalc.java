package Practice;
import java.util.Scanner;

public class factorialCalc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi girin: ");

        int deger = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i < deger; i++) {
            factorial = factorial * i;

            System.out.println("Factorial: "+factorial);
        }
        scanner.close();

    }
}
