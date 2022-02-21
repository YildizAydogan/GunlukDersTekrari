package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		//verilen bir listede icinde belirli bir harf olan kelimeleri elemanlari
		//silen bir metod yaziniz
		
		List<String>str=new ArrayList<>();
		str.add("Ceyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgut");
		
       System.out.println(str);
       String silinecekharf="a";

       str = killThemAll(str, silinecekharf); // listemizi tamamen degistirmek icin boyle diyoruz
       
       

	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
				i--;
			}
		}
		
		
		
		//for (int i = list.size()-1; i >=0 ; i--) buda olur
	
		
		System.out.println(str);
		
		
		return str;
		

		
	}

}
