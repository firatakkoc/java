package Encapsulation;
public class Abone {
    
    public String isim;
    public int bakiye;
    public String sehir;


    public void dogalgaz_kullan(int miktar) {

    if ((this.bakiye - miktar) > 0) {
        System.out.println("Yeterli Bakiye Yok");
    }
    else if (this.bakiye > 120) {
        System.out.println("120 TL'den fazla kullanamazsiniz.");
    }
    else {
        this.bakiye -= miktar;

        if (this.bakiye <= 0) {
            System.out.println("Bakiyeniz Bitmistir");
        }
        else {
            System.out.println("Yeni Bakiye: "+bakiye );
        }
    }
    }

    public void bakiyeOgren() {
        System.out.println("Bakiye: "+bakiye);
    }

}