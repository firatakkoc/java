package Ubungsaufgabe.DeklarationUndInitialisierung;

public class SelbstDeklarierenUndDefinieren {
    public static void main(String[] args) {
        
        // Ich deklariere eine Variable "birnen" vom Typ (int);

        int birnen = 3; // Ich weise ihr den Wert drei zu;

        System.out.println("3 erwartet: "+ birnen);
        // Ich addiere fünf zu dem Wert;

        birnen = birnen + 5;
        System.out.println("8 erwartet: " +(birnen));
        
        // Ich deklariere eine Variable "Apfel" und weise ihr den Wert fünf zu;
        int apfel = 5;
        System.out.println("5 erwartet: "+apfel);

        //Ich subtrahiere ihr zwei dem Wert;

        apfel = apfel - 2;
        System.out.println("3 erwartet: "+apfel);



    }
}
