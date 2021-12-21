package day16_for_Loops;

import java.util.Scanner;

public class C02_soru {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir isim girin");
		String str=scan.nextLine();
		//cekoslavakyalilastiramadiklarimizdanmisiniz
			
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.substring(i,i+1));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}