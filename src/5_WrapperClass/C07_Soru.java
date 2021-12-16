package day05_WrapperClass;

import java.util.Scanner;

public class C07_Soru {

	public static void main(String[] args) {
		/*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut 
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        ORNEK:
        INPUT      : Kilo: 71
                          Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
            */

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen boyunuzu giriniz!");
        double boy=scan.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz! ");
        int kilo=scan.nextInt();
        double vucutKutleEndeksi=kilo/Math.pow(boy,2);
        System.out.println("Vucud kitle endeksiniz(VKI) : " + vucutKutleEndeksi); 

       

        
        scan.close();
        
        
        
	}

}
