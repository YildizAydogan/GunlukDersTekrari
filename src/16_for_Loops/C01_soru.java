package day16_for_Loops;

import java.util.Scanner;

public class C01_soru {

	public static void main(String[] args) {
		/* Interview Question Kullanicidan 100�den kucuk bir tamsayi isteyin.
		  1�den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
		- Sayi 3�un kati ise sayi yerine �Java� yazdirin.
		- Sayi 5�in kati ise sayi yerine �Guzeldir� yazdirin.
		- Sayi hem 3�un hem 5�in kati ise sayi yerine �Java Guzeldir� yazdirin.*/

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int num=scan.nextInt();
		
		
		
		for (int i = 1; i < num; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("Java G�zeldir ");
			}else if (i%3==0) {
				System.out.println("Java");
			} else if (i%5==0) {
				System.out.println("Guzeldir");
			} else{
            System.out.println(i);
			}
		
		
		
		
		
		
		
}}}