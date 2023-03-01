package Inheritance;

// Inhertance : Bir Class'in baska bir Class'dan özelliklerini ve methodlarini miras almasidir; IS - A Yapisi

public class Yönetici extends Calisan { // Superclass or Basisclass
    
    private int sorumlu_kisi;


    public Yönetici(String isim,int maas,String departman, int sorumlu_kisi) {

        super(isim,maas,departman);
        this.sorumlu_kisi = sorumlu_kisi;        
    }

    public void zam_yap(int zam_miktari) {
        System.out.println("Calisanlara "+zam_miktari+ " TL Zam Yapildi");
    }

    public void bilgileriGöster() {
        System.out.println("Isim: " +getIsim());
        System.out.println("Maas: " +getMaas());
        System.out.println("Departman: " +getDepartman());
        System.out.println("Sorumlu Oldugu Kisi Sayisi: "+this.sorumlu_kisi);
    }

}
