package Inheritance;
// Inhertance : Bir Class'in baska bir Class'dan özelliklerini ve methodlarini miras almasidir; IS - A Yapisi

public class Calisan { // Subclass
    
    private String isim;
    private int maas;
    private String departman;


    // Constructor
    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    

    public String getIsim() {
        return isim;
    }



    public void setIsim(String isim) {
        this.isim = isim;
    }



    public int getMaas() {
        return maas;
    }



    public void setMaas(int maas) {
        this.maas = maas;
    }



    public String getDepartman() {
        return departman;
    }



    public void setDepartman(String departman) {
        this.departman = departman;
    }



    // Method    
    public void calis() {
        System.out.println("Calisan Calisiyor...");
    }

    // Bilgileri gösterme fonksiyonu
    public void bilgileriGöster(){
        System.out.println("Isim: " +isim);
        System.out.println("Maas: " +maas);
        System.out.println("Departman: " +departman);
        System.out.println("Sorumlu Oldugu Kisi Sayisi: ");
    }

    // departman degistirme fonksiyonu
    public void departmanDegistir(String yeni_departman) {
        System.out.println("Departman Degistiriliyor:");
        this.departman = yeni_departman;

        System.out.println("Yeni Departman"+yeni_departman);

    }
}
