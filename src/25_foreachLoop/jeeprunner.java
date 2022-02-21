package day25_foreachLoop;

public class jeeprunner {

	public static void main(String[] args) {
	  jeep jeep1=new jeep();
	  System.out.println(jeep1.fiyat+ " " + jeep1.ilanNo + " " +jeep1.marka + " " + jeep1.model
			+ " " + jeep1.yil);
	
	  
	  
	  jeep1.fiyat=1500;
	  jeep1.ilanNo=1002;
	  jeep1.marka="Toyota";
	  jeep1.model="Corolla";
	  jeep1.yil=2005;
	  
	  
	  jeep1.hiz(150); 
     jeep1.yakit("benzin");
System.out.println(jeep1.fiyat+ " " + jeep1.ilanNo + " " +jeep1.marka + " " + jeep1.model
				+ " " + jeep1.yil);
	  
      /*10000 1001 null null 2001
      Arabam saatte 150 km yapar.
      Arac yakit olarak benzin kullanir.*/





	}

}
