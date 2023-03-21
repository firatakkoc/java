package Practice.Exercise;
import java.util.Scanner;
public class Problem1 {
    // Klavyeden girilen 3 sayının ortalamasını alan bir uygulama yazınız
    // Write an application that calculates the average of 3 numbers entered from the keyboard.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Third number: ");
        int num3 = scanner.nextInt();

        double average =(double) (num1 + num2 + num3) / 3;
        System.out.println("Average of all numbers: "+average);
    }
}
