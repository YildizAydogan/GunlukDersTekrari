
package day10_StringManipulation;

public class C03_Length {

	public static void main(String[] args) {
		String str1="Ali Kahyaoglu";
		System.out.println(str1.length());    //13
		//Verilen str1 im son harfini yazdirin
		System.out.println(str1.charAt(str1.length()-1));  //u
		                             //(burasi son harfin indeksini verir)
		                 //(su kisimda son harfi yazdirir.
		
		String str2="";
		System.out.println(str2.length());
		
		String str3=null;  //Null degeri bizim bu variablei bilerek olusturdugumuzu 
		                   //ve bilerek deger atamadigimizi belirtiyor
		                   //System.out.println(str3.length());        
		                   //Hata verir
		
		
		System.out.println(str3); //null
		//System.out.println(str4);  //hata
		//Null pointer olusturdugumuz fakat sonra kullanacagimiz bir stringi isaretlemek icin kullanilir
		//ben bu degiskeni olusturdum ama henuz degr atamadim uyarisi cikiyor.
		
	}

}
