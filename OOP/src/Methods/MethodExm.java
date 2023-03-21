package Methods;

import java.util.Scanner;

public class MethodExm {
    public static void main(String[] args) {

        int kullaniciSecimi = -1;
        /*while (kullaniciSecimi != 0) {
            kullaniciSecimi = menuGoster();
        }*/

        for (;;) {
            kullaniciSecimi = menuGoster();

            if (kullaniciSecimi == 0) {
                break;
            }

            Scanner scanner =new Scanner(System.in);
            System.out.print("Birinci Sayi: ");
            int fn1 = scanner.nextInt();
            System.out.print("Ikinci Sayi: ");
            int sn2 = scanner.nextInt();

            switch (kullaniciSecimi){
                case 1:
                    ikiSayiyiCarp(fn1,sn2);
                    break;
                case 2:
                    int toplam = ikiSayiyiTopla(fn1,sn2);
                    System.out.println("Toplam: "+toplam);
                    break;
                case 3:
                    ikiSayiKuvveti(fn1,sn2);
                    break;
            }

        }

    }

    public static void ikiSayiyiCarp(int fn1, int sn2){
        System.out.println("Sonuc: "+fn1 * sn2);
    }

    public static int ikiSayiyiTopla(int fn1, int sn2){
        int toplam = fn1 + sn2;
        return toplam;
    }

    public static void ikiSayiKuvveti(int fn1, int sn2){
        double sonuc = Math.pow(fn1,sn2);
        System.out.println("Sayilarin Kuvveti; "+sonuc);
    }


    public static int menuGoster(){
        System.out.println("---Menu---");
        System.out.println("1. Iki sayinin carpimini bul ");
        System.out.println("2. Iki sayinin toplamini bul ");
        System.out.println("3. Iki sayinin kuvvetini bul ");
        System.out.println("Cikis icin '0'");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Seciminizi Yazin: ");
        int secim = scanner.nextInt();
        return secim;

    }

}
