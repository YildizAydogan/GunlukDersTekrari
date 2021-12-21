package day17_Nestedforloop;

import java.util.Scanner;

public class C02_Nestedforloop {

	public static void main(String[] args) {
		// Kullanicidan 10 dan kucuk pozitif bir tam sayi girmesini isteyin. 
		//girdigi sayiya gore asagidaki sekli yazdirin
		//ornek 3 girilirse
		//1
		//12
		//123
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int num=scan.nextInt();
		
		for (int satir= 1; satir <=num ; satir++) {
			
			for (int i = 1; i <= satir; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		
		}
		
	}

}
