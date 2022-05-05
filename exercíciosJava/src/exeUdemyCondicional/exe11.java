package exeUdemyCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner entrada = new Scanner (System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = entrada.nextInt();
		horaFinal = entrada.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		entrada.close();

	}

}
