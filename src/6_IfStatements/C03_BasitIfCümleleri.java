package day06_IfStatements;

import java.util.Scanner;

public class C03_BasitIfCümleleri {

	public static void main(String[] args) {
		
		  /*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = “Hafta sonu”
                        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gün ismini yaziniz:");
		String gün=scan.next().toLowerCase();
		
		
		if (gün.equals("pazar") || gün.equals("cumartesi")) {
			System.out.println("Haftasonu");
		}
		
		
		if (gün.equals("pazartesi") || gün.equals("sali") || gün.equals("carsamba") || gün.equals("persembe") || gün.equals("cuma")) {
			System.out.println("Haftaici");
		}
		
		
		//String non prim oldugu icin == kullanilmaz bunun yeine equals() kullanilmalidir
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
