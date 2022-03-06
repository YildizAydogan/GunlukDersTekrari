package day35_Inheritance;

import day34_encapsulation_inheritance.Isci;

public class Ustabasi extends Isci{

	
	Ustabasi(){
		System.out.println("Ustabasi parametresiz constructor calisti");
	}
	
	
	
	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi();
		
		//javada her class olustruldugunda otomatik olarak
		//default constructor olustugu gibi 
		//child classda olustrulan herbir constructorin
		//ilk satirinda gizli super() olusturur
		

	}

}
