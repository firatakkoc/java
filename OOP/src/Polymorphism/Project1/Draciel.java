package Polymorphism.Project1;

public class Draciel extends Beyblade{
    private String kutsalCanvar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanvar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanvar = kutsalCanvar;
    }
    

    @Override
    public void bligileriGoster() {
        // TODO Auto-generated method stub
        super.bligileriGoster();
        System.out.println("Kutsal Canvar Adi: " +kutsalCanvar);
    }
    
    @Override
    public void kutsalCanavarOrtayaCikar() {
        // TODO Auto-generated method stub
        System.out.println(getbeybladeci()+" " +kutsalCanvar+ "'i Ortaya Cikiyor...");
        System.out.println(getbeybladeci()+" "+"'in Saldirisi: Kaplan Pencesi");
    }

}

