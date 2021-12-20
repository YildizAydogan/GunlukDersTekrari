package day13_Methodcreation;

import java.util.Scanner;

public class C02_Methodcreation {

	public static void main(String[] args) {
		// kullanicidan iki sayi isteyin. sayilarin
		//karelerini ve küplerini toplayip yazdiran iki ayri method yazin
        //kullaniciya üs sorun
		//2 yazarsa karelerin toplamini yapan method.
		// 3 yazarsa kupler toplamini yapan method calissin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen ikinci sayiyi giriniz");
		int sayi2=scan.nextInt();
		
		System.out.println("Lutfen us girin");
		int us=scan.nextInt();
	
			  
			if (us==2 ) {
				kareleritoplami(sayi1,sayi2);
			}if (us==3) {
				kupleritoplami(sayi1,sayi2);
			}
			
	
		
		scan.close();  // essek sipasi methodun icinde kapaniyormus.
	}

	public static void kupleritoplami(int sayi1, int sayi2) {
		System.out.println("sayilarin kupleri toplami : " + ((sayi1^3+sayi2^3)));
		
	}

	public static void kareleritoplami(int sayi1, int sayi2) {
		System.out.println("sayilarin kareleri toplami : " + (Math.pow(sayi1,2)+Math.pow(sayi2,2)));
		
		
		
	}


}
