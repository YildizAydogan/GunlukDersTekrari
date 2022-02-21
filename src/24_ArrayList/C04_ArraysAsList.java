package day24_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// verilen arrayin arrays klasindan yardim alarak 
		//liste cevirebiliriz
		String arr[]= {"a","b","c","d"};
		List<String>arraydenList=Arrays.asList(arr);
		
		System.out.println("Listimiz bu = " + arraydenList);  //[a, b, c, d]
		//
		
		//arraydenList.add("F");   list e ekleme yapabiliriz RTE hatasi var.
		//cte olmasi icin syntexte bir hata olmaliydi ama burda yazim hatasi yok
		// bu sekilde arrays classindan yardim alarak arrayi liste cevirirsek
		//olusturdugumuz listin boyutu sabit olur
		//dolayissiyla add( veya clear gibi methodlari calistirmak istersek 
		//java.lang.UnsupportedOperationException desteklenmeyen islem verir
		
		
		
		
		arr[1]="Z";
		System.out.println("Arrayi degistirdikten sonra, array = " + Arrays.toString(arr));
		//Arrayi degistirdikten sonra, array = [a, Z, c, d]
		
		System.out.println("Arrayi degistirdikten sonra, list = " +arraydenList);
          //Arrayi degistirdikten sonra, list = [a, Z, c, d]
		
		arraydenList.set(3, "D");

		System.out.println("Listi degistirdikten sonra, list= " + Arrays.toString(arr));
		System.out.println("Listi degistirdikten sonra, array  = " +arraydenList);
	}

}
