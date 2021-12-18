package day10_StringManipulation;

import java.util.Scanner;

public class C04_indexofbenimcalisma {

	public static void main(String[] args) {
		// Kullanıcıdan soyadını ve cinsiyetini girmesini isteyin 
        // Eğer soyadı ov veya ova ile bitmiyorsa "Soyad girisi yanlis" yazdırın
        // ov ile bitiyorsa ve cinsiyetini doğru (örneğin Erkek) girdiyse "dogru giris"
        // ova ile bitiyorsa ve cinsiyetini doğru (örneğin Bayan) girdiyse de "dogru giris"
        // diğer durumlarda "yanlıs giris" yazdırın 

		Scanner scan=new Scanner(System.in);
        
        System.out.println("Lutfen isminizi giriniz: ");
        String isim=scan.next();
		System.out.println("Lutfen kontrol icin soyadinizi giriniz: ");
		String soyAd=scan.next();
		
		System.out.println("Lutfen cinsiyetinizi erkek ise 'E', kadin iseniz 'K' seklinde giriniz" );
		char cinsiyet=scan.next().charAt(0);
		
		int uzunluk = soyAd.length();                  
        
        int indexOv = soyAd.lastIndexOf("Ov");
		
	
		
		if (indexOv>=0) {
			System.out.println("Soyad girisi yanlis");
			if (indexOv==uzunluk-2 || indexOv==uzunluk-3) {
				System.out.println("cinsiyetiniz : " + cinsiyet + "dogru girdiniz");
			} else  {
				System.out.println("cinsiyet yanlis ");
			}  
		} else {
			System.out.println("yanlis giris yaptiniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
