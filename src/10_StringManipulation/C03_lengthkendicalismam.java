package day10_StringManipulation;

public class C03_lengthkendicalismam {

	public static void main(String[] args) {
		
		//length en cok son harfi yazdirirken kullanilir.
		String sey="Hacimollaogullari kaygilarogullarindan misiniz len";
		System.out.println(sey.length());
		//System.out.println(sey.charAt(50)); //dersek bize son harfi verir. ama kelime degistiginde son harf illaki degisecek.
		                                    //bu yuzden daha uygun bir metodla yazmaliyiz
		
		System.out.println(sey.charAt(sey.length()-1));// length kismi son harfin indeksini
		                                               //char at de harfin kendisini verir
		
		
		String sey1="";
		System.out.println(sey1.length());  //calisir 0 verir
		String sey2=null;
		System.out.println(sey2.length());  //mis gibi hata veriyor
		
		String sey3;
		System.out.println(sey2);  // null da cikanlari yazar
		// System.out.println(sey3);  Eger Sringi olusturur degeer atamazsak yazdigimizda hata verir. altini kirmizi yazar
		//Null degeri bizim variable yi bilerek olusturup bilerek deger atamadigimi biliyor.
		//deger atamadigin baska stringlerin alti kirmizi oluyor
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
