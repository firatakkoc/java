package Polymorphism;

// Super Class Olusturduk;
class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "hayvan konusuyor";
    }

}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "miyavliyor";
    }
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havliyor";
    }
}

class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+ "kisniyor";
    }
}



public class Main {
    
    public static void main(String[] args) {
        
        Hayvan hayvan = new Kedi("Tekir ");
        Hayvan hayvan2 = new Kopek("Karabas");
        System.out.println(hayvan.konus());
        System.out.println(hayvan2.konus());

    }
}
