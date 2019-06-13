package Questao1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Contador c = new Contador();
		Scanner sc = new Scanner (System.in);
		int opc;
		
		do{
			System.out.println("Digite uma das opçoes abaixo:");
			System.out.println("1- Incrementar +1 ao contador.");
			System.out.println("2 - Zerar o contador.");
			System.out.println("3 - Exibir contador.");
			System.out.println("4 - Sair do programa.");
			opc = sc.nextInt();
			
			while (opc > 4 || opc < 1){
				System.out.println("Opcao invalida. Tente novamente.");
				opc = sc.nextInt();
			}
			
			if (opc == 1){
				c.incrementar();		
			}
			
			if(opc == 2){
				c.zerar();		
			}
			
			if(opc == 3){
				c.retornar();
				System.out.println("");
			}
			
			if (opc == 4){
				System.out.println("programa encerrado!");
				System.exit(0);
			}
			
		} while (opc != 4);
		

	}
}