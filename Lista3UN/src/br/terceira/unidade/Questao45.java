package br.terceira.unidade;
import java.util.*; 
public class Questao45 {

	/**
	 * Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c. O programa
dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:

Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve fazer
pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equa��o n�o possui ra�zes reais. Informe ao usu�rio e encerre o programa;
Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe a ao usu�rio;
Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio;
	 */
	
	public static void main(String[] args) {
	
		float a, b, c = 0;
		
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Ola, usuario. Sou um programa feito para calcular as raizes (reais) de uma equa�ao do 2� grau, baseando-se nos coeficientes digitados.");
		System.out.println("Tecle enter para continuar.");
		sc.nextLine();
		
		System.out.println("Vale lembrar que a equa�ao do 2� grau tem como forma: Ax� + Bx + C");
		System.out.println(" ");
		System.out.println("Obs.: Digite apenas numero. No caso de fra�oes, digite o valor decimal a correspondente a ela, exemplo: 1/2 = 0,5.");
		System.out.println(" ");
		
		System.out.println("Digite um valor correspondente ao coeficiente de A.");
		a = sc.nextFloat();
		
		if (a == 0){
			System.out.println("Esta nao eh uma equa�ao do 2� grau, pois o valor do coeficiente A eh igual a 0 (zero).");
			System.out.println(" ");
			System.out.println("Programa encerrado.");
			System.exit(0);
		}
		
		System.out.println("Digite um valor correspondente ao coeficiente de B.");
		b = sc.nextFloat();
		
		System.out.println("Digite um valor correspondente ao coeficiente de C.");
		c = sc.nextFloat();
		
		sc.close();
	
		float delta = (b*b) - 4 * a * c;
		//Realizando a opera��o correspondete ao valor de Delta.
		
		if (delta > 0){
			//O comando Math.sqrt(variavel), serve para calcular a raiz quadrada da variavel desejada, neste cas
			Double x1 = (-b + Math.sqrt(delta)) / (2*a);
			Double x2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.println("O Delta dessa equa�ao eh igual a: " + delta);
			System.out.println(" ");
			System.out.println("As raizes dessa equa�ao sao: ");
			System.out.println("X' = " + x1);
			System.out.println("X'' = " + x2);
			System.out.println(" ");
			System.out.println("Programa encerrado!");
		}
		
		else if (delta == 0){
			//Em ambos os casos (x1 e x2), o valor ser� o mesmo, pois Delta eh igual a zero, entretanto, optou-se calcular os dois individualemente, somente para ter maior clareza para o usu�rio.
			Double x1 = (-b + Math.sqrt(delta)) / (2*a);
			Double x2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.println("O Delta dessa equa�ao eh igual a: " + delta);
			System.out.println(" ");
			System.out.println("As raizes dessa equa�ao sao: ");
			System.out.println("X' = " + x1);
			System.out.println("X'' = " + x2);
			System.out.println("Obs.: As raizes sao iguais, pois Delta eh igual a 0 (zero).");
			System.out.println(" ");
			System.out.println("Programa encerrado!");
		}
		
		else if (delta < 0){
			System.out.println("O Delta dessa equa�ao eh igual a: " + delta);
			System.out.println("Nao existe raizes reais, pois Delta eh menor que 0 (zero).");
			System.out.println(" ");
			System.out.println("Programa encerrado!");
		}
	}
}