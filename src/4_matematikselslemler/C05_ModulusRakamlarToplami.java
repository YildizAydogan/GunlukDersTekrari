package day04_matematikselslemler;

import java.util.Scanner;

public class C05_ModulusRakamlarToplami {

	public static void main(String[] args) {
		// Kullanicidan 6 basamakli bir sayi alin ve rakamlar toplamini bulun

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 6 basamakli bir sayi yaziniz");
		int sayi=scan.nextInt();
		
		
		int rakamlarToplami=0;
		int rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		
		
		scan.close();
		
		
		
		
		
	}

}
