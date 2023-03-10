package Arrays;

public class Array6 {
    // Iki boyutlu diziler;

    public static void main(String[] args) {
        
        int[][] array = new int[3][3];

        array[0][0] = 5;
        array[0][1] = 10;
        array[0][2] = 15;
        array[1][0] = 20;
        array[1][1] = 25;
        array[1][2] = 30;
        array[2][0] = 35;
        array[2][1] = 40;
        array[2][2] = 45;

        int toplam = 0;


        for (int i = 0; i < array.length; i++) {
            toplam = 0;
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+" ");
                toplam = toplam + array[i][j];
            
            }
            System.out.println();
            System.out.println(toplam);
        }
        System.out.println(toplam);
    }
}
