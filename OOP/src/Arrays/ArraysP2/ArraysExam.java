package Arrays.ArraysP2;

import java.util.Scanner;

public class ArraysExam {
    public static void main(String[] args) {

        //Lösung1

        int[] sayilar = new int[10];
        for(int i=0; i< sayilar.length; i++) {
            //sayilar[i] = i * i;
            sayilar[i] = (int) Math.pow(i, 2);
            System.out.println("Eleman: "+sayilar[i]);
        }

        //Lösung2

        //String[] aylar = new String[12];
        String[] aylar = {"Ocak","Subat","Mart","Nisan","Mayis","Haziran",
                "Temmuz","Agustos","Eylül","Ekim","Kasim","Aralik"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ayin Rakami: ");
        int ay = scanner.nextInt();
        System.out.println("Sectiginiz Ay: "+aylar[ay]);

    }
}
