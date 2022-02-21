package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hic ugrasmadan bir array veya listedeki tum elemenalari 
		//gozden gecirmek isteriz
		
   int arr[]= {1,2,3,4,5,6,7};
    List<Integer>yeniList=new ArrayList<>();
   /*bu arrayi esnek bir list yapmak istiyorum
   
     for (int i = 0; i < arr.length; i++) {
    	yeniList.add(arr[i]);
   }
		
	System.out.println(yeniList);	*/
		
		for (int each : arr) { // arrdeki herbir (each) int'i bana getir
			                // bu bana arr deki herbir elemani keisnlikle getirecek
			yeniList.add(each);
			
			//eger bir list veya arrayin tum elemanlarini elden gecirmek istiyorsak ve siralama onemli degilse 
			//for-each loop kullaniriz
		}
		
		
		System.out.println(yeniList);  //[1, 2, 3, 4, 5, 6, 7]
		
		
		
		
	}

}
