package exeUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Locale.setDefault(Locale.US);	
	Scanner entrada = new Scanner (System.in);
	
	double funcionario, horasTrabalhadas, valorHora, salario;
	
	funcionario = entrada.nextDouble();
	horasTrabalhadas = entrada.nextDouble();
	valorHora = entrada.nextDouble();
	
	salario = horasTrabalhadas * valorHora;
	
	System.out.printf("FUNCIONÁRIO = %.0f%n", funcionario);
	System.out.printf("SALÁRIO = %.2f%n", salario);
	
	entrada.close();
	
	
	

	}

}
