package Encapsulation;
public class Main {
    public static void main(String[] args) {
        // Abone abone = new Abone();

        // abone.isim = "Firat Akkoc";
        // abone.bakiye = 200;
        // abone.sehir = "Istanbul";

        // abone.dogalgaz_kullan(200);

        GelismisAbone abone = new GelismisAbone("Firat Akkoc", 200 , "Istanbul");

        abone.bakiyeOgren();
    }

}
