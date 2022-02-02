package day20_scope;

import java.util.Arrays;

public class C05_Arraysoru {

	public static void main(String[] args) {
		//Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		//Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
		
		int arr[]= {1,2,3,4,5,10,100,55};    // [2, 3, 4, 5, 10, 100, 55, 1]

		int kova=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=kova;  //son elementin indexi
		System.out.println(Arrays.toString(arr));  // [2, 3, 4, 5, 1]
		

	}

}
