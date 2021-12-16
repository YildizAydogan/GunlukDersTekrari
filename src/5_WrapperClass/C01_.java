package day05_WrapperClass;

public class C01_ {

	public static void main(String[] args) {
	
		int sayi1=10;
		Integer sayi2=20;
		System.out.println(sayi1+sayi2);
		
		
		//sayi1. yazdigimizda hicbir metod cikmaz, cunku sayi1 int dir yani primitivdir
		//sayi2. yazdigimda bircok metod geliyor cunku non primitivdir Intiger olarak yazdik
		
		String tel1="3578987";
		String tel2="3245434";
		System.out.println(tel1+tel2);     //35789873545434
		
		//bu sayilari toplamak isterseniz 
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));  //6824421
		
		System.out.println(Integer.MIN_VALUE);   //  -2147483648
		
		System.out.println(Integer.MAX_VALUE);   //  2147483647
		
		System.out.println(Double.MAX_VALUE);   //  1.7976931348623157E308
		
		System.out.println(Short.MAX_VALUE);    //   32767
		
		//String caddeNo="B203"; nunu duzeltince hallo world da saglam yazdirir
		
		String caddeNo="203";
		String sokakNo="1564";
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		//Integer.valueOf(String numerik ifade) metodu String olarak kaydedilmis
		//numerik ifadeleri sayiya cevirir.
		//ancak String ifadede numerik olmayan bir karakter olursa
		//Java NumberFormatException hatasi verir ve calismayi durdurur
		//stop execution
		
		System.out.println("Hello world"); //Yukarida hata verdigi icin bunu da yazdirmadi
		
		

	}

}
