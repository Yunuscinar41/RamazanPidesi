
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Ramazan Pidesi Uygulaması...");
        
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        Random random = new Random();
        
        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Ayşe");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Elif");
        pide_kuyrugu.offer("Şule");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oğuz");
        pide_kuyrugu.offer("Emre");
        
        int pide_sayisi = 1 + random.nextInt(10);
        
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayısı : " + pide_sayisi);
        Thread.sleep(3000);
        
        while(pide_sayisi != 0){
            System.out.println(pide_kuyrugu.poll() + " pidesini aldı...");
            Thread.sleep(1000);
            pide_sayisi--;
        }
        
        System.out.println("Başka pide kalmadı...");
        System.out.println("****************************");
        for(String s: pide_kuyrugu){
            System.out.println(s + " pidesini alamadı...");
        }
        
    }
}
