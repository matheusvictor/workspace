package UN2_ListaDeProgramacao2;

import java.util.*;

public class AreaCirculo {

	/**
	 * Programa que calcula a area de um círculo.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double raio = 0;
		final double PI = 3.14;
		int opc = 0;
				
		System.out.println("Ola, usario. Sou um programa que calcula a area de um circulo.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();

		while(opc >= 0){
		//O comando "final" serve para manter a variável constante, ou seja,
		//ela sempre será aquele valor e não poderá ser alterado durante o funcionamento do programa.
	
		System.out.println("Por favor, digite o raio (em cm) do circulo:");
		raio = sc.nextDouble();
		
		double area = PI * (raio * raio);
		//Realizando a operação correspondende a area do círculo.
		
		System.out.println("A area desse circulo eh igual a: " + area + " cm²");
		
		System.out.println(" ");
		System.out.println("Digite qualquer numero positivo para continuar o programa, ou qualquer numero negativo para sair.");
		opc = sc.nextInt();
	
		if (opc < 0) {
			System.out.println("Programa finalizado!");
		}
		
		}
	}

}
