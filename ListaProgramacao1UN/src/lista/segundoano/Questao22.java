package lista.segundoano;
import java.util.Scanner;
public class Questao22 {

	/**
	 * Faça um algoritmo para ler os coeficiente de uma equação do segundo grau e calcular as suas
raízes, na forma Ax2 + Bx + C, levando em consideração a existência de raízes reais (Δ > 0, a
equação possui duas raízes reais e distintas; Δ = 0, a equação possui raízes reais iguais; Δ < 0, a
equação não possui raízes reais).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float a[] = new float [1];
		float b[] = new float [1];
		float c[] = new float [1];
		
		System.out.println("Digite o valor do coeficiente A.");
		a[0] = sc.nextFloat();
		
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
		}
	}
}