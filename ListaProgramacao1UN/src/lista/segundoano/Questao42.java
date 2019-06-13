package lista.segundoano;
import java.util.*;
public class Questao42 {

	/**
	 * Faça um Programa que leia um número e exiba o dia correspondente da semana. (1- Domingo, 2-
Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int dia[] = new int [1];
		
		for (int i = 0; i < dia.length; i ++){
		System.out.println("Digite um numero correspondente a um dia da semana.");
		dia[i] = sc.nextInt();
		sc.close();
		
		switch(dia[i]){
		case 1: System.out.println("Domingo."); break;
		case 2: System.out.println("Segunda."); break;
		case 3: System.out.println("Terça."); break;
		case 4: System.out.println("Quarta."); break;
		case 5: System.out.println("Quinta."); break;
		case 6: System.out.println("Sexta."); break;
		case 7: System.out.println("Sabado."); break;
		default : System.out.println("Valor invalido."); break; 
			}
		}
	}

}