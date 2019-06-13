package lista.segundoano;
import java.util.*;
public class Questao35 {

	/**
	 * Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a
m�dia alcan�ada por aluno e apresentar:
A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
A mensagem "Reprovado", se a m�dia for menor do que sete;
A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez
	 */
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		double nota[] = new double [2];
		
		for (int i = 0;  i < 2; i ++){
		System.out.println("Digite a " + (i+1) + "� nota do aluno.");
		nota[i] = sc.nextDouble();
		
		while (nota[i] > 10 || nota[i] < 0){
			System.out.println("Erro! Tente novamente.");
			nota[i] = sc.nextDouble();
			}
		}
		
		double media = (nota[0] + nota[1])/2;
		
		if (media >= 7){
			System.out.println("1� nota: " + nota[0]);
			System.out.println("2� nota: " + nota[0]);
			System.out.println("Media: " + media);
			System.out.println("Aprovado!");
		}
		
		else if (media < 7){
			System.out.println("1� nota: " + nota[0]);
			System.out.println("2� nota: " + nota[0]);
			System.out.println("Media: " + media);
			System.out.println("Reprovado!");
		}
		
		else if (media == 10){
			System.out.println("1� nota: " + nota[0]);
			System.out.println("2� nota: " + nota[0]);
			System.out.println("Media: " + media);
			System.out.println("Aprovado com distin�ao!");
		}
		

	}

}
