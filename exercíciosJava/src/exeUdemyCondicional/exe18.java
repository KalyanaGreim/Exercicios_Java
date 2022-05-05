package exeUdemyCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe18 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for (int i=0; i<n; i++) {
			int x = entrada.nextInt();
			int y = entrada.nextInt();
				
			if(y == 0) {
				System.out.println("Divisão impossível!");
			} else {
				double divisao = (double) x/y;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		entrada.close();
	}
}
