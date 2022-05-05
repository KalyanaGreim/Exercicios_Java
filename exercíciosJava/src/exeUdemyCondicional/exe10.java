package exeUdemyCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner entrada = new Scanner (System.in);
		
		int A, B;
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		if ( A % B == 0 || B % A == 0) {
			System.out.println("MULTIPLOS");
		} else {
			System.out.println("NÃO MULTIPLOS");
		}
		
		entrada.close();

	}

}
