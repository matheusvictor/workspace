package br.quarta.unidade;
import java.util.*;
public class Questao3 {

	/**
	 * Ler 3 números inteiros e testar se os valores lidos terminam com 0 (divisível por 10). Em caso positivo, exiba a
metade de cada número. Caso contrário, exibir a mensagem "O número digitado não termina com 0".
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		 int numero = 0;
		 int n = 3;
		 
		 for (int contador = 0; contador < n; contador ++){
		 System.out.println("\nDigite um numero inteiro qualquer.");
		 numero = sc.nextInt();
		 //Esta parte sera executada 3x
		 
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
		 
		 System.out.println("\nPrograma encerrado!");
		 System.exit(0);
		 //Esta mensagem so aparecera quando o programa inicial tiver sido excutado 3x
	}
}