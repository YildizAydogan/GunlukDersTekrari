package day07_IfElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		//Kullanicidan dikdortgenin iki kenar uzunlugunu isteyin ve kare olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz:");
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu giriniz:");
		double kenar2=scan.nextDouble(); 
		
		if (kenar1==kenar2) {
			System.out.println("Girilen olculer karedir!");
		} else {
            System.out.println("Girilen olculer kare degildir!");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
