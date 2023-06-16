package Arrays.ArrayWithRandomChar;

import java.util.Scanner;
import java.util.Random;

public class RandomChar {
    public static void main(String[] args) {
        Random rnd = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Array Länger: ");
        int n = scanner.nextInt();

        char[] c = new char[n];

        for (int i = 0; i < c.length; i++) {
            char chars = (char)(rnd.nextInt(n) + 'a');
            c[i] = chars;
            System.out.print(c[i]);
            if(i != (c.length-1)) {
                System.out.print(" | ");
            }
        }
    }
}
