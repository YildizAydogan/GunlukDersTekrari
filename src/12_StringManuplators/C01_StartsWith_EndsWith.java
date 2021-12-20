package day12_StringManuplators;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime alin 
		//verilen kelime ile baslayip baslamadigini ve bitip bitmedigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
	
		
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.next();
		
		
		System.out.println("Cumle bu kelimeyle mi basliyor? " + cumle.startsWith(kelime));
		System.out.println("Cumle bu kelimeyle mi bitiyor? " + cumle.endsWith(kelime));
		
		
		
		
		if (cumle.startsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile basliyor");
		}else {
			System.out.println("girilen cumle " + kelime + " ile baslamiyor");
		}
		
		
		if (cumle.endsWith(kelime)) {
			System.out.println("girilen cumle " + kelime + " ile bitiyor");
		}else {
			System.out.println("girilen cumle " + kelime + " ile bitmiyor");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
