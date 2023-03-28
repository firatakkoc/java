package AbstactClass.Example;

// Kedi sınıfı, Hayvan sınıfını genişletiyor (extends)
public class Kedi extends Hayvan {

    // Kurucu metot (constructor)
    public Kedi(String isim) {
        super(isim);
    }

    // sesCikar metodunu dolduruyoruz (override)
    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }
}

