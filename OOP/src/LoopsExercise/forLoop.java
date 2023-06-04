package LoopsExercise;

public class forLoop {
    public static void main(String[] args) {
        // Drucken gerader Zahlen von 1 bis 10;
        for (int i = 0; i <= 10; i++) {
            if (i%2==0){
                System.out.print(i+ " - ");
            }

        }

        System.out.println("");

        System.out.println("-----------------------------------");

        // Drucken ungerader Zahlen von 1 bis 10;

        for (int i = 0; i <= 10; i++) {
            if (i%2 == 1){
                System.out.print(i+ " - ");
            }

        }
        System.out.println("");

        System.out.println("-----------------------------------");

        // Summe gerader Zahlen zwischen 1 und 10;

        int s = 0;
        for (int i = 0; i <= 10; i++) {
            if (i%2 == 0){
                s += i;
            }
        }
        System.out.println(s);

        System.out.println("-----------------------------------");

        // Summe ungerader Zahlen zwischen 1 und 10:

        int k = 0;
        for (int i = 0; i <= 10; i++){
            if(i%2 == 1){
                k += i;
            }
        }
        System.out.println(k);




    }
}
