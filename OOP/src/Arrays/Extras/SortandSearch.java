package Arrays.Extras;
import java.util.Arrays;
public class SortandSearch {
    public static void main(String[] args) {
        int[] array = {3,4,12,9,2,5};
        Arrays.sort(array);

        int value = Arrays.binarySearch(array, 12);

        if (value < 0) {
            System.out.println("nicht gefunden");
        }
        else {
            System.out.println("gefunden und index: "+value );
            System.out.println("Arraylänge: "+ array.length);
        }
    }
}
