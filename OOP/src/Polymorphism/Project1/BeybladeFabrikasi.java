package Polymorphism.Project1;

public class BeybladeFabrikasi {
    
    public Beyblade beybladeUret(String beybalde_Turu) {

        if (beybalde_Turu.equals("Dragon")){
            return new Dragon("Takao", 800, 300, "Mavi Ejder", "Kutsal Canavarla Konusma");
        }
        else if (beybalde_Turu.equals("Dranze")) {
            return new Dranza("Kai",600,400, "Kirmizi Anka");
        }
        else if (beybalde_Turu.equals("Drayga")) {
            return new Dranza("Rei",800,250,"Beyaz Kaplan");
        }
        else if (beybalde_Turu.equals("Draciel")) {
            return new Dranza("Max",400,1000,"Kara Kaplumbaga");
        }
        else {
            return null;
        }
    }
}
