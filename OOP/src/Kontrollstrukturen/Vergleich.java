package Kontrollstrukturen;

public class Vergleich {
    public static void main(String[] args) {

        // Normal if kullanimi
        int s1 = 10, s2 = 5;

        if (s1 > s2) {
            System.out.println("s1 s2'den büyüktür.");
        } else if (s2 > s1) {
            System.out.println("s2 s1'den büyüktür");
        }
        else {
            System.out.println("s1 s2'ye esittir");
        }


        // ternary if kullanimi

        int a = 10, b = 8, c = 0;
        c = (a<b) ? (a-b) : (a+b);
        System.out.println(c);

    }
}
