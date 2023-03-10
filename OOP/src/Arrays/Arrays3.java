package Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        
        // Tek boyutlu Array olusturma;
        int[] array = {1,2,3,4,5,6,};
        System.out.println(array[0]);
        
        // Cok boyutlu Array olusturma;
        int[][] array2 = new int[2][2];
        System.out.println(array2[0][1]);

        // Cok boyutlu array icine manuel deger ekleme;
        int[][] array3 = {{10,20},{30,40}};
        System.out.println(array3[0][1]);

        // Kullanicidan array icin deger alma;
        Scanner scanner = new Scanner(System.in);

        int[][] array4 = new int[2][2];

        for (int i=0; i<2; i++) {

            for (int j=0; j<2; j++) {

                array4[i][j] = scanner.nextInt();
                //System.out.println("i = "+i+ " j = "+j);
            }
        }scanner.close();

        System.out.println("---Sonuc---");

        for (int i=0; i<2; i++) {

            for (int j=0; j<2; j++) {

                
                System.out.println(array4[i][j]+" ");
            }
        }


        //Cok boyutlu array'e deger ekleme;
        // array2[0][0] = 10;
        // array2[0][1] = 20;
        // array2[1][0] = 30;
        // array2[1][1] = 40;

        // System.out.println("Sifirinci satir, Sifirinci Sutun: "+array2[0][0]);
        // System.out.println("Sifirinci satir, birinci Sutun: "+array2[0][1]);
        // System.out.println("Birinci Satir, sifirinci Sutun: "+array2[1][0]);
        // System.out.println("Birici satir, Birinci sutun: "+array2[1][1]);

    }
}
