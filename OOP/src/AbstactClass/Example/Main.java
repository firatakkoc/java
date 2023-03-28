package AbstactClass.Example;

public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi("Pamuk");
        kedi.isimYazdir(); // "Bu hayvanın ismi: Pamuk" çıktısını verir
        kedi.sesCikar(); // "Miyav!" çıktısını verir
    }
}

