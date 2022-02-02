package day20_scope;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		// Arrayin elemanlarini yazdirmak istersek loop ile yazdirabiliriz yada arrays
		//klasindan yardim alip direk array olarak yazdirabiliriz
		
		int arr[]= {2,4,5,6,78,89};
		
		//tum elemeanlari yazdirabiliriz
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");   //bunlar arrayin elementleri 2 4 5 6 78 89 

	
		}
     System.out.println();
	System.out.println(Arrays.toString(arr)); //[2, 4, 5, 6, 78, 89]

	}

}
