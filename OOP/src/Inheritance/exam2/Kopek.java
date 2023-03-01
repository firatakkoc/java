package Inheritance.exam2;

public class Kopek extends Hayvan {
    
    private int disSayis;


    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayis){

    super(isim, kilo, boy, bacakSayisi);

    this.disSayis = disSayis;
    }

    public void kos(int hiz) {
        System.out.println("Kopek kosuyor...");

        super.hareketeGec(hiz);
    }



    public int getDisSayis() {
        return disSayis;
    }



    public void setDisSayis(int disSayis) {
        this.disSayis = disSayis;
    }


}