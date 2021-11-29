package day01_Variables;

public class C02_Variables {

	public static void main(String[] args) {
		
		//Ayni isim ve data türüyle ikinci defa variable olusturulamaz
		String okul="Fatih Koleji";
		
		//int okul1=20;   Farkli data türü de olsa biz ayni isim ile ikinci defa variable olusturamayiz.
		
		
		//Var olan bir variable a yeni deger atayabiliriz.
		
		okul="Yildiz Koleji";
		System.out.println(okul);
		
		 //Yazdirma isleminde aciklama eklemek istersek
		//mesela okul adi : Ankara Koleji yazdiralim
		
		
		okul="Ankara Koleji";
		System.out.println("okul adi : " + okul);
		System.out.println("okul adi : "+ "okul");  //okul adi okul yazdirir.
		
		
		
		
		
		
		
		
	}

}
