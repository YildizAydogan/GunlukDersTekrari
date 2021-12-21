package day18_Whileloop;

import java.util.Scanner;

public class C06_soru5 {

	public static void main(String[] args) {
		/*Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
         Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        - Sifre kucuk harf icermelidirharf>='a' && harf<='z'&& harf>='A' && harf<='Z'  
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.*/
		
		
		Scanner scan=new Scanner(System.in);
		String sifre="";   
		boolean khk=false;
		boolean bhk=false;
		boolean okk=false;
		boolean uk=false;
		do {
		
			System.out.println("Lutfen sifrenizi giriniz");
		sifre=scan.nextLine();   //Nilgun
		
		
		khk=kucukHarfKontrol(sifre);
		bhk=buyukHarfKontrol(sifre);
		okk=ozelKarakterKontrol(sifre);
		uk=uzunlukKontrol(sifre);
		
		
		} while (!khk || !bhk || !okk || !uk);
		
		System.out.println("Basarili giris yaptiniz!");
		
        scan.close();

	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk=false;
		if (sifre.length()>=8) {	
			uk=true;
        } else {
            System.out.println("sifreniz en az 8 karakter olmalidir");
        }
		return uk;
	}

	private static boolean ozelKarakterKontrol(String sifre) {
		boolean okk=false;
		String harfler="!@#$%^&*()_-+=/?<,>.|";
	    for (int i = 0; i < sifre.length(); i++) {
			
	    	if (harfler.contains(sifre.substring(i,i+1))) {
				okk=true; 
				break;
				
			}
		}
	    // bu satira geldigimde sifrede BUYUK harf varsa Bhk=true, hic BUYUK harf yoksa  Bhk=false
	    if (!okk) {
			System.out.println("Sifreniz en az bir ozel karakter icermelidir!");
		}
		return okk;
	}

	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHIJKLMNOPRSTUVYZWXQZ";
	    for (int i = 0; i < sifre.length(); i++) {
			
	    	if (harfler.contains(sifre.substring(i,i+1))) {
				bhk=true; 
				break;
				
			}
		}
	    // bu satira geldigimde sifrede BUYUK harf varsa Bhk=true, hic BUYUK harf yoksa  Bhk=false
	    if (!bhk) {
			System.out.println("Sifreniz en az bir buyuk harf icermelidir!");
		}
	    
		return bhk;
		
	}

	private static boolean kucukHarfKontrol(String sifre) {
	    boolean khk=false;
	    
	     
	    String harfler="abcdefghijklmnoprstuvyzwxq";
	    for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i,i+1))) {
				khk=true; //BREAK KULLANMAMIZIN SEBEBI.Soruda 1 tane kucuk harf olmasi yeterli
			    break;   //biz kucuk harfi bulduktan sonra durdurmazsak sinradan karsimiza cikan buyuk harfler
				          // bizi yaniltir.
				
			}
		}
	    // bu satira geldigimde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa  khk=false
	    if (!khk) {
			System.out.println("Sifreniz en az bir kucuk harf icermelidir!");
		}
		return khk;
		
		
		
		
		
		
		
		
		
		
		
	}

}
