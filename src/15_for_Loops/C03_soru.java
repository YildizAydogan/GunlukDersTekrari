package day15_for_Loops;

public class C03_soru {

	public static void main(String[] args) {
		
		for (int l = 10; l <= 30; l++) {
			if (l==30) {
				System.out.println(l);
			} else {
                System.out.print(l + ",");
			}
}
		System.out.println();//bos syso sadece alt satira gecmek icin kullanilir
		for (int l = 10; l <= 29; l++) {
		System.out.print(l+",");
		}	
		System.out.println(30);
		
		
	}

}
