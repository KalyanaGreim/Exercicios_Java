package exeUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		
		double raio = entrada.nextDouble();
		
		double area = 3.14159 * Math.pow(raio,2);
		
		System.out.printf("Área do círculo: %.4f", area);
		
		entrada.close();

	}

}
