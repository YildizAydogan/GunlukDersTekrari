package day18_Whileloop;

public class C05_soru {

	public static void main(String[] args) {
		//Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri 
		//yazdirin.
		
		for (char i = 'm'; i >= 'c'; i--) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		/////////////////////////////////////////////
		
		char krk='m';
		while (krk>='c') {
			System.out.print( krk + " ");
			krk--;
		}
		System.out.println(" ");
        ////////////////////////////////////////////
		char harf='m';
		do {
			System.out.print(harf + " ");
			harf--;
		} while (harf>='c');
		
		
	}

}
