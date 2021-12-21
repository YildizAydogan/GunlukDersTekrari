package day17_Nestedforloop;

import java.util.Scanner;

public class C06_soru {

	public static void main(String[] args) {
		// Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500'u gecerse
        // "Bu kadar sayi yeter"
        // ".. adet sayi girdin, toplami ..." yazdirin 
         Scanner scan=new Scanner(System.in);
        int sayi=5;
        int toplam=0;
        int sayiAdedi=5;
        while (sayiAdedi<10 && toplam<500) {
        	System.out.println("Toplamak uzere sayilar girin");
            sayi = scan.nextInt();
            toplam += sayi;
            sayiAdedi++;
		}
       
        System.out.println("Bu kadar sayi yeter");
		System.out.println(sayiAdedi + " adet sayi girdin, toplami "+ toplam);
		
		
		
		
		
		
		
		
	}

}
