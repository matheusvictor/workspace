package lista.segundoano;
import java.util.*;
public class Questao37 {

	/**
	 *Faça um Programa que leia três números e mostre o maior e o menor deles
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float valores [] = new float [3];
		float maior = 0, meio = 0, menor = 0;
		
		for (int i = 0; i < valores.length; i ++){
			System.out.println("Digite um numero positivo.");
			valores[i] = sc.nextFloat();
						
			if (valores[i] > maior){
				//Se o 2º valor digitado for maior que o primeiro digitado
				//Este segundo ira para a variavl "maior", e o primeiro passara para a varialvel "meio"
				meio = maior;
				maior = valores[i];
			}
			
			if (menor == 0){
				//Esse menor ira apenas receber um valor digitado
				menor = valores[i];
			}
			
			if (valores[i] < menor){
				//Se o numero digitado for MENOR que o numero que a variavel recebeu,
				//essa variavel ira guardar o novo valor
				menor = valores[i];
			}
			
			if (valores[i] > meio && valores[i] < maior){
				//Ou seja, se o valor digitado for maior que o guardado no meio e
				//o valor digitado for menor do que o maior numero guardado...
				meio = valores[i];
			}
		}
		
		System.out.println("O maior numero digitado eh: " + maior);
		System.out.println("O menor numero digitado eh: " + menor);

		}

}