package day03_ScannerWideningNarrowingIncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		// Kullanicidan ismini isteyip ilk harfini yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz:");
		char ilkHarf=scan.next().charAt(0);
		System.out.println("Isminizin ilk harfi " + ilkHarf + "'dir.");
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
