package Polymorphism.Project1;

public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;
    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bligileriGoster() {
        // TODO Auto-generated method stub
        super.bligileriGoster();
        System.out.println("Kutasal Canavar:"+ kutsalCanavar);
        System.out.println("Gizli Yetenek:"+gizliYetenek);
    }
    @Override
    public void kutsalCanavarOrtayaCikar() {
        // TODO Auto-generated method stub
        System.out.println(getbeybladeci()+" "+kutsalCanavar+"'i Ortaya Cikiyor...");
        System.out.println(getbeybladeci()+" "+"'in Saldirisi: Hayalet Kasirgasim");
    }
}
