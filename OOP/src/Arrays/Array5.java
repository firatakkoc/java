package Arrays;
import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sayilar = new int[10];

        int toplam = 0;

        int ilkSonToplam = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Sayi Girin: ");
            sayilar[i] = input.nextInt();
            toplam += sayilar[i];
        }

        ilkSonToplam = sayilar[0] + sayilar[9];
        double oran = ilkSonToplam / toplam;

        System.out.println("--------------------------");

        System.out.println("Dizinin Toplami: "+toplam);
        System.out.println("--------------------------");
        System.out.println("Ilk ve son Degerlerin Toplami: "+ ilkSonToplam);
        System.out.println("--------------------------");
        System.out.println("Ilk ve son sayilarin toplamina orani: "+oran);

        input.close();

    }
    
}
