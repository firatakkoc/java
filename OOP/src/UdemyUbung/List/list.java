package UdemyUbung.List;
import java.util.ArrayList;
import java.util.List;
public class list {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Firat");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Dave");
        myList.set(1,"Ozan");

        for(String name : myList) {
            System.out.println(name);
        }

        int n = 15;
        int[] myDynamicArray = new int[n];
        for(int i = 0; i < myDynamicArray.length; i++) {
            int element = i;
            int byteSize = getByteSize(element);
            myDynamicArray[i] = i;
            System.out.println("Index: "+ i + " Element: " + element + " Byte: " + byteSize);

        }

    }

    public static int getByteSize(int value) {
        return Integer.SIZE;
    }
}
