package day02_SwapVariablesundScanners;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// Kullanicidan deger almak icin 3 adim takip edilir
		//1. adim scanner objesi olusturmaktir.
		
		Scanner scan=new Scanner(System.in);
		
		//2. Adim kullaniciya ne istedigimizi soylemek.
		System.out.println("Lutfen adinizi yaziniz:");
		
		//3. adim da isminiz seklinde bir String variable= scan.next() olusturup sonrasinda yazdirmak
		
		String isminiz=scan.next();
		System.out.println("Isminiz: " + isminiz + "'dir.");
		
		
		//Scan bir Scanner objesidir.
		//Isim olarak farkli bir isim yazsakta calisir ama biz scan demeyi tercih ederiz.
		//scan bir obje oldugu icin data türü non-primitiv dir.
		//primitiv data türleri sadece deger icerir.
		//Non-primitivler degerin yaninda birde metodlar icerir.
		//scan. dedigimizde bu metodlari görebiliriz.
		
		
		
		scan.close();
		
		
		
		
		

	}

}
