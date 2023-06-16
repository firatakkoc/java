package Colors;

public class Colors {
    public static void main(String[] args) {
        System.out.println("\u001B[31mBu metin kırmızı renkte.\u001B[0m");
        System.out.println("\u001B[32mBu metin yeşil renkte.\u001B[0m");
        System.out.println("\u001B[34mBu metin mavi renkte.\u001B[0m");
        System.out.println("\u001B[33mBu metin sarı renkte.\u001B[0m");
        System.out.println("\u001B[35mBu metin mor renkte.\u001B[0m");
        System.out.println("\u001B[36mBu metin cyan renkte.\u001B[0m");
        System.out.println("\u001B[37mBu metin beyaz renkte.\u001B[0m");

        // Arka plan renklerini değiştirme
        System.out.println("\u001B[41mBu metnin arka planı kırmızı renkte.\u001B[0m");
        System.out.println("\u001B[42mBu metnin arka planı yeşil renkte.\u001B[0m");
        System.out.println("\u001B[44mBu metnin arka planı mavi renkte.\u001B[0m");
        System.out.println("\u001B[43mBu metnin arka planı sarı renkte.\u001B[0m");
        System.out.println("\u001B[45mBu metnin arka planı mor renkte.\u001B[0m");
        System.out.println("\u001B[46mBu metnin arka planı cyan renkte.\u001B[0m");
        System.out.println("\u001B[47mBu metnin arka planı beyaz renkte.\u001B[0m");

        // Daha fazla renk ve stil seçenekleri
        System.out.println("\u001B[31;1mBu metin koyu kırmızı renkte ve kalın yazı stiline sahip.\u001B[0m");
        System.out.println("\u001B[32;4mBu metin yeşil renkte ve altı çizgili yazı stiline sahip.\u001B[0m");
        System.out.println("\u001B[33;9mBu metin sarı renkte ve çizgili yazı stiline sahip.\u001B[0m");

    }
}
