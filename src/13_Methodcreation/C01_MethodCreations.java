package day13_Methodcreation;

public class C01_MethodCreations {

	public static void main(String[] args) {
		//verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri metod olusturun
		
		//Method  olusturmak icin 4 adim takip ederim
		//1. adim method call yazalim
		//2. adim methoda arguman yazacak miyiz karar vermeliyiz
		
		
		int sayi1=4;
		int sayi2=5;
		
		
		carpma(sayi1,sayi2);    //opsionel buraya aldik. asagidaydi bu
		toplama(sayi1,sayi2);  //bu bir method call dir
		//3. adim 1 ve 2. adimlari yaptiktan sonra javadan yardim alip methodu olustururuz.
	

	}

	public static void toplama(int sayi1, int sayi2) {
		//4. adim da erisim duzenleyici ve return type a karar vermeliyiz
		//erisim duzenleyici : axcess modifier: bu modu kimler kullanabilir : public yaptik 
		//return type : bizden sadece yazdirma istedigi icin void kalabilir
		//
              		
		System.out.println("sayilarin toplami : " + (sayi1+sayi2));
		
		
//----------------------------------------------------------------------------------------
		
		
		
	}

	public static void carpma(int sayi1, int sayi2) {
		
		System.out.println("sayilarin carpimi : " + (sayi1*sayi2));
	}

	
}
