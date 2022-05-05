package exeUdemy;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.printf("A diferença entre A, B, C e D é %d", DIFERENCA);
		
		entrada.close();
		
		
		
	}

}
