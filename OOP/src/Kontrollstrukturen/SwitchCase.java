package Kontrollstrukturen;

public class SwitchCase {
    public static void main(String[] args) {

        int werkTage = 3;

        // if kullanimi

        if (werkTage==1) {
            System.out.println("Montag");
        }
        else if (werkTage == 2) {
            System.out.println("Dienstag");
        }
        else if (werkTage==3){
            System.out.println("Mittwoch");
        }
        else if (werkTage==4) {
            System.out.println("Donnerstag");
        }
        else if (werkTage==5) {
            System.out.println("Freitag");
        }
        else if (werkTage==6) {
            System.out.println("Samstag");
        }
        else if (werkTage==7) {
            System.out.println("Sonntag");
        }
        else {
            System.out.println("Falschen Tag");
        }


        // Switch-Case Yapisi

        int werkTage2 = 4;

        switch (werkTage2) {
            case 0:
                System.out.println("Schreib bitte Nummer");
                break;
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("keinen Tag");
        }

    }
}
