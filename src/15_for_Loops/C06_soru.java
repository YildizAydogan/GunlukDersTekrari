package day15_for_Loops;

import java.util.Scanner;

public class C06_soru {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 
		//3’un veya 5”in kati olan sayilari yazdirin.
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		double sayi=scan.nextDouble();
	
		 if (sayi>100) {
				System.out.println("Lutfen 100 den kucuk sayi giriniz");
			return;
			} 
	
			for (int i = 0; i < sayi; i++) {
			if (i%3==0 || i%5==0) {
				System.out.print(i+ " ");
			}
		}
	
	         
	
	}

}
