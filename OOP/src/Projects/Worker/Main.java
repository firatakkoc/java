package Projects.Worker;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Hosgeldiniz--");

        String islemler = "Islemler \n"
                        +"1. Yazilimci\n"
                        +"2.Yönetici\n"
                        +"Cikis icin 'q'ya basin";    
        System.out.println(islemler);

        while(true) {
            System.out.println("Islemi Secin");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor...");
                break;
            }

            else if (islem.equals("1")){
                Second yazilimci = new Second("Firat", "Akkoc", 7524, "Java");
                String yazilimci_islem = "1. Format At\n"
                                        +"2. Bilgileri Göster"
                                        +"Cikis icin 'q";
                System.out.println(yazilimci_islem);
                while (true) {
                    System.out.print("Islemi Seciniz: ");
                    String yIslem = scanner.nextLine();

                    if (yIslem.equals("q")) {
                        System.out.println("Closed");
                        break;
                    }
                    else if (yIslem.equals("1")) {
                        System.out.print("OS Girin: ");
                        String isletimSis = scanner.nextLine();
                        yazilimci.formatAt(isletimSis);
                    }

                    else if (yIslem.equals("2")){
                        yazilimci.showInfo();
                    }


                    else {
                        System.out.println("Gecersiz Yazilimci");
                    }

                }
            }

            else if (islem.equals("2")){
                Manager yonetici = new Manager("Daniel", "Lowe", 5, 10);
                String yonetici_islem = "Yöentici Islemler\n"
                                        +"1. Zam Yap \n"
                                        +"2. Bilgileri Göster\n"
                                        +"Cikis icin 'q";
                System.out.println(yonetici_islem);
                while(true) {
                    System.out.print("Islem Secin: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("closed");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Zam Miktari Talebi: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }

                    else if (y_islem.equals("2")){
                        yonetici.showInfo();
                    }
                }

            }

            else {
                System.out.println("--Gecersiz Islem--");
            }
        }

    }

}
