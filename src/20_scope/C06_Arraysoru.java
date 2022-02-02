package day20_scope;

import java.util.Arrays;

public class C06_Arraysoru {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		
		int arr[]= {3,5,8,65,32,34};
		
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
		System.out.println("Elementlerin toplami : " + toplam); //Elementlerin toplami : 147

		
		
		//Arrayin tum elemanlarini once kucukten buyuge sonra buyukten kucuge yazdirin.
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));  //[3, 5, 8, 32, 34, 65]
		
		Arrays.sort(arr);  //buyukten kucuge yazdirmak icin 
		                   // ya for loop ile elemanlari ters sirada yazdiriniz
		
		for (int i =  arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");   //65 34 32 8 5 3 bunlar array degil. yapmak istersek
			//elemanlari ters sirada yeni arraya tasiyabiliriz
		
			
		}
		System.out.println(" ");
		int tersArray[]=new int[arr.length];
			for (int i = 0; i < tersArray.length; i++) {
				tersArray[i]=arr[arr.length-1-i];  //43 te artik [65, 34, 32, 8, 5, 3] yaziyor
				
			}
		
		
		System.out.print(Arrays.toString(tersArray)); //[0, 0, 0, 0, 0, 0]
		
	}

}
