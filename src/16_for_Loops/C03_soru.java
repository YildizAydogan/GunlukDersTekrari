package day16_for_Loops;

import java.util.Scanner;

public class C03_soru {

	public static void main(String[] args) {
		//Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Isim gir");
		String str=scan.nextLine();
		tersinecevir(str);
	
		
	}

	public static String tersinecevir(String str) {
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.substring(i,i+1));
		}
		return str;
		
		
	}

}
