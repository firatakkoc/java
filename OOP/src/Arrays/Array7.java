package Arrays;

public class Array7 {
    public static void main(String[] args) {
        
        int[][] dizi = new int[5][6];
        int sayi = 0;

        for (int i = 0; i < dizi.length; i++){
            for (int j = 0; j < dizi.length; j++) {
                dizi[i][j] = sayi;
                System.out.print(dizi[i][j]+" ");
                sayi += 2;
            }
            sayi +=10;
            System.out.println();
        }
        System.out.println("Döngü bitti");
    }
}
