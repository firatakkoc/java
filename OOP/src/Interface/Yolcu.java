package Interface;
import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    //Constructor icerisinde kullanicidan deger aliyoruz;
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harc Bedeli Girin: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi Yasaginiz Var mi? ('Evet' yada 'Hayir')");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        }
        else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu?'Evet' yada 'Hayir')");
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        }
        else {
            this.vizeDurumu = false;
        }
    }
    
    
    
    @Override
    public boolean siyasiYasakKontrol() {
        if (this.harc < 15) {
            System.out.println("Lüften Harc Bedelini Tam Yatirin (15 TL)");
            return false;
        }
        else {
            System.out.println("Harc islemi: ## √ ##");
            System.out.println();
            return true;
        }
        
    }
    @Override
    public boolean vizeDurumuKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi Yasak Tespit Edildi.");
            System.out.println("Cikis Yapamazsiniz");
            return false;
        }
        else {
            System.out.println("Siyasi Yasak Bulunamadi");
            System.out.println("## √ ##");
            return true;
        }
        
    }
    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.vizeDurumu == true) {
            System.out.println("Vize islemler tamamlandi.");
            System.out.println("## √ ##");
            return true;
        }
        else {
            System.out.println("Gideceginiz yere vizeniz yok");
            System.out.println("Cikis Verilmedi: ## X ##");
            return false;
        }
        
    }


}
