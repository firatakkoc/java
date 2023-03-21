package ClassN.NonInnerClass;

import java.util.Scanner;

public class NonInnerClass {
    // Örnek Acisindan Class Adi Math diyelim;
    private double PI = Math.PI;
    public class Factorial{

        public void faktoriyel(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sayi Girin; ");
            int s = scanner.nextInt();

            int fact = 1;
            for (int i =2; i <= s; i++) {
                fact *= i;
            }
            System.out.println("Faktoriyel: "+fact);
        }
    }
    public class Asal{
        public boolean asal_mi(int s){
            int i = 2;
            while (i<s) {
                if (s % i == 0) {
                    return false;
                }
                i++;

            }
            return true;
        }
    }

    public class Alan{
        public void daire_alan(int yaricap){
            System.out.println("Dairenin Alani: "+(yaricap * yaricap * PI));
        }
    }
}
