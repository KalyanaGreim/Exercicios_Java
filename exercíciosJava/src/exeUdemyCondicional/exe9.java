package exeUdemyCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner entrada = new Scanner (System.in);
		
		int x;
		
		x = entrada.nextInt();
		
		if (x % 2 == 0) {
			System.out.printf("%d é PAR", x);
		} else {
			System.out.printf("%d é ÍMPAR", x);
		}
		
		entrada.close();

	}

}
