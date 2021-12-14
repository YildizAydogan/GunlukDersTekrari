package day03_ScannerWideningNarrowingIncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {
		// Esitligin sol tarafi short, sag tarafi byte. Iki data türü farkli oldugu halde java itiraz etmiyor.
		//Cunku atama yapilan variablenin data turu(short), atanan degerin veri turunden (byte) buyuk oldugundan sorun olusturmaz.
		byte sayi1=44;
		short sayi2=sayi1;
		System.out.println("sayi2 : " + sayi2);
		
		
		
		//Kucuk data turunu buyuge atamaya AutoWidening diyoruz.
		int sayi3=55;
		double sayi4=sayi3;
		System.out.println("sayi4 : " + sayi4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
