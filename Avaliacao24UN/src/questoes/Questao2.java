package questoes;
import java.util.*;
public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero, contador = 0;
		int tam = 5;
		int maior = 0, maior2 = 0;
		
		while (contador < tam){
			
			System.out.println("Digite o " + (contador+1) + "º numero.");
			numero = sc.nextInt();
			
			if (numero > maior){
			    maior2 = maior;
				maior = numero;
			}
			
			if (numero < maior){
				//Se o numero for menor que o maior, ou seja, o numero digitado anteriormente...
				
				if (numero >= maior2){
					maior2 = numero;
				}				
			}			
			contador ++;
		}
		System.out.println("Primeiro maior numero: " + maior);
		System.out.println("Segundo maior numero: " + maior2);
	}
}