package day22_MultidimentionalArray;

import java.util.Arrays;

public class C02_multidimentionalarrays {

	public static void main(String[] args) {
	//multi dimentional arrayler ic ice konulmus arrayler demektir array oluturmak icin iki yontemimiz var
		//birinci yontem once deklare edip sonra deger atama.
		//
		
		int arr[][]=new int[3][2];  //outer arrayi 3 elemanli
		                            //her bir inner array ise 2 elemanli mdarray
		                             // oluturulur
		//bu yontemle olusturdugumuz inner arraylerin hepsi ayni boyutta olmalidir
         // System.out.println(Arrays.toString(arr)); direk bunu yazdirinca referanslari geliyor
		//icindeki elemanlar non prim oldugundan referanslari yazdirilir
		
		System.out.println(Arrays.toString(arr[1])); // ilk baby geldi [0, 0]
		System.out.println(Arrays.toString(arr[2])); //[0, 0] buda ayni
		System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]] tum elemanlarini yazdirmanin direk yolu
		
	 arr[0][1]=5;
	 arr[1][0]=2;
	 arr[2][1]=3;
		
     System.out.println(Arrays.deepToString(arr));
     
     
     //array olusturmak icin iki yontemimiz vardi
     //2. yontem declare edip hem de deger atama
      int arr2[][]= { {0}, {1,2,3}, {6,7,8,9} };
     System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]]
     System.out.println(Arrays.toString(arr2[1])); //[1, 2, 3]
     System.out.println(arr2[2][1]);//7
     
     
	}

}
