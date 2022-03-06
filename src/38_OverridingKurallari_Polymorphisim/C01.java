package day38_OverridingKurallari_Polymorphisim;

public class C01 {

	public static void staticMethod() {
		System.out.println("Parent class static method calisti");
	}
private void privateMethod() {
	System.out.println("Parent class private method");
}
//final demek bu son hali bir daha degistirilemez demek
//dolayisiyla final olarak tanimlanan bir method override edilemez

public final void finalMethod() {
	System.out.println("Parent class final method");
}


//child class ile parent class ayni package de olduklarindan methodlarin access modifierleri 
//public, protected veya default olsaydi hicbir sorun olmazdi

//Bir nesnenin birden fazla farklı nesneymış gibi davranması gibi-Overriding


}
