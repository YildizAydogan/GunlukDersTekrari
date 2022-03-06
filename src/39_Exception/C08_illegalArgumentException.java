package day39_Exception;

import java.util.Scanner;

public class C08_illegalArgumentException {

	public static void main(String[] args) {
		
		//kullanicidan yasini girsin iste
		//kodunu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yaz
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen konsolda gormek icin yasinizi giriniz ");
		int yas=scan.nextInt();
		try {
			if (yas<0) {
				throw new IllegalArgumentException();			
				}else {
					System.out.println(yas);
				}
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas 0 dan kucuk olamaz");
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
