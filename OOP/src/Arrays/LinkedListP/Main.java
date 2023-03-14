package Arrays.LinkedListP;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");

        sehirleri_turla(sehirler);

    }

    public static void sehirleri_turla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        islemleri_bastir();
        Scanner scanner = new Scanner(System.in);

        // LinkedList dolu mu bos mu kontrol ediyoruz;
        if (iterator.hasNext()) {
            System.out.println("Sehir Bulunmuyor");
        }
        boolean cikis = false;
        boolean ileri = true;
        while (!cikis) {
            System.out.print("Bir Islem Seciniz: ");
            islem = scanner.nextInt();
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Sehre Gidiliyor: "+iterator.next());
                    }
                    else {
                        System.out.println("Sehir Kalmadi");
                        ileri = true;
                    }
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    } 
                    if (iterator.hasPrevious()) {
                        System.out.println("Sehre Gidiliyor: "+iterator.previous());
                    }
                    else {
                        System.out.println("Sehir Turu Basladi...");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan Cikiliyor...");
                    break;
            }
        }

    }

    // (islemleri_bastir) Metodunu olusturuyoruz...;
    public static void islemleri_bastir(){

        System.out.println("0 - Islemleri Görüntüle");
        System.out.println("1 - Bir sonraki sehre git");
        System.out.println("2 - Bir önceki sehre git");
        System.out.println("3 - Uygulamadan Cik");
    }
}