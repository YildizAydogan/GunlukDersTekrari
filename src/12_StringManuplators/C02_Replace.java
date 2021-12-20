package day12_StringManuplators;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayisinin 
		//binden buyuk olup olmadigini yazdirin
		
		
		String sonuc="10.000";  //once noktadan kurtulmaliyiz cunku int olmasi icin noktali olmamasi gerekiyor
		
		
	   sonuc=sonuc.replace(".", "");  //noktadan kurtulamk icin bunu yapiyoruiz
	                                 // nokta olmasa da calisir. Bulursa calisir kod
	   
		if (Integer.valueOf(sonuc)>1000) {   //sonuc int, ama string bir variablee assign edilmis. Bunu calistirmak icin bunu yaptik
			System.out.println("Bulunan sonuc sayisi 1000`den cok");
		}else {
			System.out.println("Bulunan sonuc sayisi 1000`den az");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
