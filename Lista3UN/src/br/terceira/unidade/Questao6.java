package br.terceira.unidade;
import java.util.*;
public class Questao6 {

	/**
	 * Ler um número inteiro e testar se o valor lido termina com 0 (divisível por 10). Em caso positivo, exiba a metade.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		 int numero;
		 
		 System.out.println("Usuario, digite um numero inteiro qualquer.");
		 numero = sc.nextInt();
		 sc.close();
		 
		 if ((numero % 10) == 0 && (numero > 0)){
			System.out.println("Valor digitado: " + numero);
			System.out.println("Este valor eh divisivel por 10.");
			System.out.println("A metade desse numero eh: " + numero / 2);
		 }
		 
		  if ((numero % 10) == 0 && (numero < 0)){
			  System.out.println("Valor digitado: " + numero);
			  System.out.println("Este valor eh divisivel por 10.");
		  }
		  
		  else if ((numero % 10) != 0){
			  System.out.println("Este numero nao eh divisivel por 10.");
		  }


	}

}
