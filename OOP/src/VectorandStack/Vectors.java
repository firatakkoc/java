package VectorandStack;
import java.util.Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;

public class Vectors {
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<String>();
        ArrayList<String> list = new ArrayList<String>();

        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

        for (String s : vector) {
            System.out.println(s);
        }

        ListIterator<String> iterator = vector.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());
    }
}
