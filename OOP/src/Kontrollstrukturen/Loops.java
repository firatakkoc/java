package Kontrollstrukturen;

public class Loops {
    public static void main(String[] args) {

        for (int i=0; i < 6; i++){
            System.out.println("Döngü "+(i+1)+": Java");
        }
        System.out.println("done");

        int sayi = 1;
        while (sayi < 10) {
            System.out.println("Kosul Kosul Saglandi: "+sayi);
            sayi++;
        }

        int s1 =0;
        do {
            System.out.println("Hallo: "+s1);
            s1++;
        }while (s1 < 5);
    }
}
