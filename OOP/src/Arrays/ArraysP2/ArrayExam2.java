package Arrays.ArraysP2;

public class ArrayExam2 {

    public static void main(String[] args) {

        int[] s = {1,9,5,2,7,9,60,120,55,-9};

        arrayPrint(s);

    }

    public static void arrayMix(int[] array) {
        for (int i = array.length -1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i+1));


        }

    }

    // Icine gönderilen arrayi yazdiran metod;
    public static void arrayPrint(int[] array){
        for(int i : array) {
            System.out.println("Element: "+i);
        }
    }
}
