package exeUdemyCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe14 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner entrada = new Scanner (System.in);
		
		int senha = entrada.nextInt();
		
		while(senha != 2022) {
			
			System.out.println("Senha inválida!\nTente novamente:");
			senha = entrada.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		entrada.close();
	}
}