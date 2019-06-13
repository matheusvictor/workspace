
import java.util.Scanner;
//Indica que o teclado será usado.

public class CalculadoraBasica {

	public static void main(String[] args) {
						
		System.out.println( "Ola, sou o Calculator 0.1.");
		System.out.println("Dessa vez iremos somar dois número e, em seguida, obter o dobro do mesmo.");
		System.out.println("Obs.: Os numero que serao usado devem ser numeros inteiros");
		
		System.out.println("Por favor, digite o primeiro numero: ");
		
				Scanner numero1 = new Scanner (System.in);
				int  numero = numero1.nextInt();
				
				System.out.println("Por favor, agora digite o segundo numero:");
				Scanner numero2 = new Scanner (System.in);
				int  numer = numero2.nextInt();
				
		        System.out.println("Agora, digite o terceiro e ultimo numero:");
				Scanner numero3 = new Scanner (System.in);
		                int number = numero3.nextInt();
		                
		                int soma = numero*numer*number;
		                
		                System.out.println("multiplicação= " +soma);
		                System.out.println("Desenvolvido por: Wallace Nery.");
		                System.out.println("Adaptado por: Matheus Victor");
		                System.out.println("Obrigado por utilizar.");
				
				}
			}

	
