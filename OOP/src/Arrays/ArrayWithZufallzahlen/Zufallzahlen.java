package Arrays.ArrayWithZufallzahlen;

import java.util.Scanner;

public class Zufallzahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie lange Ihre Array? :");
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            int min = 0;
            int max = 100;
            int randomInteger = (int) (Math.random() * (max - min + 1) + min);
            a[i] = randomInteger;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i != (a.length-1)) {
                System.out.print(" | ");
            }
        }
    }
}
