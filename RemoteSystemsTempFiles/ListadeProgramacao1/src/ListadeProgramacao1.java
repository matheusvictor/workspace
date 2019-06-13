import java.util.*;
//"Abrir" todas as bibliotecas do Java

public class ListadeProgramacao1 {

	/**
	 * Programa criado para cadastramento de um automóvel
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String nome;
		String carro;
		String marca;
		String placa;
		String flex;
		int ano;
		int potencia;
		char classe;
		
		//Declarações das variáveis que serão usados no decorrer do programa
		
		System.out.println ("Ola, querido usuario! Antes de começarmos, voce poderia me informar o seu nome?");
		Scanner sc = new Scanner (System.in);
		nome = sc.nextLine();
		
		System.out.println ("Bem, " +nome +"." + "Vamos começar o cadastro de seu veículo no nosso programa.");
		
		System.out.println ("Qual o nome do seu carro? ");
		carro = sc.nextLine();
		
		System.out.print("Qual eh a marca do automovel? ");
		marca = sc.nextLine();
		
		System.out.println ("Qual a placa do seu carro? ");
		placa = sc.nextLine();
		
		System.out.println ("O modelo do seu veiculo eh Flex? ");
		flex = sc.next();
		
		System.out.println ("A que classe o seu veiculo pertence? ");
		classe = (char) System.in.read();
				
				
		System.out.println ("Qual o ano do seu veiculo? ");
		ano = sc.nextInt();
				
		System.out.println ("Qual a potencia do seu automovel? ");
		potencia = sc.nextInt();
							
		System.out.println ("Seus dados foram cadastrados com sucesso!");
		System.out.println ("Nome do automovel: " + " " +carro);
		System.out.println ("Marca: " + " " +marca);
		System.out.println ("Ano: " + " " +ano);
		System.out.println ("Tipo Flex: " + " " +flex);
		System.out.println ("Placa: " + " " +placa);
		System.out.println ("Potencia: " + " " +potencia + "cv");
		System.out.println ("Classe do veiculo: " + " " +classe);
		
		System.out.println ("Obrigado por usar o programa.");
		System.out.println ("Desenvolvido por: Matheus Victor");
					
	

	}

}
