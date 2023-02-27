package Constructors;

public class Araba {

    private String renk;
    private int kapilar;
    private int tekerler;
    private String motor;
    private String marka;
    
    
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public int getKapilar() {
        return kapilar;
    }
    public void setKapilar(int kapilar) {
        if (kapilar < 3) {
            System.out.println("---Kapi Sayisi 3'den kücük olamaz.---");
        }
        else {
            this.kapilar = kapilar;
        }
    }
    public int getTekerler() {
        return tekerler;
    }
    public void setTekerler(int tekerler) {
        if (tekerler < 4) {
            System.out.println("---Teker Sayisi 4'den kücük olamaz---");
        }
        else {
            this.tekerler = tekerler;
        }
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getMarka() {
        return this.marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }

}
