package Polymorphism.Project1;

public class Dranza extends Beyblade {
    
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bligileriGoster() {
        // TODO Auto-generated method stub
        super.bligileriGoster();
        System.out.println("Kutsal Canavar: "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        // TODO Auto-generated method stub
        System.out.println(getbeybladeci()+" "+ kutsalCanavar+ "'i Ortaya Cikariyor ");
        System.out.println(getbeybladeci()+"'Saldirisi: Alev Kilici");
    }
    
    
}