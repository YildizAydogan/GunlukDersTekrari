package day11_Index;

import java.util.Scanner;

public class C02_Kelimekullanimsorusu {

	public static void main(String[] args) {
		/* Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
		       kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
             - Girilen kelime cumlede kullanilmamis.
             - Girilen kelime cumlede 1 kere kullanilmis.
             - Girilen kelime cumlede 1�den fazla kullanilmis. 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
		
		String kelime=scan.next();
		int index=cumle.indexOf(kelime);
		
		if (index<0) {    //index==(-1) de olur
			System.out.println("Girdiginiz kelime verilen cumlede yoktur");
		}else if (cumle.indexOf(kelime, index+1)<0) {  //index+1==(-1)
			System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
		} else {
			System.out.println("Girilen kelime cumlede 1�den fazla kullanilmis.");
		}
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
