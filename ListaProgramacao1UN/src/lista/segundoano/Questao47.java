package lista.segundoano;
import java.util.*;
public class Questao47 {

	/**
	 * Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c.
O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas
seguintes situa��es:
Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o
deve fazer pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equa��o n�o possui ra�zes reais. Informe ao usu�rio e encerre o
programa;
Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe a ao usu�rio;
Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio;
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float a[] = new float [1];
		float b[] = new float [1];
		float c[] = new float [1];
		
		System.out.println("Digite o valor do coeficiente A.");
		a[0] = sc.nextFloat();
		
		if (a[0] == 0){
			System.out.println("A equa�ao nao eh do segundo grau.");
			System.exit(0);
		}
		
		System.out.println("Digite o valor do coeficiente B.");
		b[0] = sc.nextFloat();
		
		System.out.println("Digite o valor do coeficiente C.");
		c[0] = sc.nextFloat();
		
		System.out.println("\nEqua�ao a ser resolvida: " + a[0] + "x� + " + b[0] + "x + " + c[0]);
	
		System.out.println("\nDelta = " + b[0] + "� - 4*" + a[0] + "*" + c[0]);
		
		float delta = (b[0]*b[0]) - 4 * a[0] * c[0];
		//O comando Math.sqrt(variavel), serve para calcular a raiz quadrada da variavel
		double x1 = (-b[0] + Math.sqrt(delta)) / (2*a[0]);
		double x2 = (-b[0] - Math.sqrt(delta)) / (2*a[0]);
		
		if (delta > 0){
			System.out.println("O Delta dessa equa�ao eh igual a: " + delta);
			System.out.println("As raizes dessa equa�ao sao: ");
			System.out.println("X' = " + x1);
			System.out.println("X'' = " + x2);
		}
		
		else if (delta == 0){
			System.out.println("O Delta dessa equa�ao eh igual a: " + delta);
			System.out.println("As raizes dessa equa�ao sao: ");
			System.out.println("X' e X''= " + x1);
		}
		
		else if (delta < 0){
			System.out.println("O Delta dessa equa�ao eh igual a: " + delta);
			System.out.println("Nao existe raizes reais.");
			System.exit(0);
		}
	}
}
