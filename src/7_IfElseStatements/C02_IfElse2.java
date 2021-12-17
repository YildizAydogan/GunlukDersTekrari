package day07_IfElseStatements;

import java.util.Scanner;

public class C02_IfElse2 {

	public static void main(String[] args) {
		//Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin 
		//  a<=karakter<=z asla olmaz
Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		
		if ((karakter>='A' && karakter<='Z')  || (karakter>='a' && karakter<='z')) {
			System.out.println("Girdiginiz karakter Harftir!");
		} else {
			System.out.println("Girdiginiz karakter Harf degildir!");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
