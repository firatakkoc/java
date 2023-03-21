package Kontrollstrukturen;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // iki basamakli sayi üretme

        int sansliSayi = (int) (Math.random() * 99 + 1);
        System.out.print("Tahmin: ");
        int tahmin = scanner.nextInt();
        int sansliSayi1B = sansliSayi / 10;
        int sansliSayi2B = sansliSayi % 10;

        int tahminSayi1B = sansliSayi / 10;
        int tahminSayi2B = sansliSayi % 10;


        if (sansliSayi == tahmin) {
            System.out.println("Teblikler Bildiniz: "+tahmin + "Dogru cevap:"+sansliSayi);
            System.out.println();
        }
        else if (sansliSayi1B == tahminSayi2B && sansliSayi2B == tahminSayi1B) {
            System.out.println("5bin "+"Dogru Cevap: "+sansliSayi);
        }
        else if (sansliSayi1B == tahminSayi1B || sansliSayi1B == tahminSayi2B || sansliSayi2B == tahminSayi1B ||
        sansliSayi2B == tahminSayi2B) {
            System.out.println("1000Tl"+" Dogru cevap: "+sansliSayi);
        }
        else {
            System.out.println("kaybettiniz"+" Dogru cevap: "+sansliSayi);
        }


    }
}
