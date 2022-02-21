package day22_MultidimentionalArray;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9,3,45,12,3,5,7};
		int silinecekEleman=5;  //3 icin 27 de arattim sonuc 3 geldi
		                        // 11 arattik 0 geldi
		//arrayde yeni eleman ekleyemez veya var olan elemani silemeyiz
		//cunku arrayin declare edilen uzunlugu degismez
		//arrayde length degismez
		//yeni bir array olusturup ona 3 un disindakilere atabilirim ama eleman sayilari da esit olmali
		//bu soruda istenen elementi sildigimizde gereiye kac elemnt kaliyor bulmamiz lazim
		//silinecek sayi adedini bulalim:
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
				
			}
		}
		
		System.out.println(sayac);
		
		int yeniArrayuzunluk=arr.length-sayac;
		
		//artik yeni arrayi olusturabiliriz
		int yeniArr[]=new int[yeniArrayuzunluk];  // burda icerik [0,0,0,0,0]
		
		// simdi eski array deki elemanlari birer birer alip silinecek elemana esit
		//olmayanlari yeni array a atamaliyiz
		int index=0;  //yeni arrayin indexini kontrol etmek icin olusturduk
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!= silinecekEleman) {
			
				
				yeniArr[index]=arr[i];
				index++;
			}
			
		}
		
        System.out.println(Arrays.toString(yeniArr));
	}

}
