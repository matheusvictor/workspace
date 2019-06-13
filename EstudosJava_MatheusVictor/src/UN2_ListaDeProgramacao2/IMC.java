package UN2_ListaDeProgramacao2;
import java.util.*;
public class IMC {

	/**
	 *Programa criado para cacular o Índice de Massa Corporal (IMC) de uma pessoa.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		//Abrindo o teclado para o usuário
		
		double peso = 0, altura = 0;
		String nome;
		//Declarando as variáveis que serão usadas
		
		System.out.println("Digite o seu nome, por favor.");
		nome = sc.nextLine();
		
		System.out.println("Ola, " + nome + ". Este programa foi criado para calcular o IMC de uma pessoa.");
		System.out.println("O Indice de Massa Corporal (IMC) eh um padrao internacional para avaliar o grau de obesidade de um individuo."); 
		System.out.println("O IMC eh obtido dividindo o peso (em quilogramas) pela altura (em metros) ao quadrado.");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Abaixo segue uma Tabela de IMC.");

		System.out.println(" ");
		//Aqui este comando está sendo usado somente para dar espaço melhor entre as linhas.
		
		System.out.println("Resultado:                           Situação:");
		
		System.out.println(" ");
		//Aqui este comando está sendo usado somente para dar espaço melhor entre as linhas.
		
		System.out.println("Abaixo de 18kg                     Abaixo do peso");
		System.out.println("Entre 18,5kg e 24,9kg               Peso normal");
		System.out.println("Entre 25kg e 29,9kg                Acima do peso");
		System.out.println("Entre 30kg e 34,9kg               Obesidade grau I");
		System.out.println("Entre 35kg e 39,9kg              Obesidade grau II");
		System.out.println("Acima de 40kg               Obesidade mórbida grau III");
		

		System.out.println(" ");
		//Aqui este comando está sendo usado somente para dar espaço melhor entre as linhas.
		
		System.out.println("Pressione enter para continuar e calcular o seu IMC.");
		sc.nextLine();
		
		System.out.println("Por favor, digite o seu peso.");
		peso = sc.nextDouble();
		
		System.out.println("Por favor, digite a sua altura.");
		altura = sc.nextDouble();
		
		double IMC = peso / (altura * altura);
		//Relizando a operação correspondende ao IMC, ou seja, o peso dividio pela altura ao quadrado.
		
		System.out.println( nome + ", o seu IMC eh: " + IMC);
		System.out.println("Para saber sua situaçao, basta comprar o resultado com a tabela acima.");

	}

}
