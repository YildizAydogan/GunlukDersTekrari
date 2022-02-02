package day21_Arrays;

import java.util.Arrays;

public class C01_binarySearch {

	public static void main(String[] args) {
		String isimler[]= {"Hacer", "ainagul", "Emine", "Murat", "Kutlu" };
		
		
		//array de arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler);//kesin bi duzenlemek sart
		// arrays classi ile sort yaptigimizda arrayimiz kalici olarak degisir
		System.out.println(Arrays.toString(isimler)); //[Ainagul, Emine, Hacer, Kutlu, Murat]
		
		//harfleri ilk harfin char degerine gore siralar.mesela kucuk a yapsak
		//siralamamiz [Emine, Hacer, Kutlu, Murat, ainagul] seklinde degoisir
		//sort metodu elementleri natural order a gore siralanir
		
		//mesela degisim yapalim eski hali icin 
		isimler[4]="Ainagul";
		System.out.println(Arrays.toString(isimler)); //[Emine, Hacer, Kutlu, Murat, Ainagul] yeni halimiz
		Arrays.sort(isimler); // sonuctan emin olmak icin kesin yapmaliyiz
		System.out.println(Arrays.toString(isimler));
		
		// isimler arrayinde Mrt ismi var mi? bu soruyu yukaridan aldik 10. satirdaydi
		System.out.println(Arrays.binarySearch(isimler, "Murat")); //4 yazdirdi
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); //-5
		System.out.println(Arrays.binarySearch(isimler, "Tuba")); //-6
		System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-4
		/*Aradıgımız kelime varsa----- index 0 DAN BASLAR
        Aradıgımız kelime yoksa---- sıralama 1 DEN BASLAR*/
		
		
		

	}

}
