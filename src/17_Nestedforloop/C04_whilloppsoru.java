package day17_Nestedforloop;

import java.util.Scanner;

public class C04_whilloppsoru {

	public static void main(String[] args) {
		// Kullanicidan toplanmak uzere sayi isteyin
		//kullanici sifira basincaya kadar sayilari alip toplamaya devam edin
		//kullanici sifira bastiginda 
        //o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		for (int i = 0; i < 5; i++) {
			//Kullanicidan bir deger alip toplama eklerim
		}
		
		
		Scanner scan=new Scanner(System.in);
		//loopun icinde kullanicagim obje ve varibalelari looptan onca olusturmak
		//dah guzeldir.cunku loop un icinde olusturursak loop her dondugunde
		//yeni bir obje olusturu ve buda hafizayi doldurur+
		int sayi=10;      //0 in disinda ne yazarsak olur, 0 atarsam 0!=0 false olacagi icin 
		                  //daha en basinda hic calismayacakti. o yuzden 0 in disinda bir deger ataadm
		int toplam=0;    //ihtiyacimiz olan variablelari olusturduk
		int sayac=0;
		
		
		while (sayi!=0) {    //0 a basinca bitir satiri ve yazimi
			System.out.println("Lutfen toplama eklemek icin bir tam sayi yazin\nbitirmek icin 0'a basin ");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
			
		}
		//kullaici 0 a bastiginda loop islevini son kez yapip 
		//sonra basa donecek ve loop bitecek
		//0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden 0 i sayaca eklememek
		//icin 39. satirda sayac-1 yaptik
		System.out.println("girilen sayi adedi : " + (sayac-1));
		System.out.println("girilen sayilarin toplami : " + toplam);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
