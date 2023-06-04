package Projects.UserLogin;

import java.util.Scanner;

public class userLogin {
    static boolean aktive = true;
    static int loginZahl = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (aktive) {
            if (loginZahl > 0) {

                while (aktive) {
                    System.out.print("Username :");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();


                    boolean fazit = login(username, password);
                    if (fazit) {
                        System.out.println("Willkommen");
                        break;
                    } else {
                        loginZahl--;
                        System.out.println("Username und Password sind falsch");
                    }
                }

            }
            else {
                System.out.println("Ihr Anmelderecht ist abgelaufen " + " Ihr Konto wurde blockiert");
            }
        }
        else {
            System.out.println("Ihr Konto ist inaktive");
        }

    }

    public static boolean login(String username, String pass) {
        if (username.equals("firat") && pass.equals("123")) {
            return true;
        }
        else {
            if (loginZahl == 0) {
                System.out.println("Ihr Konto wurde blockiert");
                aktive = false;
            }
            return false;
        }

        }

}