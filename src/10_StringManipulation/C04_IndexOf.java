package day10_StringManipulation;

public class C04_IndexOf {

	public static void main(String[] args) {
		// Parametre olarak girilen bir cahr veya stringi in ilk index ini verir
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		System.out.println(str.indexOf('s'));  //4
		System.out.println(str.indexOf("J"));  //14
		
		int index=str.indexOf("r");     //bu metod sana bize her zaman bit int degeri doner
		System.out.println(index);      //6 yazdirir
		 
		System.out.println(str.indexOf('q'));   //-1
		//eger bir stringin index degeri olarak -1 gelirsre o stringin olmadigini anlariz 
		//bir string icinde olamayan bir kelime ararsak java -1 sonucunu dondurur
		
		System.out.println(str.indexOf('A'));  //Case sensitivdir java. Buyuk a yok. dolayisiyla -1 verir
		
		
		System.out.println(str.indexOf("va og")); //16
		// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir
		//bu durumda java aradigimiz CS i tek bir paket gibi dusunur ve o paketin baslangic indexini konumunu bize verir
	
	
	System.out.println(str.indexOf('e', 15));  //22
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
