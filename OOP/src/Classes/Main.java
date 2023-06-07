package Classes;

import Classes.Students.Students;

public class Main {
    public static void main(String[] args) {
        String red = "\033[0;31m";
        String green = "\u001B[32m";
        String reset = "\033[0m";  // Text Reset

        Students student1 = new Students();

        student1.id = 1001;
        student1.vorname = "Firat";
        student1.nachname = "Akkoc";

        System.out.println(red + "Schüler Informationen"+ reset);
        System.out.println(green+"ID :"+ student1.id+reset);
        System.out.println("Vorname :"+ student1.vorname);
        System.out.println("Nachname :"+ student1.nachname);

    }
}
