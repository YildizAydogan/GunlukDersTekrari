package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		//Verilen bir arrayda tekrar eden elemnetleri sadece birer tane yazarak 
		//unique elementlerden olusan bir array haline getireelim
		int arr[]= {2,3,4,5,6,7,8,4,5,7,2,1,2,0};
		//2,3,4,5,6,7,8,0,1 yazdirmak istiyorum
		List<Integer>tekrarsiz=new ArrayList<>();
		
 
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) { //icermiyorsa demem lazim
				tekrarsiz.add(arr[i]);
			}
		}
		
		System.out.println("tekrarsiz list" + tekrarsiz);  //[2, 3, 4, 5, 6, 7, 8, 1, 0] bu bir listtir
	
	int tekrarsizArray[]=new int[tekrarsiz.size()];
	for (int j = 0; j < tekrarsizArray.length; j++) {
		tekrarsizArray[j]=tekrarsiz.get(j);
	}
	
	
	System.out.println("Tekrarsiz array:" + Arrays.toString(tekrarsizArray));
	
	
	
	
	}

}
