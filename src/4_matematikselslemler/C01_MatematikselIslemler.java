package day04_matematikselslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
	
		System.out.println(4*(2+5)/2);
		
		//once parantez icini yapar
		//carpma ve bolme ayni anda yapilirdi ama soldan saga gelecegi icin once carpma yapar sonra bolme
		
		
		System.out.println(4*(2+5)/3);  //tam sayi cikar sonuc.int oldugu icin sonuc 9 cikar
		
		//sonucu virgullu yazmak icin
		double sonuc=4*(2+5)/3;
		System.out.println(sonuc);   //neden 9.0 cikmadi
		                             // once degeri buldu sonra double a atadi o yuzden sonuc 9.0 cikti
		
		sonuc=(double)(4*(2+5)/3);           // yine 9.0 cikar
		System.out.println(sonuc);
	
		sonuc=(double)4*(2+5)/3;
		System.out.println(sonuc);      //9.3333 cikar
		

		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2);   //5/2=2
		System.out.println(sayi1/sayi3);   // 2,5 cikar cast yapiyoruz. isleme girenlerden biri double ve islem yapilinca sonucu cast ediyor. ceviriyor
		System.out.println(sayi3/sayi2);   //1.0 cikar
		
		
		
		
		
		
		
	}

}
