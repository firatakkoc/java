package Practice;

public class Recursive {
    static int fibonacci(int x) {
        if (x<=1) {
            return x;
        }
        else {
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("6.sayi: "+fibonacci(6));
        System.out.println("23.sayi: "+fibonacci(23));
    }
}
