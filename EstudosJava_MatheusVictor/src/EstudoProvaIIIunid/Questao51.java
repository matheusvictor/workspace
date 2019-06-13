package EstudoProvaIIIunid;
import java.util.*;
public class Questao51 {
	/**
	 * Fa�a um Programa para um caixa eletr�nico. O programa dever� perguntar ao usu�rio a valor do saque e depois
informar quantas notas de cada valor ser�o fornecidas. As notas dispon�veis ser�o as de 1, 5, 10, 50 e 100 reais. O
valor m�nimo � de 10 reais e o m�ximo de 600 reais. O programa n�o deve se preocupar com a quantidade de
notas existentes na m�quina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota
de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece tr�s notas de 100, uma nota de 50, quatro
notas de 10, uma nota de 5 e quatro notas de 1.
	 */
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String nome, senha;
	int saque = 0;
	
	System.out.println("Bem-vindo(a) ao Caixa Eletronico do Banco Central de Gotham City.");
	System.out.println("Digite o seu nome para continuar.");
	nome = sc.nextLine();
	System.out.println("Digite sua senha.");
	senha = sc.nextLine();
	System.out.println(" ");
	System.out.println(nome + ", as notas dispon�veis ser�o as de 1, 5, 10, 50 e 100 reais. O valor m�nimo � de R$ 10,00 e o m�ximo de R$ 600,00.");
	System.out.println("Tecle ENTER para continuar.");
	sc.nextLine();
	System.out.println("Digite o valor do saque.");
	System.out.println("Obs.: Digite apenas os numeros.");
	saque = sc.nextInt();
	while (saque < 10){
		System.out.println("Erro! O valor minimo de saque eh de R$ 10,00.");
		System.out.println("Tente novamente.");
		saque = sc.nextInt();
	}
	
	while (saque > 600){
		System.out.println("Erro! O limite de saque eh de R$ 600,00.");
		System.out.println("Tente novamente.");
		saque = sc.nextInt();
	}
	
	sc.close();
	
	int cem = saque / 100;
	int valor = saque % 100;
	
	int cinquenta = valor / 50;
	int valor2 = valor % 50;
	
	int dez = valor2 / 10;
	int valor3 = valor2 % 10;
	
	int cinco = valor3 / 5;
	int valor4 = valor3 % 5;
	
	int um = valor4 / 1;
	int valor5 = valor4 % 1;
		
	System.out.println(" ");
	System.out.println("Nome do usuario: " + nome);
	System.out.println("Senha: ********");
	System.out.println("Valor do saque: R$ " + saque);
	System.out.println("Serao fornecidas: ");
	System.out.println(valor + " notas de R$ 100.");
	System.out.println(valor2 + " notas de R$ 50.");
	System.out.println(valor3 + " notas de R$ 10.");
	System.out.println(valor4 + " notas de R$ 5.");
	System.out.println(valor5 + " notas de R$ 1.");
	}
}