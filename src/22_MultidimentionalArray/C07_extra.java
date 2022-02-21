package day22_MultidimentionalArray;

import java.util.Arrays;

public class C07_extra {

	public static void main(String[] args) {
		// Verilen iki array'i birlestiren
				// ve sonucu birlesikArray isminde bir array'e kaydeden
				// bir method olusturunuz
				// main method icinde yeni array'i siralayip yazdirin
				
		int arr1[]= {3,5};		
		int arr2[]= {2,4,6};
		
		int birlesikArray[]=birlestir(arr1,arr2);
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray)); //
		
		
	}
				
			private static int[] birlestir(int[] arr1, int[] arr2) {
				
				int birlesikArray[] = Arrays.copyOf(arr1, arr1.length+arr2.length);
				//{3,5,7,10,0,0,0}
				//su sifirlari degistirmek icin alttaki foru yine kullanacaz
				
				for (int i = 0; i < arr2.length; i++) { // 2.array'in elemanlarini alacagiz
					
					birlesikArray[i+arr1.length] = arr2[i];
					
				}
				
				
				return birlesikArray;
	}

}
