package AbstactClass;

public class Daire extends Sekil{

    private int yariCap;
    public Daire(String isim, int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" alani: "+ (Math.PI * yariCap * yariCap));

    }
}
