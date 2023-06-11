package Constructors.NewConstructors.Schuler;

public class Schuler {

    public int  id;
    public String vorname;
    public String nachname;

    // Constructor :Wenn wir ein Objekt erstellen möchten, werden wir nach den erforderlichen Informationen gefragt.
    public Schuler(int id, String vorname, String nachname) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    // Diese Method gibt Schüler Informationen aus.
    public static void info(int id, String vorname, String nachname) {

        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String reset = "\u001B[0m";

        System.out.println("Schüler Informationen");
        System.out.println(red+"ID: "+id+reset);
        System.out.println(green+"Vorname: "+reset+vorname);
        System.out.println(green+"Nachname: "+reset+nachname);
    }



}
