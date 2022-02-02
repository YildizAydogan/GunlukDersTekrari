package day20_scope;

public class C02_LoopVariables {

	public static void main(String[] args) {
		int sayi=10;
		for (int i = 0; i < 6; i++) {
			String isim="Ali"; // ali
			System.out.println(sayi+ " "+ isim);
		}
     //System.out.println(isim);
	// syso(i); 
		//loopun icinde olusturulan bir var disinda kullanilamaz
		//bunun icin loop disinda da ihtiyacimiz olan degisken varsa
		//looptan once olusturulur ve emniyette kalmak icin initialize yapariz
		
		
		
		for (int i = 0; i < 10; i++) {
			// int sayi=20; burda olusturamam cunku sayi vari main methodun icinde olusturuldugundan
			//tum main methodda gecerlidir
			// dolayisiyla yeniden ayni isimde bir var olusturamazsiniz
			@SuppressWarnings("unused")
			String isim="veli";  // veli forun icinde kullanildi diye rahatlikla olusturusun, deger de alir
		}
		
	}

}
