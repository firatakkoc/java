package Aufgabe160623;

import java.util.Scanner;
import java.util.Arrays;
public class aufgabeMitArray {
    public static int loginZahl = 3;
    public static boolean login = false;
    public static boolean array2D = false;
    public static int[] myArray1D = new int[0];
    public static int[][] myArray2D = new int[0][0];
    public static String red = "\u001B[31m";
    public static String gelb = "\u001B[33m";
    public static String grun = "\u001B[32m";

    public static String reset = "\u001B[0m";
    public static String cyan = "\u001B[36m";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[46mWILLKOMMEN MARENA_APP\u001B[0m");

            while (!login) {
                System.out.print("USERNAME: ");
                String user = scanner.nextLine();
                System.out.print("PASSWORD: ");
                String pass = scanner.nextLine();
                userLogin(user, pass);

            }


        if (loginZahl > 0) {

            boolean menuSyc = true;
            while (menuSyc) {
                userMenu();
                System.out.print("Bitte Wählen: ");
                int wahl = scanner.nextInt();
                if (wahl == 1){
                    arrayMenu();
                    boolean arrayMenuSyc = true;
                    while (arrayMenuSyc) {
                        System.out.print("Bitte Wählen Array Art: ");
                        int arrayWahl = scanner.nextInt();
                        if (arrayWahl == 1) {
                            myArray1D = array1DErstellt();
                            array2D = false;
                            break;
                        }
                        else if (arrayWahl == 2) {

                            myArray2D = array2DErstellt();
                            array2D = true;
                            break;
                        } else if (arrayWahl == 3) {
                            System.out.println("array menü ist geendet");
                            break;
                        }
                        else {
                            System.out.println("Bitt von 1 bis 3");
                        }
                    }


                }
                else if (wahl == 2){
                    if (array2D){

                        arrayPrint2D(myArray2D);
                    }
                    else {
                        arrayPrint(myArray1D);
                    }


                } else if (wahl == 3) {
                    if(array2D) {
                        System.out.print("Welche Zahl: ");
                        int such = scanner.nextInt();
                        boolean found = searchArray2D(myArray2D, such);

                        if (found) {
                            System.out.println(grun+"gibt es drin"+reset);
                        } else {
                            System.out.println(red+"gibt es kein drin."+reset);
                        }
                    }
                    else {
                        System.out.print("Welche Zahl: ");
                        int such = scanner.nextInt();
                        boolean suchen = suchArray(myArray1D, such);
                        if (suchen) {
                            System.out.println(such + grun+": gibt es drin"+reset);
                        } else {
                            System.out.println(such + red+": gibt es kein drin"+reset);
                        }
                    }


                } else if (wahl == 4) {
                    if(array2D) {
                        sortArray2D(myArray2D);

                    }
                    else {
                        sortArray(myArray1D);
                    }



                } else if (wahl == 5) {
                    if (array2D) {
                        ruckArray2D(myArray2D);
                    }
                    else {
                        ruckArray(myArray1D);
                    }


                }
                else if (wahl == 6) {
                    System.out.println("\u001B[41m***AUF WIDERSEHEN***\u001B[0m");
                    break;
                }
                else {
                    System.out.println("-------------------------");
                    System.out.println("Bitte zwischen 1 und 6;");
                }

            }
        }

    }

    public static void userLogin(String username, String password){

        String correctUsername = "Sina";
        String correctPassword = "Marena85!";

            if (username.equals(correctUsername) && password.equals(correctPassword)) {

                System.out.println("Anmeldung ist erfolgreich");
                System.out.println("");
                System.out.println("\u001B[34;7m***WILLKOMMEN***\u001B[0m");
                System.out.println("---------------------------------------");
                login = true;

            } else {
                System.out.println(red+"Username ist Falsch"+reset);
                System.out.println(gelb+"Sie haben " + (loginZahl - 1) + " Anmelden"+reset);
                loginZahl--;
                if (loginZahl == 0) {
                    System.out.printf(red+"Sie haben kein lohgin zahl"+reset);
                    login = true;
                }
            }
    }


    public static void userMenu(){
        Scanner scanner = new Scanner(System.in);
        String menu = "\n"
                + "[1]: Array Erstellen\n"
                + "[2]: Anzeigen \n"
                + "[3]: Suchen\n"
                + "[4]: Sortieren\n"
                +" [5]: Rückwerts rausgeben\n"
                + "[6]: Exit";
        System.out.println(cyan+menu+reset);
    }


    public static void arrayMenu(){
        Scanner scanner = new Scanner(System.in);
        String menu = "\n"
                + "[1]: Array 1D\n"
                + "[2]: 2D \n"
                + "[3]: Exit";
        System.out.println(cyan+menu+reset);
    }

    public static int[] array1DErstellt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie lange Array?: ");
        int arrayLang = scanner.nextInt();
        int[] arrays = new int[arrayLang];
        for (int i = 0; i < arrayLang; i++) {
            System.out.print("Index "+ (i)+". ");
            int a = scanner.nextInt();
            arrays[i] = a;
        }

        return arrays;

    }

    public static int[][] array2DErstellt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie lange Array 1 ?: ");
        int arrayLang = scanner.nextInt();
        System.out.print("Wie lange Array 2 ?: ");
        int arrayLang2 = scanner.nextInt();
        int[][] arrays = new int[arrayLang][arrayLang2];
        for (int i = 0; i < arrayLang; i++) {
            for (int j = 0; j < arrayLang2; j++) {
                System.out.print("Index: [" + i + "][" + j + "]: ");
                arrays[i][j] = scanner.nextInt();
            }
        }

        return arrays;
    }

    public static void arrayPrint(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if(i != (myArray.length-1)) {
                System.out.print("\u001B[31;1m | \u001B[0m");
            }

        }
        System.out.println("");

    }


    public static void arrayPrint2D(int[][] myArray) {


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
                if (j != myArray[i].length - 1) {
                    System.out.print("\u001B[31;1m | \u001B[0m");
                }
            }
            System.out.println();
        }


    }


    public static boolean suchArray(int[] myArray, int such) {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == such) {
                return true;
            }
        }
        return false;
    }


    public static boolean searchArray2D(int[][] array, int such) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == such) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < myArray1D.length; i++) {
            System.out.print(myArray1D[i]);
            if(i != (myArray1D.length-1)) {
                System.out.print("\u001B[31;1m | \u001B[0m");
            }
        }
        System.out.println("");
    }

    public static void sortArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    public static void ruckArray(int[] array) {

        for (int i = myArray1D.length-1; i >= 0 ; i--) {
            System.out.print(myArray1D[i]);
            if(i != (myArray1D.length-1)) {
                System.out.print("\u001B[31;1m | \u001B[0m");

            }
        }
        System.out.println("");
    }

    public static void ruckArray2D(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j]);
                if (j != 0) {
                    System.out.print("\u001B[31;1m | \u001B[0m");
                }
            }
            System.out.println();
        }
    }

}



