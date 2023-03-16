package Interface;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökcene Hosgeldiniz");

        String sartlar = "## Yurdisi Cikis Kurallari ##\n"
                        +"1- Herhangi bir siyasi yasaginizin bulunmamasi lazim \n"
                        +"2- 15 TL Harc bedelini tam olarak yatirmalisiniz \n"
                        +"3- Gideceginiz ülkeye vizenizin olmasi gerekmektedir";

        String message = "Yurtdisi Cikis sartlarini saglamaniz gerekmektedir.";


        while(true){
            System.out.println("-----------------------------------------");
            System.out.println("");
            System.out.println("-----------------------------------------");
            System.out.println(sartlar);
            System.out.println("");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harc bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.yurtdisiHarciKontrol() == false) {
                System.out.println(message);
                continue; 
            }

            System.out.println("Siyasi Yasak kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }


            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("**Islemleriniz Basariyla Tamamlamdi**");
            System.out.println("Yurtdisina Cikis Yapabilirsiniz.");
            
        }
    }
}
