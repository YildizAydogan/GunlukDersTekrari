package day05_WrapperClass;

import java.util.Scanner;

public class C06_SOruu {

	public static void main(String[] args) {
		/*
        * Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
        * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
        */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 1. vize notunuzu giriniz:");
	    int vize1=scan.nextInt();
	    System.out.println("Lutfen 2. vize notunuzu giriniz:");
	    int vize2=scan.nextInt();
	    System.out.println("Lutfen final notunuzu giriniz:");
		int fnal=scan.nextInt();
	    int vizeOrtalama= (vize1+vize2)/2;
		int gecmeNotu=vizeOrtalama*30/100+fnal*70/100;
		System.out.println("Ortalamaniz: "+ gecmeNotu);
		
		if (gecmeNotu>=70) {
			System.out.println("Gectiniz!");
		}
		
		
		if (gecmeNotu<=70) {
			System.out.println("Basarisiz!");
		}
		

		
		scan.close();
		
		

	}

}
