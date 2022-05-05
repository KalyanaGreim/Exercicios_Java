package exeUdemyCondicional;

import java.util.Scanner;

public class exe15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int X = entrada.nextInt();
		
		for (int i=1; i<=X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		entrada.close();

	}

}
