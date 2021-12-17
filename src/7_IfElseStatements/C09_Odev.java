package day07_IfElseStatements;

import java.util.Scanner;

public class C09_Odev {

	public static void main(String[] args) {
		//Girilen isim geçerli bir gün ise gün isminin 1,2 ve 3. harflerini
		//ilk harf büyük diğer ikisi küçük olarak yazdırın.
		//Gün ismi geçerli değilse "Geçerli gün ismi giriniz " yazdırın
			
		/*Scanner scan =	new Scanner(System.in);
		System.out.println("Lütfen gün ismini yazınız.");
		String gün = scan.next().toLowerCase();
		
		
		if (gün.equals("pazartesi") || gün.equals("salı") || gün.equals("çarşamba") || gün.equals("perşembe")||gün.equals("cuma") || gün.equals("cumartesi") || gün.equals("pazar ")) {
			System.out.println(gün.toUpperCase().charAt(0)+""+gün.toLowerCase().charAt(1)+""+gün.toLowerCase().charAt(2));
		} else {
	        System.out.println("Geçerli gün ismi giriniz");
		}
        */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gün adi giriniz");
		String gun=scan.next();
		
		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") ||
				gun.equals("cuma") || gun.equals("cumartesi") ||gun.equals("pazar")) {
			System.out.println(gun.toUpperCase().charAt(0)+""+gun.toLowerCase().charAt(1)+""+gun.toLowerCase().charAt(2));
		} else {
           System.out.println("Geçerli gün ismi giriniz");
		}
		
		
		scan.close();
		
		
		
		
	}

}
