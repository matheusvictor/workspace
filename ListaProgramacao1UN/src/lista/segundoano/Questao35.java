package lista.segundoano;
import java.util.*;
public class Questao35 {

	/**
	 * Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a
média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez
	 */
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		double nota[] = new double [2];
		
		for (int i = 0;  i < 2; i ++){
		System.out.println("Digite a " + (i+1) + "ª nota do aluno.");
		nota[i] = sc.nextDouble();
		
		while (nota[i] > 10 || nota[i] < 0){
			System.out.println("Erro! Tente novamente.");
			nota[i] = sc.nextDouble();
			}
		}
		
		double media = (nota[0] + nota[1])/2;
		
		if (media >= 7){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[0]);
			System.out.println("Media: " + media);
			System.out.println("Aprovado!");
		}
		
		else if (media < 7){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[0]);
			System.out.println("Media: " + media);
			System.out.println("Reprovado!");
		}
		
		else if (media == 10){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[0]);
			System.out.println("Media: " + media);
			System.out.println("Aprovado com distinçao!");
		}
		

	}

}
