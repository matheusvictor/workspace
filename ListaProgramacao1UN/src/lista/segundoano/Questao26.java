package lista.segundoano;
import java.util.*;
public class Questao26 {

	/**
	 *Fa�a um algoritmo para ler o nome, as tr�s notas e o n�mero de faltas de um aluno e escrever qual
a sua situa��o final: Aprovado, Reprovado por Falta ou Reprovado por M�dia. A m�dia para
aprova��o � 7,0 e o limite de faltas � 25% do total de aulas. O n�mero de aulas ministradas no
semestre foi de 80. A reprova��o por falta sobrep�e a reprova��o por M�dia.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double nota[] = new double [3];
		int faltas[] = new int [1];
		
		System.out.println("Digite o nome do(a) aluno(a).");
		nome = sc.nextLine();
		
		for (int i = 0; i < 3; i ++){
		System.out.println("Digite a " + (i+1) + "� nota");
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
			System.out.println("1� nota: "  + nota[0]);
			System.out.println("2� nota: "  + nota[1]);
			System.out.println("3� nota: "  + nota[2]);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("N� de faltas: " + faltas[0]);
			System.out.println("Situa�ao: Reprovado por numero de faltas.");
		}
		
		if (media >= 7 && faltas[0] <= limitefaltas){
			System.out.println("Nome: "  + nome);
			System.out.println("1� nota: "  + nota[0]);
			System.out.println("2� nota: "  + nota[1]);
			System.out.println("3� nota: "  + nota[2]);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("N� de faltas: " + faltas[0]);
			System.out.println("Situa�ao: Aprovado.");
		}
		
		else if (media < 7){
			System.out.println("Nome: "  + nome);
			System.out.println("1� nota: "  + nota[0]);
			System.out.println("2� nota: "  + nota[1]);
			System.out.println("3� nota: "  + nota[2]);
			System.out.println("Media: "  + Math.ceil(media));
			System.out.println("N� de faltas: " + faltas[0]);
			System.out.println("Situa�ao: Reprovado por media.");
		}
		

	}

}