package atividade02;
import java.util.*;
public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int numero = sc.nextInt();
		
		do{
			//caso o resto da divisão do num digitado por 3 for diferente de 0, quer dizer que este
			//nao eh multiplo de 3, entao, imprime.
			if(numero % 3 != 0){ 
				System.out.println(numero);
			}
			numero ++;
			//somando +1 ao numero anterior
						
		}while(numero % 10 != 0); //condiçao que verifica se eh ou nao multilpo de 10
		
		if(numero % 10 == 0){
			System.out.println("\nMultiplo de 10 encontrado!\nPrograma encerrado!");
			System.exit(0);
		}
		
		
	}

}
