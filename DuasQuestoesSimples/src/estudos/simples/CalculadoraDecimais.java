package estudos.simples;
import java.util.*;
public class CalculadoraDecimais {
	
		public static void main(String[] args) {
			
			char x = 0;
			double numero1, numero2;
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Usuario, sou uma calculadora basica criada para fazer uma operaçao entre dois numeros decimais.");
			System.out.println("Tecle enter para continuar.");
			sc.nextLine();
			
			System.out.println("Digite um numero decimal qualquer.");
			numero1 = sc.nextDouble();
			
			System.out.println("Digite um numero decimal qualquer.");
			numero2 = sc.nextDouble();
			
			System.out.println("Digite a operaçao desejada. Ex.: + , - , * ou /");
			x = sc.next().charAt(0);
			
			sc.close();
			
			double soma = numero1 + numero2;
			double subtracao = numero1 - numero2;
			double multiplicacao = numero1 * numero2;
			double divisao = numero1 / numero2;
			//Como as operaçoes nao podem ser postas dentro do switch, as fizemos antes, criando assim novas variaveis.
			
			switch (x) {
			
			case '+': 
				System.out.println("A soma entre " + numero1 + " e " + numero2 + " eh: " + soma);
				break;
				
			case '-':
				System.out.println("A subtraçao entre " + numero1 + " e " + numero2 + " eh: " + subtracao);
				break;
				
			case '*':
				System.out.println("A multiplicaçao entre " + numero1 + " e " + numero2 + " eh: " + multiplicacao);
				break;
				
			case '/':
				System.out.println("A divisao entre " + numero1 + " e " + numero2 + " eh: " + divisao);
				break;		
			}
		}
	}