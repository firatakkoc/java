package Arrays.ArraysNew;

import java.util.Scanner;

public class arrayForeach {
    public static void main(String[] args) {

        // Primzahlen finden und Ergebnisse anzeigen,

        int asalToplam = 0;
        int asalOlmayanToplam = 0;

        String asalSayilar = " ";
        String asalOlmayanSayilar = " ";

        boolean asalMi = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Islem miktari: ");

        int sayiMiktar = scanner.nextInt();

        int[] sayilar = new int[sayiMiktar];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Dizinin "+ i +". degerini girin: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int sayi : sayilar) {
            for (int j = 2; j < sayi; j++){
                if (sayi % j == 0) {
                    asalOlmayanToplam += 1;
                    asalOlmayanSayilar += String.valueOf(sayi) + " ";
                    break;
                }
                else {
                    asalMi = true;
                }
            }
            if (asalMi) {
                asalToplam +=1;
                asalSayilar += String.valueOf(sayi) + " ";
            }
        }


        }
}
