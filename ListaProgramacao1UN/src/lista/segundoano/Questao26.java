package lista.segundoano;
import java.util.*;
public class Questao26 {

	/**
	 *Faça um algoritmo para ler o nome, as três notas e o número de faltas de um aluno e escrever qual
a sua situação final: Aprovado, Reprovado por Falta ou Reprovado por Média. A média para
aprovação é 7,0 e o limite de faltas é 25% do total de aulas. O número de aulas ministradas no
semestre foi de 80. A reprovação por falta sobrepõe a reprovação por Média.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double nota[] = new double [3];
		int faltas[] = new int [1];
		
		System.out.println("Digite o nome do(a) aluno(a).");
		nome = sc.nextLine();
		
		for (int i = 0; i < 3; i ++){
		System.out.println("Digite a " + (i+1) + "ª nota");
		nota[i] = sc.nextDouble();
		
		while(nota[i] < 0 || nota[i] > 10){
			System.out.println("Erro! Tente novamente.");
			nota[i] = sc.nextInt();
		}
		
		}
		
		System.out.println("Digite o numero de faltas que o aluno teve durante o semestre/unidade.");
		faltas[0] = sc.nextInt();
		
		while(faltas[0] < 0){
			System.out.println("Erro! Tente novamente.");
			faltas[0] = sc.nextInt();
		}
		
		double media = (nota[0] + nota[1] + nota[2])/3;
		double limitefaltas = 80 - (0.25 * 80) ;
		
		if (faltas[0] > limitefaltas){
			System.out.println("Nome: "  + nome);
			System.out.println("1ª nota: "  + nota[0]);
			System.out.println("2ª nota: "  + nota[1]);
			System.out.println("3ª nota: "  + nota[2]);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("Nº de faltas: " + faltas[0]);
			System.out.println("Situaçao: Reprovado por numero de faltas.");
		}
		
		if (media >= 7 && faltas[0] <= limitefaltas){
			System.out.println("Nome: "  + nome);
			System.out.println("1ª nota: "  + nota[0]);
			System.out.println("2ª nota: "  + nota[1]);
			System.out.println("3ª nota: "  + nota[2]);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("Nº de faltas: " + faltas[0]);
			System.out.println("Situaçao: Aprovado.");
		}
		
		else if (media < 7){
			System.out.println("Nome: "  + nome);
			System.out.println("1ª nota: "  + nota[0]);
			System.out.println("2ª nota: "  + nota[1]);
			System.out.println("3ª nota: "  + nota[2]);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("Nº de faltas: " + faltas[0]);
			System.out.println("Situaçao: Reprovado por media.");
		}
		

	}

}