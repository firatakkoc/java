package AbstactClass;

/*Abstract class ve abstract method, 
bir soyutlama mekanizması olarak kullanılır ve genellikle alt sınıfların 
belirli bir kalıba veya işleme göre uygulanmasını sağlar.  */



public class Main {
    public static void main(String[] args) {

        Kare kare1 = new Kare("Kare1",5);
        Daire daire1 = new Daire("Daire1",3);

        kare1.alanHesapla();
        daire1.alanHesapla();

    }
}
