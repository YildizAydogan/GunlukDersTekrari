package day11_Index;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		//Kullanicidan bir cumlke ve bir harf isteyin
		//harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen varligini kontrol etmek icin kelime giriniz");
        String kelime=scan.next();
		
        int ilkIndex=cumle.indexOf(kelime);
		int sonIndex=cumle.lastIndexOf(kelime);
		
		if (ilkIndex==(-1)) {
			System.out.println("Girilen kelime cumlede hic kullanilmamis");
		} else if (ilkIndex==sonIndex) {
			System.out.println("Girilen kelime cumlede bir kere  kullanilmis");
		}else{
            
			System.out.println("Girilen kelime cumlede 1 den fazla kullanilmis");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
