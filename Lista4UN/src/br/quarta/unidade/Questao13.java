package br.quarta.unidade;
import java.util.*;
public class Questao13 {

	/**
	 * Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
Se a média de idade dos alunos é inferior de 25, apresentar a mensagem "Turma Jovem";
Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem "Turma Adulta";
Se a média de idade dos alunos é acima de 40 anos, apresentar a mensagem "Turma Idosa".
	 */
	public static void main(String[] args) {
		int idade1, idade2, idade3 = 0;
		int limite = 0;
		String nome1, nome2, nome3;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ola, usuario. Sou um programa criado para cadastrar tres alunos e, de acordo com a media de idade, classifica-los na turma adequada.");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite a quantidade de vezes que deseja executar o programa.");
		System.out.println("Obs.: O limite maximo eh de 5 vezes.");
		limite = sc.nextInt();
		
		if (limite == 0){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		while (limite < 0 || limite > 5){
			System.out.println("Erro! Tente novamente.");
			limite = sc.nextInt();
		}
		
		for (int contador = 0; contador < limite; contador ++){
		System.out.println("Digite o nome do(a) primeiro(a) aluno(a).");
		nome1 = sc.next();
		System.out.println("Digite a idade do(a) primeiro(a) aluno(a).");
		idade1 = sc.nextInt();
		
		while (idade1 <= 0){
			System.out.println("Erro! A idade deve ser maior que 0 (zero).");
			System.out.println("Tente novamente.");
			idade1 = sc.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("Digite o nome do(a) segundo(a) aluno(a).");
		nome2 = sc.next();
		System.out.println("Digite a idade do(a) segundo(a) aluno(a).");
		idade2 = sc.nextInt();
		
		while (idade2 <= 0){
			System.out.println("Erro! A idade deve ser maior que 0 (zero).");
			System.out.println("Tente novamente.");
			idade2 = sc.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("Digite o nome do(a) terceiro(a) aluno(a).");
		nome3 = sc.next();
		System.out.println("Digite a idade do(a) terceiro(a) aluno(a).");
		idade3 = sc.nextInt();
		
		while (idade3 <= 0){
			System.out.println("Erro! A idade deve ser maior que 0 (zero).");
			System.out.println("Tente novamente.");
			idade3 = sc.nextInt();
		}
		
		int mediadeidade = (idade1 + idade2 + idade3)/3;
		
		if (mediadeidade < 25){
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome1);
			System.out.println("Idade: " + idade1);
			System.out.println("Turma: Jovem");
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome2);
			System.out.println("Idade: " + idade2);
			System.out.println("Turma: Jovem");
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome3);
			System.out.println("Idade: " + idade3);
			System.out.println("Turma: Jovem");
		}
		
		else if ((mediadeidade >= 25) && (mediadeidade <= 40)){
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome1);
			System.out.println("Idade: " + idade1);
			System.out.println("Turma: Adulta");
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome2);
			System.out.println("Idade: " + idade2);
			System.out.println("Turma: Adulta");
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome3);
			System.out.println("Idade: " + idade3);
			System.out.println("Turma: Adulta");
		}
		
		else if (mediadeidade > 40){
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome1);
			System.out.println("Idade: " + idade1);
			System.out.println("Turma: Idosa");
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome2);
			System.out.println("Idade: " + idade2);
			System.out.println("Turma: Idosa");
			System.out.println(" ");
			System.out.println("Nome do(a) aluno(a): " + nome3);
			System.out.println("Idade: " + idade3);
			System.out.println("Turma: Idosa");
	}
		}
		
		System.out.println("\nPrograma encerrado!");
		System.exit(0);
}
	}