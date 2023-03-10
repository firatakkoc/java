package Arrays;

import java.util.ArrayList;

public class arrayList {
    // Metod tanimliyoruz;
    public static void yazdir(ArrayList<String> a) {
        
        for (int i = 0; i < a.size(); i++) {
        System.out.println("Element " + (i+1) + ": " + a.get(i));
        }
    }
    
    public static void main(String[] args) {

        // Ram de bir Array List olusturduk;
        
        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("Name1");
        arraylist.add("Name2");
        arraylist.add("Name3");
        arraylist.add("Name4");

        // for (String a : arraylist) {
        //     System.out.println("Name: "+a);
        // }
            // Index bazinda cikti alma;
        // System.out.println(arraylist.get(0));
        // System.out.println(arraylist.get(1));
        // System.out.println(arraylist.get(2));

        // Array List boyunu ögrenmek;
        System.out.println(arraylist.size());

        // Array List den eleman silme;

        //arraylist.remove();

        // Index de bir elemanin yerini ögrenme;
        System.out.println(arraylist.indexOf("Name1"));

        //Sondan baktirma
        System.out.println(arraylist.lastIndexOf("Name1"));

        // Arraylist güncelleme;

        arraylist.set(3, "Firat");

        // Farkli for döngüsü ile cikti alma;
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        
        yazdir(arraylist);
    }
}
