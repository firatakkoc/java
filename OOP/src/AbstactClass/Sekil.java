package AbstactClass;

public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }

    // Somut metod
    public void isminiSoyle() {
        System.out.println("Bu obje "+isim+" objesidir.");
    }

    // Soyut metod
    // Bu metodu alt siniflar mutlaka yazmak zorunda kalicaklar.
    // Bu metodu kullanan siniflar kendileri tanimlama yapmalidir.
    // Cünkü her sinifin kullanim sekli farklidir.
    abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
