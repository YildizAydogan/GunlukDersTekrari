package day18_Whileloop;

import java.util.Scanner;

public class C01_soru6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		
		int sayac=0;
		int bolen=1;
		
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen + " ");
				sayac++;
			}
			bolen++;
		}
		System.out.println("");
		System.out.println(sayi + " sayisinin " + sayac + " adet tam boleni vardir.");
		
		
		
	}

}
