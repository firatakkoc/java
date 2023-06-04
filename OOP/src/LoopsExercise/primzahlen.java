package LoopsExercise;

import java.util.Scanner;

public class primzahlen {
    public static void main(String[] args) {

        //Herausfinden, ob eine Zahl eine Primzahl ist oder nicht;
        System.out.print("Geben Sie eine Zahl: ");
        Scanner scanner = new Scanner(System.in);


        int z = scanner.nextInt();
        boolean primzahl = false;
        for (int i = 2; i < z; i++) {
            if(z % i == 0) {
                primzahl = false;
                break;
            }
            else {
                primzahl = true;
            }
        }

        if (primzahl) {
            System.out.println(z+" ist eine Primzahl");
        }
        else {
            System.out.println(z + " ist keine Primzahl");
        }
    }
}
