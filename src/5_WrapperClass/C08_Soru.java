package day05_WrapperClass;

import java.util.Scanner;

public class C08_Soru {

	public static void main(String[] args) {
		// cember cevresi ve daire alani ve kurenin hacmini hesaplayan kod yaziniz

        // cember cevresi,daire alani ve kurenin hacmini hesaplayan kod yaziniz
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double r=scan.nextDouble();
        
        System.out.println("cemberin cevresi : " + 2*3.14*r);
        
        System.out.println("dairenin alani : " + 3.14*Math.pow(r, 2));
        
        System.out.println("kurenin hacmi : " + 3.14*Math.pow(r, 3));
        
         scan.close();
		
	}

}
