package QueueIntandLinkedList.Proje;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RamazanPidesiKuyrugu {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Queue<String> pideKuyrugu = new LinkedList<String>();
    
            while (true) {
                System.out.println("Ramazan pidesi almak isteyen kişinin ismini girin (Çıkmak için 'q' girin):");
                String isim = input.nextLine();
    
                if (isim.equalsIgnoreCase("q")) {
                    break;
                }
    
                pideKuyrugu.add(isim);
                System.out.println("Kuyruğa eklendi.");
            }
    
            System.out.println("Pide kuyruğu:");
            while (!pideKuyrugu.isEmpty()) {
                System.out.println(pideKuyrugu.poll());
            }
        
    }
}
