package day16_for_Loops;

import java.util.Scanner;

public class C03_soruhocanincozumu {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Isim gir");
		String str=scan.nextLine();
		System.out.println(tersinecevir(str));
     scan.close();
	}

	private static String tersinecevir(String str) {
		String tersStr="";
		for (int i = str.length()-1; i >= 0; i--) {
			tersStr+=str.substring(i, i+1);
		}
		return tersStr;
	}

}
