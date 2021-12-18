package day10_StringManipulation;

import java.util.Scanner;

public class bos {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Lutfen soyadinizi ve cinsiyetinizi(Erkek/Kadin) giriniz: ");
	        
	        String soyAdi = scan.next();
	                                                    
	        String cinsiyet = scan.next();                      
	        
	        int uzunluk = soyAdi.length();                  
	        
	        int indexOv = soyAdi.lastIndexOf("ov");       
	        
	                    
	        if (indexOv>=0) {
	            
	            if (indexOv==uzunluk-2 || indexOv==uzunluk-3) {
	                
	                if (cinsiyet.equals("Erkek") || cinsiyet.equals("Kadin")) {
	                    
	                    System.out.println("Dogru giris, soyadinin sonunda ov veya ova kelimesi var ve cinsiyet dogru girilmis.");
	                    
	                } else {
	                    System.out.println("Soyadinin sonunda ov veya ova kelimesi var fakat cinsiyet yanlis girilmis.");
	                }
	    
	                
	            } else {
	                    System.out.println("Soyadinin sonunda ov veya ova kelimesi bulunamadi");
	            }
	            
	            
	        } else {
	                System.out.println("Soyadinda ov veya ova kelimesi bulunamadi.");
	        }
	        
	        
	        
	        scan.close();

	}

}
