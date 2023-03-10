package Arrays;


public class arrays {

    public static void array_bastir(int[] array) {
        for (int i = 0; i < array.length; i++)
        System.out.println("Element "+(i+1)+": "+ array[i]);
    }
    
    
    public static void main(String[] args) {

        int[] b = {10,20,30,40,50,60};
        array_bastir(b);
        
        // int[] sayilar = new int[5];
        // sayilar[0] = 12;
        // sayilar[1] = 20;
        // sayilar[2] = 5;
        // sayilar[3] = 47;
        // sayilar[4] = 124;

        // System.out.println(sayilar[4]);

        //Kisa yol;
        // int[] sayilar = {12 , 6, 4, 47, 124};
        // System.out.println(sayilar[4]);

        // String[] isim = {"Firat", "Akkoc"};
        // System.out.println(isim[0]);

        // int[] a = {1,2,3,4,5,6,7,8,9,10};
        // System.out.println(a[0]);
        // System.out.println(a[6]);
        // System.out.println(a[9]);
        
        // int tipin de 5 tane deger alan bir array olusturduk;
        // int[] a = new int[5];

        // // döngü icinde [i] degiskenine deger atadik ve kosullarini verdik;
        // // burada her döngüde [i]'nin degeri 5 olana kadar arttir dedik;
        // for (int i = 0; i < 5; i++) {
        //     // [i]'nin aldigi degerleri [a] degiskenine atadik;
        //     // her döngüde bu degerleri 4 ile carpip 2 ile topladik;
        //     a[i] = i * 4 + 2;
        //     System.out.println(a[i]);
        // }
        
        // Scanner scanner = new Scanner(System.in);
        // int[] a = new int[5];
        // for (int i = 0; i < 5; i++){
            
        //     System.out.print("Deger gir; ");
        //     a[i] = scanner.nextInt();
            
        // }

    }


}
