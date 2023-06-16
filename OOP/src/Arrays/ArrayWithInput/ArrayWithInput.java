package Arrays.ArrayWithInput;

import java.util.Scanner;

public class ArrayWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie lange Ihre Array? :");
        int n = scanner.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            System.out.print("Bitte geben Sie " +(i+1)+ ". :Werte: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("");

        System.out.print("Werte: ");
        for(int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
            if(i != (a.length)) {
                System.out.print(" | ");
            }
        }

        System.out.println("");

        System.out.print("Index: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i]);
            if(i != (a.length-1)) {
                System.out.print(" | ");
            }

        }
    }
}
