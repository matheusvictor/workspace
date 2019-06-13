package lista.segundoano;
import java.util.*;
public class Questao47 {

	/**
	 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas
seguintes situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não
deve fazer pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o
programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe a ao usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float a[] = new float [1];
		float b[] = new float [1];
		float c[] = new float [1];
		
		System.out.println("Digite o valor do coeficiente A.");
		a[0] = sc.nextFloat();
		
		if (a[0] == 0){
			System.out.println("A equaçao nao eh do segundo grau.");
			System.exit(0);
		}
		
		System.out.println("Digite o valor do coeficiente B.");
		b[0] = sc.nextFloat();
		
		System.out.println("Digite o valor do coeficiente C.");
		c[0] = sc.nextFloat();
		
		System.out.println("\nEquaçao a ser resolvida: " + a[0] + "x² + " + b[0] + "x + " + c[0]);
	
		System.out.println("\nDelta = " + b[0] + "² - 4*" + a[0] + "*" + c[0]);
		
		float delta = (b[0]*b[0]) - 4 * a[0] * c[0];
		//O comando Math.sqrt(variavel), serve para calcular a raiz quadrada da variavel
		double x1 = (-b[0] + Math.sqrt(delta)) / (2*a[0]);
		double x2 = (-b[0] - Math.sqrt(delta)) / (2*a[0]);
		
		if (delta > 0){
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println("As raizes dessa equaçao sao: ");
			System.out.println("X' = " + x1);
			System.out.println("X'' = " + x2);
		}
		
		else if (delta == 0){
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println("As raizes dessa equaçao sao: ");
			System.out.println("X' e X''= " + x1);
		}
		
		else if (delta < 0){
			System.out.println("O Delta dessa equaçao eh igual a: " + delta);
			System.out.println("Nao existe raizes reais.");
			System.exit(0);
		}
	}
}
