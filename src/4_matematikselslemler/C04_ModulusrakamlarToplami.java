package day04_matematikselslemler;

import java.util.Scanner;

public class C04_ModulusrakamlarToplami {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi yaziniz");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=sayi%10; 
		rakamlarToplami+=rakam;   
		sayi/=10;
		
  //Bu islemi basamak sayisi kadar tekrar edersek rakamlar toplamini buluruz
		
		
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
