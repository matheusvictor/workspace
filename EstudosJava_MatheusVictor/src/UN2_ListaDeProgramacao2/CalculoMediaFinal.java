package UN2_ListaDeProgramacao2;

import java.util.Scanner;

public class CalculoMediaFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		//Abrindo o teclado.
		
		String nome, escola, disciplina, serie; 
		int idade =0; 
		double n1, n2,n3,n4, mediafinal = 0;
		char t = 0;
		//Declarando as variáveis.
		
		System.out.println("Ola, bem-vind@ ao portal do aluno.");
				
		System.out.println("Informe o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println(nome + ", informe o local onde voce estuda, por favor.");
		escola = sc.nextLine();
		
		System.out.println("Atualmente, em que serie voce se encontra?");
		serie = sc.nextLine();
		
		System.out.println("Digite a sua turma (A ou B):");
		t = sc.next().charAt(0);
		
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Cadastro realizado com sucesso! Confira seus dados abaixo:");
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Instituição de ensino: " +escola);
		System.out.println("Serie: " +serie);
		System.out.println("Turma: " +t);
		
		System.out.println("");
		//Aqui usado somente para dar melhor espaço entre as linhas.
		
		System.out.println("Digite o nome da disciplina em que deseja calcular sua media.");
	    disciplina = sc.nextLine();
	    
	    System.out.println("Digite a nota da I Unidade:");
	    n1 = sc.nextDouble();
	    
	    System.out.println("Digite a nota da II Unidade:");
	    n2 = sc.nextDouble();
	    
	    System.out.println("Digite a nota da III Unidade:");
	    n3 = sc.nextDouble();
	    
	    System.out.println("Digite a nota da IV Unidade:");
	    n4 = sc.nextDouble();
	    
	    mediafinal = (n1+n2+n3+n4)/4;
	    //Calculando a média final.
	    
	    System.out.println("Media final em " + disciplina + ":" +mediafinal);

	}

}
