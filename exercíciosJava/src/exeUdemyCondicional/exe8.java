package exeUdemyCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner entrada = new Scanner (System.in);
		
		int x;
		
		x = entrada.nextInt();
		
		if (x < 0) {
			System.out.printf("%d é NEGATIVO", x);
		} else {
			System.out.printf("%d é POSITIVO", x);
		}
		
		entrada.close();

	}

}
