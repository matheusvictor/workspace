package Vetores.Arrys;
import java.util.Scanner;
public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numAlunos = 5;
		double [] notasAlunos;
		notasAlunos = new double [numAlunos];
		
		for (int i = 0; i < numAlunos; i ++){
			System.out.println("Digite a nota do " + (i + 1) + "º aluno.");
			notasAlunos[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < numAlunos; i ++){
			System.out.println("\nNota do " + (i+1)+ "º aluno: " + notasAlunos[i]);
		}
	}
}