package day39_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildException {

	public static void main(String[] args) {

		 try {
	            FileInputStream fis =new FileInputStream("src\\day39_Exception\\yazi.txt");
	            int k=0;
	            try {
	                while((k=fis.read())!=-1) {
	                    System.out.print((char)k);
	                    
	                }
	            } catch (IOException e) {
	                
	                e.printStackTrace();
	            }
	        } catch (FileNotFoundException e) {
	            
	            e.printStackTrace();
	        }
	        
	        System.out.println("");
	        System.out.println("Gorev tamamlandi");
	        
	        
	}

}
