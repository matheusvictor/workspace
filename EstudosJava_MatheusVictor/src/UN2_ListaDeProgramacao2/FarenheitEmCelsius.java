package UN2_ListaDeProgramacao2;

import java.util.Scanner;

public class FarenheitEmCelsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double C, F = 0;
				
		System.out.println("Ola, usuario. Sou um programa feito para converter Farenheit em Celsius.");
		System.out.println("Digite enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite quantos graus Farenheit deseja converter.");
		System.out.println("Obs.: Digite apenas numeros.");
		F = sc.nextDouble();
		
		double Celsius= C = (5 * (F-32) / 9);
		//Realizando a operação correspondende à conversão.
		System.out.println(F + " ºF eh igual a: " + Celsius + " ºC");
	}

}
