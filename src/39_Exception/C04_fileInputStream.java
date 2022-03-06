package day39_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_fileInputStream {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		                                         // || bunu 16. satirda kirmizi cizdigi icin firlattirdik
		
		//javada bir dosyaya ulasmak istedigimizde FileInputStream classindan yardim aliriz
		
		
		FileInputStream fis=new FileInputStream("src\\day39_Exception\\yazi.txt");
		
		//java bu kodda olasi bir problem ongoruluyor
		//ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		//yani alti cizilen her kod cte degildir
		
		//bunun icin iki durum sozkonusu
		//1- try catch kullanarak bu problemi Hnadle edip javanin yoluna devam etmesini saglayabilirsiniz
		//2- Eger dosya okunamiyorsa kod calismasin istiyorsaniz olayin farkinda oldugumuzu 
		//ve sorumlulugun bizde oldugunu Java'ya soylemelisiniz 
		
		
		System.out.println("Gorev tamamlandi");
		
		
		
		
		
		
		
		
		
		
	}
}
