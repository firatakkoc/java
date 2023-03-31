package CollectionSortandCompareInt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> list_string = new ArrayList<String>();

        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("PHP");
        list_string.add("Go");

        Collections.sort(list_string);

        for (String s: list_string) {
            System.out.println(s);
        }
    }
}
