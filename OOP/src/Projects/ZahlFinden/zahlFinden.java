package Projects.ZahlFinden;

import java.util.Scanner;

public class zahlFinden {
    public static void main(String[] args) {
        // Herausfinden, ob Zahlen gerade oder ungerade sind;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Zahlen: ");
        int anzahl = scanner.nextInt();

        int[] zahlen = new int[anzahl];


        for (int i = 0; i < zahlen.length; i++){
            System.out.print("Zahl eingeben: ");
            zahlen[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("-------------------------------------");

        for ( int zahl : zahlen) {
            kalkulation(zahl);

        }


    }



    public static void kalkulation(int k) {
        if (k % 2 == 0) {
            System.out.println(k + " ist Eben");
        }
        else {
            System.out.println(k + " ist Einzeln");
        }
    }

}
