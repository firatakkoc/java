package Arrays.ArraysWithFor;

public class arrayandfor {
    public static void main(String[] args) {

        int[] a = new int[17];

        System.out.print("index: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i]);
            System.out.print(" | ");
        }
        System.out.println();
        System.out.print("Werte: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
            System.out.print(a[i]);
            System.out.print(" | ");
        }



    }
}
