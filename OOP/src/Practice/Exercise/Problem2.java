package Practice.Exercise;

import java.util.Scanner;

public class Problem2 {
    // Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız.
    //  Write an application that gives the type of triangle whose sides are entered from the keyboard.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First: ");
        int num1 = scanner.nextInt();
        System.out.print("Second: ");
        int num2 = scanner.nextInt();
        System.out.print("Third: ");
        int num3 = scanner.nextInt();

        if ((num1 == num2) && num1 == num3 && num2 == num3) {
            System.out.println("The equilateral triangle");
        }
        else if ((num1 != num2) && (num1 != num3) && (num2 != num3)) {
            System.out.println("Scalene Triangular");
        }
        else {
            System.out.println("Isosceles Triangle");
        }

    }
}
