package Projects.Worker;
public class Manager extends Objects {
    private int sorumluKisiSayisi;

    
    public Manager(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }


    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        super.showInfo();
        System.out.println("Yönetici Sorumlu Oldugu Kisi Sayisi: "+sorumluKisiSayisi);
    }

    public void zamYap(int zamMiktar) {
        System.out.println(getAd()+ " calisanlara "+ zamMiktar+" kadar zam yapildi.");
    }


    
}
