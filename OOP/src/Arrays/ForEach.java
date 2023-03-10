package Arrays;

public class ForEach {
    public static void main(String[] args) {
        
        String[] array = {"Apfel","Birne","Kirsche"};

        // Normal for Loop
        
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println("Obst :"+array[i]);
        // }

        // forEach yapisi ile Loop;

        for (String a : array) {
            System.out.println("Obst: "+a);
        }

        int[] intArray = {1,2,3,4,5,6};
        for (int b : intArray) {
            System.out.println("Sonuc: "+b);
        }



    }
}
