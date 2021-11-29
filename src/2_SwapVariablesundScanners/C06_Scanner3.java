package day02_SwapVariablesundScanners;

import java.util.Scanner;

public class C06_Scanner3 {

	public static void main(String[] args) {
		// Scanner isleminde iki method vardir
		//scan.next() dedigi mizde sadece 1 kelime alir ve ilk space a kadar alir
		//Eger kullanicidan daha fazla kelime alma ihtimali varsa scan.nextLine() kullanmaliyiz.
		
		
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Lutfen isminizi giriniz:\nLutfen soyIsminizi giriniz: ");
	    String isminiz=scan.nextLine();
	    System.out.println();
	    String soyIsminiz=scan.nextLine();
	    System.out.println("Girilen isim: " + isminiz + " " + soyIsminiz);
	    
	    
	    scan.close();

	}

}
