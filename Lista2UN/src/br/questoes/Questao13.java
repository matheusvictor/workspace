package br.questoes;
import java.util.*;
public class Questao13 {

	/**
	 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a
ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas
de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
	 */
	public static void main(String[] args) {
		
		double area = 0;
		Scanner sc =  new Scanner (System.in);
		
		System.out.println("Seja bem-vindo(a) a loja de tintas Super Cor!");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o tamanho da area (em m²) que deseja pintar.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode conter virgula.");
		area = sc.nextDouble();
				
		double areaporlitro =  3 / 1;
		//Formula para o numero de area (m²) pintada por litro.
		double areaporlata = 18 * areaporlitro;
		//Area que cada cobre.
		double latasnecessarias = area / areaporlata;
		//Calculo para a quantidade de latas.
		double totalpagar = latasnecessarias * 80;
		
		System.out.println(" ");
		System.out.println("Tamanho da area a ser pintada: " + area + " m²");
		System.out.println("Quantidade de latas necessarias: " + Math.ceil(latasnecessarias));
		//O comando Math.floor diminuiria a quantidade de latas necessarias ao inves de arrendondar para o maior.
		System.out.printf("Total a pagar: R$ %.2f " , totalpagar);
	}
}