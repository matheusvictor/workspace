package lista.segundoano;
import java.util.*;
public class Questao15 {

	/** Desenvolva um algoritmo que leia duas notas de um aluno, um trabalho (todos os valores entre 0 e
10) e sua frequência, definindo e imprimindo se ele foi aprovado, reprovado ou se fará prova final.
O aluno será reprovado se faltou mais de 15 aulas. Será aprovado se não for reprovado por falta e
sua média for maior que 6,0. Caso tenha média menor, de verá fazer prova final. O cálculo da
média deve ser feito com peso 3 para a primeira prova, 5 para a segunda prova e 2 para o trabalho.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double nota[] = new double [3];
		int frequencia[] = new int[1];
		
		for (int i = 0; i < 3; i ++){
			
		System.out.println("Digite a " + (i+1) + "ª nota do aluno.");
		nota[i] = sc.nextDouble();
		
		while (nota[i] < 0 || nota[i] > 10){
			System.out.println("Nota invalida. Tente novamente.");
			nota[i]= sc.nextDouble();
			
			}
		}
		
		for (int i = 0; i < 1; i ++){
		System.out.println("Digite o numero de faltas que o aluno teve durante o sementre/unidade.");
		frequencia[i] = sc.nextInt();
		
		while (frequencia[i] < 0){
			System.out.println("Erro! Tente novamente.");
			frequencia[i] = sc.nextInt();
		}	
		
	}
		
		double media = ((nota[0]*3) + (nota[1]*5) + (nota[2]*2))/3;
		//Calculando a media de acordo com os pesos aplicados em cada nota.
		
		if (frequencia[0] > 15){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1]);
			System.out.println("Nota do trabalho: " + nota[2]);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("Nº de faltas durante o semestre/unidade: " + frequencia[0]);
			System.out.println("Situaçao: REPROVADO POR NÚMERO DE FALTAS.");
		}
		
		else if (frequencia[0] <= 15 && media >= 6){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1]);
			System.out.println("Nota do trabalho: " + nota[2]);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("Nº de faltas durante o semestre/unidade: " + frequencia[0]);
			System.out.println("Situaçao: APROVADO.");
		}
		
		else if (frequencia[0] <= 15 && media < 6){
			System.out.println("1ª nota: " + nota[0]);
			System.out.println("2ª nota: " + nota[1]);
			System.out.println("Nota do trabalho: " + nota[2]);
			System.out.println("Media: " + Math.ceil(media));
			System.out.println("Nº de faltas durante o semestre/unidade: " + frequencia[0]);
			System.out.println("Situaçao: PROVA FINAL.");
		}		
	}
}