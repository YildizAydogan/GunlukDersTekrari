package day06_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCümleleri {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz:");
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu giriniz:");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girilen dikdortgen karedir");
		}
		
		
		if (kenar1!=kenar2) {
			System.out.println("Girilen dikdortgen kare degildir");
		}
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
