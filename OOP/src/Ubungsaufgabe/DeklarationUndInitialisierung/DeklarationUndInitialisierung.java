package Ubungsaufgabe.DeklarationUndInitialisierung;

public class DeklarationUndInitialisierung {
    public static void main(String[] args) {
        int aWholeNumber; // Deklaration;
        double notAWholeNumber; // Deklaration;
        String aString; // Deklaration;

        aWholeNumber = 0; //Initialisierung;
        notAWholeNumber = 0.0; // Initialisierung;
        aString = "Test"; // Initialisierung;
        System.out.println(aWholeNumber);
        System.out.println(notAWholeNumber);
        System.out.println(aString);

        int anotherWholeNumber = 1; //Deklaration und Initialisierung;
        double anotherNotWholeNumber = 1.0; //Deklaration und Initialisierung;
        String anotherString = "Test"; //Deklaration und Initialisierung;

        System.out.println(anotherWholeNumber);
        System.out.println(anotherNotWholeNumber);
        System.out.println(anotherString);

    }
}
