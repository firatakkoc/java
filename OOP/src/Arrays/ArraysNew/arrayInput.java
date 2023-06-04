package Arrays.ArraysNew;

import Inheritance.exam2.Calistir;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Reihelänge ein: ");
        int reiheLänge = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[reiheLänge];


        for (int i = 0; i < name.length; i++ ) {
            System.out.print("Bitte geben Sie "+ (i) + ". den Indexwert des Verzeichnisses ein:");
            name[i] = scanner.nextLine();
        }

        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
}
