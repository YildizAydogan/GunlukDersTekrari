package day15_for_Loops;

import java.util.Scanner;

public class C05_soru {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak 
		//girilen sayiya kadar 3’un kati olan sayilari yazdirin.
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		double sayi=scan.nextDouble();
		int num=(int) sayi;
		//sayi negatifse veya tam sayi ise uyari verelim
		
		if (sayi<0) {
			System.out.println("Negatif sayi giremezsin");
		} else if (num!=sayi ) {  //bu durumda double girmistir
			System.out.println("double dayi giremezsin");
		}else if (sayi>100) {
			System.out.println("Lutfen 100 den kucuk sayi giriniz");
		}else {
			for (int i = 1; i < sayi; i++) {
			if (i%3==0) {
				System.out.print(i+ " ");
			} 
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
