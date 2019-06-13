package lista.segundoano;
import java.util.*;
public class Questao46 {

	/** Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores
podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero,
isósceles ou escaleno. Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais; Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;
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