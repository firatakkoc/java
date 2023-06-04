package Aufgabe_01;

public class Main {

    /*
    Die printf-Methode in Java wird verwendet, um formatierte Ausgaben auf der Konsole oder in anderen Ausgabestreams zu erzeugen. Sie ermöglicht die spezifische Formatierung von Werten basierend auf Formatierungssymbolen.
    Hier sind einige wichtige Informationen über die printf-Methode und die Formatierungssymbole:
    Die printf-Methode gehört zur Klasse PrintStream und wird normalerweise auf System.out angewendet, um Text auf der Konsole auszugeben.
    DIe rormaterungssymbole werden von einem Prozentzeichen % gefolgt und geben den Datentyp und die gewunschte Formanerung an.
    Einige gängige Formatierungssymbole sind:
    %d: Ganzzahl (int)
    %f: Gleitkommazahl (float oder double)
    %s: Zeichenkette (String)
    %c: Zeichen (char)
    %b: Boolescher Wert (boolean)
    Die Formatierungssymbole können auch zusätzliche Optionen enthalten, um die Ausgabe genauer anzupassen. Zum Beispiel:
    %10d: Ganzenzahl mit einer Mindestoreite von 10 Zeichen
    %.2f: Gleitkommazanl mit genau zwei Nachkommastellen
    %-20s: Zeichenkette mit einer Mindestbreite von 20 Zeichen, linksbündig ausgerichtet
    Die printf-Methode kann mehrere Argumente akzeptieren, die durch Kommas getrennt sind. Diese Argumente werden den entsprechenden Formatierungssymbolen zugeordnet.
    Die printf-Methode unterstützt auch die Verwendung von Escape-Sequenzen wie %n für einen Zeilenumbruch.
    i. Hier ist ein Beispiel, das die Verwendung der Prott-Methode mit verschiedenen Formatierungssymbolen zeigt:

    int zahl = 42:
    double pi = 3.14159,
    String text = "Hallo, welt!";
    Text: Hallo, Welt!
    seileso wahr = tower
    System out printf"Zahl: %d%g", zahl);
    Sustero out printi"Pi: %. 2fón'
    System out orid"Text: tos7:0", text;
    Suste
    en out ord "Wahr: son, wahr);
     */
    public static void main(String[] args) {

        int zahl = 5;
        System.out.printf("Zahl: %d%n", zahl);

        double pi = 3.14159;
        System.out.printf("Pi: %.2f%n", pi);

        String text = "Hallo, Welt!";
        System.out.printf("Text: %s%n", text);

        boolean wahr = true;
        System.out.printf("Wahr: %b%n", wahr);


    }
}
