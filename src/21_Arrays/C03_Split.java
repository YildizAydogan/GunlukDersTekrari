package day21_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// Java ogrendim, #cok para ?kazandim.,
   // cumlesinin kelimelerini ozel karakterler olmadan noktalama vs harf sirasina gore yazdir
		String cumle="Java ogrendim,  #cok para ?kazandim.,";
		String kelime[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelime));
		
		
		for (int i = 0; i < kelime.length; i++) {
			kelime[i]=kelime[i].replaceAll("\\W","");
		//bunu sildi hoca	System.out.print(kelime[i]+ " ");
		}
		
		System.out.println(Arrays.toString(kelime));
		
		
		Arrays.sort(kelime);
		String yeniCumle="";
		for (int i = 0; i < kelime.length; i++) {
			
		
			
		}
		
		System.out.println(yeniCumle);
		
	}

}
