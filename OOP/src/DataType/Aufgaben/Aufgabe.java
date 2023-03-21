package DataType.Aufgaben;

public class Aufgabe {
    public static void main(String[] args) {

        // 1- String veri tipini Int veri tipine dönüstürme;
        // String Referans Tipli veri Tipidir.
        String stringValue = "150";
        String stringValue2 = "250";
        int integerValue = Integer.parseInt(stringValue);
        System.out.println("This is a Integer: "+integerValue);
        int integerValue2 = Integer.valueOf(stringValue2);
        System.out.println("This is a Integer: "+integerValue2);

        // Integer dan Stringe dönüstürme;

        stringValue = String.valueOf(integerValue);
        System.out.println("This is a String: "+stringValue);

        System.out.println("-------------------------------------");

        // 2- Hesaplama Yapma;

        int sayi1 = 5 /3 ;
        float sayi2 = 5f/ 3f;
        double sayi3 = 5d / 3d;

        System.out.println("Sayi1: "+sayi1);
        System.out.println("Sayi2: "+sayi2);
        System.out.println("Sayi3: "+sayi3);


        System.out.println("-------------------------------------");
        // 3 - Yazdirna ve yorumlama

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);

        System.out.println("-------------------------------------");

        // 4- Sonuc ekrana yazdirma;

        int number1 = 1, number2 = 2;
        double avarage = (number1+number2) / 2;
        System.out.println("Sonuc1: "+avarage);

        // Type Casting kullandik;
        int number3 = 1, number4 = 2;
        double avarage2 = (number3+number4) / 2.0;
        System.out.println("Sonuc2: "+avarage2);


    }
}
