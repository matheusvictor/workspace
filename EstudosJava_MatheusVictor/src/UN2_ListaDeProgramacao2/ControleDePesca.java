package UN2_ListaDeProgramacao2;

import java.util.*;

public class ControleDePesca {

	/**
	 * Programa para controle de pesca
	 * Resolução da 2ª lista de atividades do EAD
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double peso = 0;
		
		System.out.println("Ola, usuario. Sou um programa criado para controle de pesca.");
		System.out.println("Se o peso for maior que 50 kg (peso estabelecido pelo regulamento de pesca de SP), sera acrescentado R$ 4,00 por quilo excedente.");
		System.out.println(" ");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Por favor, digite o peso de peixes:");
		peso = sc.nextDouble();
		
		double excesso = peso - 50;
		double multa = 4 * excesso;
		
		if (peso > 50) {
			System.out.println(" ");
			System.out.println("Peso excedido!");
			System.out.println(" ");
			System.out.println("Excesso de peso: " + excesso + " kg");
			System.out.println("Multa: R$ " + multa);
		}
		
		else {
			System.out.println(" ");
			System.out.println("Excesso de peso: " + (excesso = 0));
			System.out.println("Multa: R$ " + (multa = 0));

			
		}

	}

}
