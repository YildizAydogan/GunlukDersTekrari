package day18_Whileloop;

import java.util.Scanner;

public class C02_soru7 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
		
		
		
		
		while (sayi>0) {
		rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		}
		
		System.out.println("Girdiginiz sayinin rakamlar toplami: " + rakamlarToplami);
		
	
		
		
	}

}
