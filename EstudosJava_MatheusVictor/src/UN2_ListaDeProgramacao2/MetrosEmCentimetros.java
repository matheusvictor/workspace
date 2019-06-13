package UN2_ListaDeProgramacao2;

import java.util.Scanner;

public class MetrosEmCentimetros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		//Abrindo o teclado.
		
		double metros = 0;
		//Declarando as variáveis.
		
		System.out.println("Digite quantos metros voce deseja converter em centimetros");
		System.out.println("Obs.: Digite apenas os numeros.");
		metros = sc.nextDouble();
		
		sc.close();
		
		double MemCm = (metros) * 100;
		
		System.out.println(metros + "m" + " em cetimetros eh igual a: " + MemCm + "cm");
	}

}
