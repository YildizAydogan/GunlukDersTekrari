package day09_TernarySwitchCase;

public class C06_NTKucukBuyukHarfSorusu {

	public static void main(String[] args) {
		// Soru2 : verilen karakteri inceleyin,
        // kucuk harf ise consola �Kucuk Harf� , 
        // buyuk harfse consola �Buyuk Harf� 
        // yoksa �girdiginiz karakter harf degil� yazdirin.
        
        char krk='a';
        
        // String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (//sart yanlis ise sonuc);
        String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (
                
                        (krk>='A'&& krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil"
                            
                            );
        
        System.out.println(sonuc);

	}

}
