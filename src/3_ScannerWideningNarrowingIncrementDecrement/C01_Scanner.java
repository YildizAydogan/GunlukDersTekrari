package day03_ScannerWideningNarrowingIncrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		// Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayiniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yaricap giriniz: ");
		double yaricap=scan.nextDouble();
		
		double cevre=2*3.14*yaricap*yaricap;
		double alan=3.14*yaricap*yaricap;
		
		System.out.println("Cemberin cevresi: " +  cevre);
		System.out.println("Cemberin alani: " + alan);
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
