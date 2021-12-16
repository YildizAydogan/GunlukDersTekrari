package day05_WrapperClass;

import java.util.Scanner;

public class C05_Soru {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz:");
		double kenar1=scan.nextDouble();
		System.out.println("lutfen diger kenar uzunlugunu giriniz:");
        double kenar2=scan.nextDouble();
        
        if (kenar1==kenar2) {
			System.out.println("Girdiginiz kenar uzunluklari kare oldugunu gosterir!");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("Kenar uzunluklari dikdortgen oldugunu gosterir!");
		}
		
		scan.close();
		
	}

}
