package EstudosIniciais;

import java.util.*;

public class Media {

	
	
			public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner (System.in);
			
			String nome, escola, disciplina, serie; 
			int idade; 
			double peso, altura, n1, n2,n3,n4, mediafinal;
			char t;
			
			System.out.println("Ola, bem-vind@ ao portal do aluno.");
			System.out.println("Pressione enter para continuar.");
			sc.nextLine();
			
			System.out.println("Informe o seu nome, por favor.");
			nome = sc.nextLine();
			
			System.out.println("Ola, " +nome + ". Por favor, informe o local onde voce estuda.");
			escola = sc.nextLine();
			
			System.out.println("Atualmente, em que serie voce se encontra?");
			serie = sc.nextLine();
			
			System.out.println("Digite a sua turma (A ou B):");
			t = sc.next().charAt(0);
			
			System.out.println("Qual a sua idade?");
			idade = sc.nextInt();
			
			System.out.println("Por favor, digite a sua altura.");
			altura = sc.nextDouble();
			
			System.out.println("Digite seu peso, por favor.");
			peso = sc.nextDouble();
			
			System.out.println("Cadastro realizado com sucesso! Confira seus dados abaixo:");
			System.out.println("Nome: " +nome);
			System.out.println("Idade: " +idade);
			System.out.println("Instituição de ensino: " +escola);
			System.out.println("Serie: " +serie);
			System.out.println("Turma: " +t);
			System.out.println("Peso " +peso);
			System.out.println("Altura: " +altura);
			
			System.out.println(" ");
			
			System.out.println(" ");
		
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
		    
		    System.out.println(" ");		
		    
		    if (mediafinal >=6) {
		    	System.out.println("Parabens, " +nome +". Voce foi aprovado! :D");
		    }
		    
		    else if (mediafinal <6) {
		    	
		    	System.out.println(nome +", voce foi reprovado! :C ");
		    }

		}
}
	