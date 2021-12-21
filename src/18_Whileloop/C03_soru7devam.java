package day18_Whileloop;

import java.util.Scanner;

public class C03_soru7devam {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();   //345 data turu int	
		int rakamlarToplami=0;
		int rakam=0;	
		
		String sayiStr=""+sayi;  //345 data turu String
		//int olarak verilen bir sayinin basmak sayisini bulmak istersek
		//kisa yoldan o sayiyi Stringe cevirip, str.length() methodunu kullanirim
		
		
		for (int i = 0; i <sayiStr.length(); i++) {
			rakam=sayi%10; 
			rakamlarToplami+=rakam;   
			sayi/=10;
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami: " + rakamlarToplami);


	}

}
