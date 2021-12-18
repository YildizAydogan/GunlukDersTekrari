package day11_Index;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin,
		//harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		char krk=scan.next().charAt(0);
		
		
		
		int index=cumle.indexOf(krk);  //girilen karakterin cumledeki indexini verir
		
		if (index<0) {    //index==(-1) de olur
			System.out.println("Girdiginiz harf verilen cumlede yoktur");
		}else {
			System.out.println("Girdiginiz harf verilen cumlede vardir");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
