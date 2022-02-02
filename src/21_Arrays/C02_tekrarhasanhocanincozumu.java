package day21_Arrays;

import java.util.Arrays;

public class C02_tekrarhasanhocanincozumu {

	public static void main(String[] args) {
		String cumle="Java ogrenmek cok guzel";
		System.out.println("cumlenin uzunlugu nedir :  " +cumle.length());
		String kelimeler[]=cumle.split(" ");
		System.out.println("bir bosluk splitten sonra uzunluk kelimeler ne oldu " + kelimeler.length);
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrenmek, cok, guzel]
		System.out.println("kelimeler arrayinin uzunlugu kac   " + kelimeler.length);
		String kelimeler2[]=cumle.split("ogrenmek cok");
		System.out.println("ogrenmek cok diye split ettim uzunluk ne oldu : " + kelimeler2.length);
		System.out.println(Arrays.toString(kelimeler2));
		
		for (int i = kelimeler.length-1; i >=0 ; i--) {
			
			System.out.print(kelimeler[i] + " " );
			
		}
		//virguller splitten geldi normalde arrayin parcasi degildi
		//tersten yazdirirken sadece elementleri secti bu yuzden virguller gitti
		

	}

}
