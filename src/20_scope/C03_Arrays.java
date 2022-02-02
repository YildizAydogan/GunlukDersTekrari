package day20_scope;

public class C03_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]=new String[4];
		arr[0]="Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
		
		String arr2[]= {"Ali", "Veli", "Ayse", "Fatma"}; // olusturduk 
		
		arr2[0]="Can";
		
		arr2[2]="Ayse"; // yer degistiridik
		
		System.out.println(arr2[1]);   //Veli yazdirir
		System.out.println(arr[arr.length-1]); // son elementi yazdirir
		                                       // stringdeki length() idi buradaki sadece length
	                                           //-1 olmadan calistirdik kirmizi hata verdi. 
	
	
	
	
	
	
	}

}
