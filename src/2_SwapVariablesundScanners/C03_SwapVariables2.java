package day02_SwapVariablesundScanners;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		// Verilen sayi1 ve sayi2 degiskenlerini ücüncü bir degisken olmadan Swap bir program yaoiniz.
		int sayi1=25;
		int sayi2=75;
		System.out.println("Baslangicta sayi1:" + sayi1 + " ve sayi2:" + sayi2 +" dir.");
		 
		sayi2=sayi2+sayi1;
		sayi1=sayi2-sayi1;
		sayi2=sayi2-sayi1;
		System.out.println("Son durumda sayi1:" + sayi1 + " ve sayi2:" + sayi2+" olmustur.");
		
		
		
		
		
		int sayi3=50;
		int sayi4=85;
		System.out.println("Baslangicta sayi3:" +sayi3 + " ve sayi4:" + sayi4+ " idi.");
		
		sayi3=sayi3-sayi4;
		sayi4=sayi3+sayi4;
		sayi3=sayi4-sayi3;
		System.out.println("Son durumda sayi3:" +sayi3 + " ve sayi4:" + sayi4+ " olmustur.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
