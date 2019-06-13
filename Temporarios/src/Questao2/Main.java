package Questao2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Produto p[] = new Produto[5];
		boolean flag = true;
		int opc;
		int i = 0;
		
		while(flag){
			System.out.println("Digite uma opçao:");
			opc = sc.nextInt();
			
			switch(opc){
			
			case 1:
				if(i < p.length){	
				System.out.println("Nome");
				String nome = sc.next();
				System.out.println("Valor");
				double valor = sc.nextDouble();
				System.out.println("cod");
				int cod = sc.nextInt();	
				Produto prod = new Produto(cod, nome, valor);
				p[i] = prod;
				i++;
				}
				else{
					flag = false;
					System.out.println("Limite atingido!");
				}
				break;
				
			case 2:
					for(int n = 0; n < i; n++){
						System.out.println("Digite o cog");
						int cod = sc.nextInt();
						System.out.println("lista: "+ p[n].getCodigo());
						if(cod == p[i].getCodigo()){
							System.out.println(p[i].getNome());
							System.out.println(p[i].getValor());
						}
					}
						
				}
			}
		

}
}

		
		
		
		
		
		
		
		
		/**
		 * 	while(flag){

			opc = sc.nextInt();
			
			switch(opc){
			
			case 1: 
				System.out.println("Nome");
				String nome = sc.next();
				System.out.println("Valor");
				double valor = sc.nextDouble();
				System.out.println("cod");
				int cod = sc.nextInt();
				
				Produto prod = new Produto(cod, nome, valor);
				i++;
				p[i] = prod;
				
			}
		}
		 */
		
	
		

