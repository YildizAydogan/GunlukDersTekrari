  
package day18_Whileloop;

public class C04_doWhileLoop {

	public static void main(String[] args) {
		int i=0;
		
		while (i<5) {
			System.out.println(i + " ");
			i++;
		}

		
		  //while lopp once kontrol eder sonra kodu calistirir
		// loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder
		//bu da bazi durumlarda hatali sonuclara ulasmamiza sebep olabilir
		
		
		//do-whileloop ise once islemi yapar ve sonra sarti kontrol eder
		//ozellikle kullanicidan deger almalarda do while loop tercih edilir
		int a=0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a<5);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
