package Composition.Example;

public class Test {
    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "Asus", "18.5", resolution);
        Kasa kasa = new Kasa("Shadow", "Shark", "Cam");
        Anakart anakart = new Anakart("B250", "Asus", 10, "W10");

        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);

        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitorKapat();
        pc.getAnakart().isletimSysYükle("Ubuntu");
    }


}
