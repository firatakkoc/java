package ClassN.NonInnerClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NonInnerClass.Factorial faktorial = new NonInnerClass().new Factorial();
        NonInnerClass.Asal asal = new NonInnerClass().new Asal();
        NonInnerClass.Alan alan = new NonInnerClass().new Alan();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi girin: " );
        int s = scanner.nextInt();

        if (asal.asal_mi(s)) {
            System.out.println("Bu sayi asaldir");
        }
        else {
            System.out.println("Asal Degildir.");
        }

        faktorial.faktoriyel();
        alan.daire_alan(5);

    }
}
