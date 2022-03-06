package day38_OverridingKurallari_Polymorphisim;

public class C02 extends C01 {

	public static void main(String[] args) {
	C02 obj1=new C02();
     obj1.privateMethod(); // kendi klasinda hangisi varsa o calisir
     obj1.staticMethod();	// o yuzden child classli sysolar calist	
		
     C01 obj2=new C02();
       //   obj2.privateMethod(); //altini ciziyor diyor ki private a ben nasil ulasayim burdan goremezsin deyip CTE veriyor 
      //data turu c01 oldugundan oncelikle c01 klasindaki methoda bakmamiz gerekir
     //ancak private oldugundan ulasamayiz
    // ulasamadigimiz bir methodu override yapamayiz   
   //dolayisiyla signature ayni olmasina ragmen bu ikisi farkli iki method olarak calisir 
   //static methodlar override edilemez   
     //dolayisiyla signature ayni olmasina ragmen java bu ikisini farkli iki method olarak gördü  
     obj2.staticMethod();
		
		
	//private, static and final method’lar overriding yapilamazlar	
	}public static void staticMethod() {
		System.out.println("Child class static method calisti");
	} // @Override bunu kabul etmedi
	private void privateMethod() {
		System.out.println("Child class private method");
	}
	
	//public final void finalMethod() {
	//	System.out.println("Parent class final method");
	

	} 
	// }
