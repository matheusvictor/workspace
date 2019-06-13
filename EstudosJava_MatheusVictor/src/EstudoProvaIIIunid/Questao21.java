package EstudoProvaIIIunid;
import java.util.*;
public class Questao21 {
	//Corrigindo... Esta eh a Questão 22.

	/**
	 * Faça um algoritmo para ler os coeficiente de uma equação do segundo grau e calcular as suas raízes, na forma Ax²
+ Bx + C, levando em consideração a existência de raízes reais (Δ > 0, a equação possui duas raízes reais e
distintas; Δ = 0, a equação possui raízes reais iguais; Δ < 0, a equação não possui raízes reais).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float a, b, c = 0;
		
		System.out.println("Usuario, sou um programa criado para encontrar as raizes de uma equação do 2º grau, no formato ax² + bx + c");
		System.out.println("Tecle ENTER para continuat.");
		sc.nextLine();
		
		System.out.println("Digite o valor do coeficiente A.");
		a = sc.nextFloat();
		
		System.out.println("Digite o valor do coeficiente B.");
		b = sc.nextFloat();
		
		System.out.println("Digite o valor do coeficiente C.");
		c = sc.nextFloat();

		sc.close();
		float delta = (b*b) - 4*a*c;
		System.out.println(" ");
		System.out.println("Recebidos os valores dos coeficientes, vamos calcular o valor de Delta:");
		System.out.println("Delta = b² - 4ac");
		System.out.println("      = " + b + "² + 4 * " + a + " * " + c);
		System.out.println("      = " + delta);
		
		if (delta > 0){
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println(" ");
			System.out.println("Ja calculado o valor de Delta, encontraremos a(s) raize(s) da equaçao:");
			System.out.println("X' = (-b + raiz de delta) / (2a)");
			System.out.println("   = - (" + b + ") + " + delta + " / 2*(" + a + ")");
			System.out.println("   = " + x1);
			System.out.println(" ");
			System.out.println("X'' = (-b - raiz de delta) / (2a)");
			System.out.println("    = - (" + b + ") - " + delta + " / 2*(" + a + ")");
			System.out.println("    = " + x2);
		}
		
		else if (delta == 0){
			double x = (-b + Math.sqrt(delta))/(2*a);
			System.out.println(" ");
			System.out.println("Ja calculado o valor de Delta, encontraremos a(s) raize(s) da equaçao:");
			System.out.println("X' e X'' = (-b + raiz de delta) / (2a)");
			System.out.println("         = - (" + b + ") + " + delta + " / 2*(" + a + ")");
			System.out.println("         = " + x);
		}
		
		else {
			System.out.println("Nao existem raizes reais para Delta menor do que 0 (zero).");
		}
	}
}