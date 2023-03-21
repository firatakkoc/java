package Practice.Exercise;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Klavyeden girilen vize ve final notlarınına göre öğrencinin dersi geçip geçmediğini söyleyen
        //bir uygulama yazınız.(Geçme notu : 50, vizenin %40ı, finalin %60ı geçerlidir.)

        // The midterm and final grades entered on the keyboard, which tells whether the student has passed or failed the course.
        //Write an application.(Passing grade: 50, 40% of the midterm, 60% of the final is valid.)

        System.out.print("Visum: ");
        double visum = scanner.nextDouble();
        System.out.print("Final: ");
        double fnal = scanner.nextDouble();
        double avrg = 0;

        avrg = visum * 0.4 + fnal * 0.6;

        if (avrg >= 90) {
            System.out.println("AA / "+avrg);
        }
        else if (avrg >= 80) {
            System.out.println("BA / "+avrg);
        }
        else if (avrg >= 70) {
            System.out.println("BB / "+avrg);
        }
        else if (avrg >= 60) {
            System.out.println("CA / "+avrg);
        }
        else if (avrg >= 50) {
            System.out.println("CB / "+avrg);
        }
        else {
            System.out.println("FF / "+avrg);
        }



    }
}
