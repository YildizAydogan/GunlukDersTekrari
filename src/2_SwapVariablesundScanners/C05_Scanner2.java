package day02_SwapVariablesundScanners;

import java.util.Scanner;

public class C05_Scanner2 {

	public static void main(String[] args) {
		// Kullanicidan isim ve soy ismini ayri ayri isteyiniz.
		//girilen ismi asagidaki gibi yazdiriniz
		//girilen isim : Mehmet Kral
		
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Lutfen isminizi giriniz:\nLutfen soyIsminizi giriniz: ");
	    String isminiz=scan.next();
	    System.out.println();
	    String soyIsminiz=scan.next();
	    System.out.println("Girilen isim: " + isminiz + " " + soyIsminiz);
	    
	    
	    scan.close();
	    
	    

	}

}
