package exeUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		
		double largura = entrada.nextDouble();
		double comprimento = entrada.nextDouble();
		double metroQuadrado = entrada.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf(" ÁREA = %.2f%n", area);
		System.out.printf(" PREÇO = %.2f", preco);
		
		entrada.close();
		

	}

}
