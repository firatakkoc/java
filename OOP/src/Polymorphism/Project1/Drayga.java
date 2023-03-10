package Polymorphism.Project1;

public class Drayga extends Beyblade {

    private String kutsalCanavar;
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
    public String getKutsalCanavar() {
        return kutsalCanavar;
    }
    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }
    @Override
    public void bligileriGoster() {
        // TODO Auto-generated method stub
        super.bligileriGoster();
        System.out.println("Kutsal Canavar adi: "+ kutsalCanavar);
    }
    @Override
    public void kutsalCanavarOrtayaCikar() {
        // TODO Auto-generated method stub
        System.out.println(getbeybladeci()+" "+kutsalCanavar+"'i Ortaya Cikiyor...");
        System.out.println(getbeybladeci()+" "+"'in Saldirisi: Kaplan Pencesi");
    }
    
    


}
