package day06_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCümleleri {

	public static void main(String[] args) {
		// Kullanicidan bir tam sayi isteyin ve tek veya cift oldugunu yazdirin
		
		
	    Scanner scan=new Scanner (System.in);
	    System.out.println("Lutfen bir tam sayi giriniz");
	    int sayi=scan.nextInt();
	    
	    if (sayi%2==0) {
			System.out.println("Girdiginiz sayi cift bir sayidir");
		}
		
		if (sayi%2==1) {
			System.out.println("Girdiginiz sayi tek bir sayidir");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
