package Projects.Worker;
public class Second extends Objects{
    private String diller;
    
    // Bu Classin kendi Constructors'i;
    public Second(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;

    }

    public void formatAt(String oS) {
        System.out.println(getAd()+" "+ oS+"'OS Isletim Sistemi Yüklüyor");
    }

    @Override
    public void showInfo() {
        //TODO Auto-generated method stub;
        super.showInfo();
        System.out.println("Yazilimcini Bildigi Diller: "+diller);

    }

    
}
