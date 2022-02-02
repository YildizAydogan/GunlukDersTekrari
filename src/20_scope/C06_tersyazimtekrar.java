package day20_scope;

import java.util.Arrays;

public class C06_tersyazimtekrar {

	

	public static void main(String[] args) {
		
		int arr[]= {5, 10 , 15, 20};
		int tersarr[]=new int[arr.length];
		
		for (int i =0 ; i < tersarr.length; i++) {
			tersarr[i]=arr[arr.length-1-i];
			
		}
		
		System.out.println(Arrays.toString(tersarr));
		
	 int sayi[]= {10, 6, 8 , 9, 40};
	 int ters[]=new int[sayi.length];
	
	
	 
	 
	 for (int i = 0; i < ters.length; i++) {
		ters[i]=sayi[sayi.length-1-i];
		
	}
		
		System.out.println(Arrays.toString(ters)); // burda parantez icine sayi yazdim ve 22. satiri dumduz yazdirdi
	
		
		
		Arrays.sort(sayi);
		System.out.println(Arrays.toString(sayi));
	}

}
