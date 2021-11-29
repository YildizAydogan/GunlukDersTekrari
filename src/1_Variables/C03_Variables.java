package day01_Variables;

public class C03_Variables {

	public static void main(String[] args) {
		
		//Farkli data türleri ayni degeri alabilir
		//burda onemli olan bu degiskenleri turune gore islem yapabilecegimdir.
		int sayi1=10;
		int sayi2=20;
		String sayi3="10";
		String sayi4="20";
		String harf1="A";
		char harf2='A';
		
		
		System.out.println(sayi1+sayi2);        //30
		System.out.println(sayi3+sayi4);        //1020
		System.out.println(sayi1+sayi2+harf1);  //30A
		System.out.println(sayi1+sayi2+harf2);  //95 (Char extra ozelligi sebebiyle matematiksel isleme girebiliyor. Numerik deger alir
		System.out.println(harf1+sayi1+sayi2);  //A1020
		System.out.println(sayi1+harf1+sayi2);  //10A20
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
