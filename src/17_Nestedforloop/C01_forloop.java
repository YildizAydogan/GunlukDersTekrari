package day17_Nestedforloop;

import java.util.Scanner;

public class C01_forloop {

	public static void main(String[] args) {
		//Kullanicidan 2 tam sayi isteyin
		//ilk sayidan baslayarak ikinci sayiya kadar 3 er yazdirin.
		//ikinci sayi dahil olmak zorunda degil
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int num=scan.nextInt();
		int num1=scan.nextInt();
		
		if (num>num1) {   //azalarak gidecek
			for (int i = num; i >= num1; i-=3) {
				System.out.println( i);
		} 
			}else if (num<num1) { //artarak gidecek
			for (int i = num; i <= num1; i+=3) {
			System.out.println( i);
		}
		} else{
          System.out.println("Girilen sayilar esit");
		} 
		
		
		
		
		
		
		
		
	}

}
