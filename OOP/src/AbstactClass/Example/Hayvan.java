package AbstactClass.Example;

// Hayvan isimli abstract bir sınıf oluşturuyoruz
public abstract class Hayvan {
    private String isim;

    // Kurucu metot (constructor)
    public Hayvan(String isim) {
        this.isim = isim;
    }

    // Abstract bir metod tanımlayalım
    public abstract void sesCikar();

    // Normal bir metod tanımlayalım
    public void isimYazdir() {
        System.out.println("Bu hayvanın ismi: " + isim);
    }
}

