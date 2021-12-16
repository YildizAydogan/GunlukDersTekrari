package day05_WrapperClass;

public class C02_Concatenation {

	public static void main(String[] args) {
		String str1= "Java";
		String str2= "Guzel";
		int sayi1=5;
		int sayi2=4;
		
		// Yukaridaki variable'lari kullanarak asagidaki metinleri yazdiralim
				// Java Guzel 54
				// Java 5 Guzel
				// Java 94
				// Java 19
				// 54 Guzel
		System.out.println(str1 + " " + str2 + " "+ sayi1 + sayi2);
		System.out.println(str1 + " " + sayi1 + " " + str2);
		System.out.println(str1 + " " + (sayi1+sayi2) + sayi2);
		System.out.println(str1 + " " + (sayi1-sayi2) + (sayi1+sayi2));
		System.out.println(""+sayi1+sayi2+" "+ str2);
		
		
		
		
		

	}

}
