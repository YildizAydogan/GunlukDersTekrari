package day06_IfStatements;

import java.util.Scanner;

public class C03_BasitIfC�mleleri {

	public static void main(String[] args) {
		
		  /*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = �Hafta sonu�
                        gun=Sali output = �Hafta ici�
         *** String icin equals method�unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen g�n ismini yaziniz:");
		String g�n=scan.next().toLowerCase();
		
		
		if (g�n.equals("pazar") || g�n.equals("cumartesi")) {
			System.out.println("Haftasonu");
		}
		
		
		if (g�n.equals("pazartesi") || g�n.equals("sali") || g�n.equals("carsamba") || g�n.equals("persembe") || g�n.equals("cuma")) {
			System.out.println("Haftaici");
		}
		
		
		//String non prim oldugu icin == kullanilmaz bunun yeine equals() kullanilmalidir
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
