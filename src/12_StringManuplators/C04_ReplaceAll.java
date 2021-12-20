package day12_StringManuplators;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		//replace all methodlari kullanarak java ogrenmek cok kolay yazacaz
		str=str.replaceAll("\\d", "");
		
		System.out.println(str);  //*Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x"); //Javaxogrenmekxcokxkolay
		System.out.println(str);
		
		
		str=str.replaceAll("\\w", ""); // kucuk w olsaydi tum harfler giderdi  *..
		System.out.println(str);
		
		str=str.replaceAll("\\W", ""); //harf olmayanlar gider. kucuk w olsaydi tum harfler giderdi
		System.out.println(str);
		
		
		
		
		
		str=str.replace("x", " ");        //Java ogrenmek cok kolay
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
