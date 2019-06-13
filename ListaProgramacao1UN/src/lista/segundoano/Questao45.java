package lista.segundoano;
import java.util.Scanner;
public class Questao45 {

	/**
	 *Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de
um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
Media de aproveitamento Conceito
Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem
“APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double nota[] = new double [2];
		int i = 0;
		
		for (i = 0; i < nota.length; i ++){
			System.out.println("Digite a " + (i+1) + "ª nota do aluno.");
			nota[i] = sc.nextDouble();
		}
		
		double media = (nota[0] + nota[1])/2;
		
		if (media <= 10 && media >= 9){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1] );
			System.out.println("Media: " + media);
			System.out.println("Conceito: A");
			System.out.println("APROVADO!");
		}
		
		else if (media <= 9 && media >= 7.5){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1] );
			System.out.println("Media: " + media);
			System.out.println("Conceito: B");
			System.out.println("APROVADO!");
		}
		
		else if (media <= 7.5 && media >= 6){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1] );
			System.out.println("Media: " + media);
			System.out.println("Conceito: C");
			System.out.println("APROVADO!");
		}
		
		else if (media <= 6 && media >= 4){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1] );
			System.out.println("Media: " + media);
			System.out.println("Conceito: D");
			System.out.println("REPROVADO!");
		}
		
		else if (media <= 4 && media >= 0){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1] );
			System.out.println("Media: " + media);
			System.out.println("Conceito: E");
			System.out.println("REPROVADO!");
		}

	}

}
