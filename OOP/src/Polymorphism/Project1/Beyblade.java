package Polymorphism.Project1;

public class Beyblade {
    
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;
    
    
    
    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }



    public String getbeybladeci() {
        return beybladeci;
    }



    public void setbeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }



    public int getDonusHizi() {
        return donusHizi;
    }



    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }



    public int gesaldiriGucu() {
        return saldiriGucu;
    }



    public void sesaldiriGucu(int saldiriGucu) {
        this.saldiriGucu =saldiriGucu;
    }
    
    public void saldir(){
        System.out.println(getbeybladeci()+ " " + saldiriGucu +" ve " + donusHizi + "ile saldiriyor" );
    }
    public void kutsalCanavarOrtayaCikar() {
        System.out.println("bu bayblade kustal canavari yok");
    }

    public void bligileriGoster(){
        System.out.println("Isim: "+ beybladeci);
        System.out.println("Saldiri Gücü:"+ saldiriGucu);
        System.out.println("Dönüs Hizi: "+donusHizi);
    }

    
}
