package Methods;

public class MethodKavrami {
    public static void main(String[] args) {

        menuGoster();
        sayilariTopla(10,15);
        System.out.println("Deger Dändüren Metod: "+sayiFarki(10,5));

        double randomNumber = Math.random();
        System.out.println("Random Number: "+randomNumber);


    }

    // parametre almayan metod;
    public static void menuGoster() {
        System.out.println("---Menu---");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
    }

    // Parametreli deger;
    public static void sayilariTopla(int a, int b){
       int toplam = a+b;
        System.out.println(toplam);
    }

    // deger döndüren parametreli metod;

    public static int sayiFarki(int a, int b){

        return (a-b);
    }



}

