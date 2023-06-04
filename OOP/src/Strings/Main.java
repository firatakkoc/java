package Strings;

public class Main {
    public static void main(String[] args) {

        char[] chars = {'F','i','r','a','t'};
        String stringWert = new String(chars);
        System.out.println(stringWert);

        /*
        Java'da substring() metodu, bir dizeden belirli bir alt dize parçasını almak için kullanılır.
        substring() metodu, başlangıç ve bitiş indisleri kullanarak bir dizenin belirli bir bölümünü döndürür.
         */
        String str = "Firat Akkoc";
        String subStr = str.substring(0,5);
        System.out.println(subStr);

        // Java String toUpperCase() ve toLowerCase() methodları

        String str2 = "Hallo Welt";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());

        // Java String replace()

        String str3 = "Deutschland ist in Europa";
        System.out.println(str3.replace("d","a"));

    }
}
