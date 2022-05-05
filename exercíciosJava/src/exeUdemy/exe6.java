package exeUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner entrada = new Scanner (System.in);
		
		double peca1, numeroPeca1, valorUnitario1, peca2, numeroPeca2, valorUnitario2, valorAPagar;
		
		peca1 = entrada.nextDouble();
		numeroPeca1 = entrada.nextDouble();
		valorUnitario1 = entrada.nextDouble();
		peca2 = entrada.nextDouble();
		numeroPeca2 = entrada.nextDouble();
		valorUnitario2 = entrada.nextDouble();
		
		valorAPagar = (numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2);
		
		System.out.printf("Valor a pagar por produtos %.0f e %.0f: R$ %.2f", peca1, peca2, valorAPagar);
		
		entrada.close();
		
		
	}

}
