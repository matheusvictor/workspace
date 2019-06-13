package EstudoProvaIIIunid;
import java.util.*;
public class Questao44 {
	/**
	 * Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser um
tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
Dicas:
Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
Tri�ngulo Equil�tero: tr�s lados iguais; Tri�ngulo Is�sceles: quaisquer dois lados iguais;
Tri�ngulo Escaleno: tr�s lados diferentes;
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double lado1, lado2, lado3 = 0;
		
		System.out.println("Digite o tamanho (em cm) do primeiro lado.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		lado1 = sc.nextDouble();
		
		System.out.println("Digite o tamanho (em cm) do segundo lado.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		lado2 = sc.nextDouble();
		
		System.out.println("Digite o tamanho (em cm) do terceiro lado.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
		lado3 = sc.nextDouble();
		
		sc.close();
		
		if (lado1+lado2>lado3 || lado1+lado3>lado2 || lado2+lado3>lado1){
			System.out.println(" ");
			System.out.println("Primeiro lado: " + lado1 + " cm");
			System.out.println("Segundo lado: " + lado2 + " cm");
			System.out.println("Terceiro lado: " + lado3 + " cm");
			System.out.println("Eh um triangulo.");
			
			if ((lado1==lado2)&&(lado2==lado3)){
				System.out.println("Tipo do triangulo: Equilatero.");
			}
			
			else if ((lado1 != lado2)&&(lado2 != lado3)&&(lado1 !=lado3)){
				System.out.println("Tipo do triangulo: Escaleno.");
			}
			
			else if ((lado1 == lado2 && lado1 != lado3)||(lado1 == lado3 && lado1 != lado2)||(lado2 == lado3 && lado2 != lado1)){
				System.out.println("Tipo do triangulo: Isoceles.");

			
			}
	
		else {
			System.out.println("Primeiro lado: " + lado1 + " cm");
			System.out.println("Segundo lado: " + lado2 + " cm");
			System.out.println("Terceiro lado: " + lado3 + " cm");
			System.out.println("As medidas fornecidas nao formam um triangulo, pois para formar um triangulo, a soma de qualquer um dos dois lados, deve ser maior do que a medida do terceiro lado.");
		}
			
		}	
	}
}