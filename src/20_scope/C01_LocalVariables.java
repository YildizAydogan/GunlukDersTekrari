package day20_scope;

public class C01_LocalVariables {

     String okulIsmi;   //her yerde kullanacagim bir ismi classs level de yazariz
	
	public static void main(String[] args) {
		// local var lara java, default deger atamasi yapmaz 
		//kodlarimizda sorun yasanmamak icin olusturdugumuz local var lara uygun bir deger atamakta fayda var
		//
		int sayi=0;  //int sayi; dersek java cte veriyor
		System.out.println(sayi);
				
		//int sayi; bir localde ayni isimde birden fazla var olusturulamaz
		//String sayi; dta turu farkli olsada java buna izin vermez
		@SuppressWarnings("unused")
		String isim="Ali";
		
	}
	public static void staticMethod() {
		//sayi; farkli lokalde olusturulan var methodlarin statik olup olmamasina bagli 
		// olmaksizin farkli lokLDE KULLANILAMAZ. cte verdi
		
		@SuppressWarnings("unused")
		String isim="Veli";
		
	}
	
	
	
}
