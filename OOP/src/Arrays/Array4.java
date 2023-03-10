package Arrays;

public class Array4 {
    public static void main(String[] args) {
        
        int[] sayilar = {10,11,20,22,30,33};
        String[] isimler = {"Firat", "Ozan", "Ugurkan", "Selim"} ;

        // Standart For döngüsü;
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("++++++++++++++++++++++++++++++++");
        
        // Standart for döngüsü;
        for (int j = 0; j < isimler.length; j++) {
            System.out.println(isimler[j]);
        }

        System.out.println("++++++++++++++++++++++++++++++++");

        // ForEach ile döngü
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}
