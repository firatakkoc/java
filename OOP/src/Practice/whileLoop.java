package Practice;
import java.util.Scanner;
public class whileLoop {

    public static void main(String[] args) {
        int i = 0;

        while (i <= 3) {
            System.out.println("Java is working");
            i++;
        }
        System.out.println("Loops is done");

        Scanner scanner = new Scanner(System.in);

        int toplam = 0; // Varianble yaratiyoruz ve deger atiyoruz;
        // döngü icinde degisken tanimlayip kosul ve islemi veriyoruz;
        for (int j = 0; j<10; j++ ) {
            // Input icin bir Var tanimliyoruz ve atama yapiyoruz;
            System.out.print("Sayi giriniz: ");
            int sayi = scanner.nextInt();
            // alinan sayilari ilk bastaki var'a atiyoruz;
            toplam += sayi;
            System.out.println(toplam);
        }
        scanner.close();
    }

}
