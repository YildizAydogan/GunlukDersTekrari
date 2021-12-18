package day10_StringManipulation;

public class C01_equalskendicalismam {

	public static void main(String[] args) {
		//equals yontemi ile ilgili bilgiler
		int a =10;
		int b=a+0;
		System.out.println(a==b);  //bu int deger oldugu icin  true verecek
		                           //string olsaydi false
		
		char c='K';
		char c2='K'+0;
		System.out.println(c==c2);  // true. Char degisken matemstiksel islemlere girdiginde numerik deger alir.
		                            //K nin ascii degeri 75
		
		String isim="Ali";
		String isim1="Can" ;
	    String isim2="Ali Can";
	    String isim3=isim+" "+isim1;
		System.out.println(isim3);
		System.out.println(isim2==isim3);  // false yazdirir
		System.out.println(isim2.equals(isim3));  //true yazdirir
		
		//String variablelarda == hem degere hem referansa bakar. dolayisiyla objeler
		//farkli oldugunda genelde false doner
		//isim2==equals(isim3) ise referanslara degil sadece degere bakar
		//eger case sensitiv olarak String degerleri ayni ise true doner
		
		
		
		
		
		
		
		
		

	}

}
