package exeUdemy;

import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	int a = entrada.nextInt();
	int b = entrada.nextInt();
	
	int resultado = a + b;
	
	System.out.printf("SOMA = %d.%n", resultado);
	
	entrada.close();

}
}