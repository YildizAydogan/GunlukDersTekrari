package day09_TernarySwitchCase;

public class C12_SMConcat_charlaHarfsecme {

	public static void main(String[] args) {
        // charAt(istenenIndex) method'u istedigimiz index'deki karakteri bize verir
        
        String kurs= "Techproeducation";
        
        System.out.println(kurs.charAt(5)); //r
        
        // index 0'dan baslar
        
        System.out.println(kurs.charAt(0)); // bize ilk harfi verir
        
        System.out.println(kurs.charAt(15)); // son harfi verir
        System.out.println(kurs.charAt(16)); // hata verir
	}

}
