package day39_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_exception {

	public static void main(String[] args) {
		//verilen vir int array icin 
		//kullanicidan sayi isteyin ve girilen sayiyi index olarak kabul edip
		//o indexteki elementi yazdirin
		
		
		int arr[]= {2,3,4,5,6,8,9,1,};
		
		try {
					
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen elementi yazdirmak icin index giriniz ");
		int index=scan.nextInt();
		System.out.println("giridiginiz indexteki element : " + arr[index]);
		
		
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiginiz index array de yok");
		}catch (InputMismatchException e) {
			System.out.println("Girdiginiz index pouitif tam sayi olmali");
		}		

		
		
		

	}

}
