package Kassenbon;
import java.util.Scanner;

import javax.xml.transform.Source;

public class WarenListe {
    private double wurst;
    private double kaese;
    private double brot;
    private double dvd;

    public WarenListe(double wurst, double kaese, double brot, double dvd) {
        this.wurst = wurst;
        this.kaese = kaese;
        this.brot = brot;
        this.dvd = dvd;
    }

    public double getWurst() {
        return wurst;
    }
    public void setWurst(double wurst) {
        this.wurst = wurst;
    }
    public double getKaese() {
        return kaese;
    }
    public void setKaese(double kaese) {
        this.kaese = kaese;
    }
    public double getBrot() {
        return brot;
    }
    public void setBrot(double brot) {
        this.brot = brot;
    }
    public double getDvd() {
        return dvd;
    }
    public void setDvd(double dvd) {
        this.dvd = dvd;
    }
    Scanner scanner = new Scanner(System.in);
    public void korbErstellen(/*int anzWurst, int anzKaese, int anzBrot, int anzDvd, double brieftasche*/) {
        double summe = 0;
        System.out.print("Anzahl der Wurst: ");
        int anzWurst = scanner.nextInt();
		summe = summe + anzWurst * wurst;
        System.out.println("------------------------------");
        System.out.print("Anzahl des Käse: ");
        int anzKaese = scanner.nextInt();
		summe = summe + anzKaese * kaese;
        System.out.println("------------------------------");
        System.out.print("Anzahl des Brot: ");
        int anzBrot = scanner.nextInt();
		summe = summe + anzBrot * brot;
        System.out.println("------------------------------");
        System.out.print("Anzahl des DVD: ");
        int anzDvd = scanner.nextInt();
		summe = summe + anzDvd * dvd;
        System.out.print("Wie viele haben Sie Geld: ");
        double brieftasche = scanner.nextDouble();
        System.out.println("");
        System.out.println("#################################");

        
        if (summe > brieftasche) {
			System.out.println("Sie haben nicht genug Geld in Ihrer Brieftasche");
		} else {
			// Strings lassen sich sehr gut formatieren:
			// http://docs.oracle.com/javase/6/docs/api/java/util/Formatter.html#syntax
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", anzWurst, wurst));
			System.out.println(String.format("%30.2f EUR", anzWurst * wurst));

			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Käse", anzKaese, kaese));
			System.out.println(String.format("%30.2f EUR", anzKaese * kaese));

			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Brot", anzBrot, brot));
			System.out.println(String.format("%30.2f EUR", anzBrot * brot));

			System.out.println(String.format("%-9s %2d x %5.2f EUR", "DVD", anzDvd, dvd));
			System.out.println(String.format("%30.2f EUR", anzDvd * dvd));

			System.out.println("__________________________________");

			System.out.println(String.format("%-9s %20.2f EUR", "Gesamt", summe));
			System.out.println(String.format("%-9s %20.2f EUR", "Gegeben", brieftasche));
			System.out.println();
			System.out.println(String.format("%-9s %20.2f EUR", "Zurück", brieftasche - summe));
		}
	}
}