package lista.segundoano;
import java.util.*;
public class Questao46 {

	/** Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores
podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero,
is�sceles ou escaleno. Dicas:
Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
Tri�ngulo Equil�tero: tr�s lados iguais; Tri�ngulo Is�sceles: quaisquer dois lados iguais;
Tri�ngulo Escaleno: tr�s lados diferentes;
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double lado[] = new double [3];
		
		for (int i = 0; i < 3; i ++){
			System.out.println("Digite o tamanho de um dos lados.");
			lado[i] = sc.nextDouble();
			}
				
	
			if (lado[0] + lado[1] >= lado[2]){
				
				if (lado[0] == lado[1] && lado[1] == lado[2] && lado[2] == lado[0]){
					System.out.println("Formam um triangulo equilatero");
				}
				
				else if (lado[0] != lado[1] && lado[1] != lado[2] && lado[2] != lado[0]){
					System.out.println("Formam um triangulo escaleno.");
				}
				
				else {
					System.out.println("Formam um triangulo isosceles.");
				}
		
			}
			
			else {
				System.out.println("Nao formam um triangulo.");
			}

	}

}