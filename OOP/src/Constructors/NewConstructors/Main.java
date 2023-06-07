package Constructors.NewConstructors;

import Constructors.NewConstructors.Suchler.Schuler;

public class Main {
    public static void main(String[] args) {

        Schuler schuler1 = new Schuler(1001, "Firat", "Akkoc");

        Schuler.info(schuler1.id, schuler1.vorname, schuler1.nachname);

        Schuler schuler2= new Schuler(1002, "Ozan", "Akkoc");

        Schuler.info(schuler2.id, schuler2.vorname, schuler2.nachname);


    }
}
