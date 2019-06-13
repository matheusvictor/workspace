package atividade.sala;
import java.util.*; //Importando as bibliotecas java
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		Estoque e = new Estoque();
		//Estanciando o objeto Estoque.
		//Como ha um metodo construtor na classe Estoque que nao passamos parametos, os parateses ficam vazios aqui
		//Mas, la na classe objeto esta 'configurado' para iniciar da forma abaixo (até o usuario digitar algo difirente)
		
		/**
		this.nomeProduto = "Nao tem produto.";
		this.qntAtual = 0;
		this.qntMinima = 0;
		 */
		
		//Caso queira estanciar usando o outro metodo construtor:
		
		//Estoque e = new Estoque("Nao tem produto", 0, 0);
		
		//Mas, desse modo ja fica definido o nome, a qnt minima e atual como as que voce passar como parametro
		//Eh semelhante ao de cima, que citei, MAS, la as pre-definições são feitas na classe,
		//e aqui eh feito quando vc estancia o objeto. 
		
		int opc = 0; //essa variavel eh criada somente para as escolhas do menu
					//e, consequentemente, fazer um condicional para o loop (laço)
		
		do{ 
			System.out.println("\nSelecione a opcao deseja:\n");
			System.out.println("0 - Cadastrar produto.");
			System.out.println("1- Cadastrar a quantidade minima que deseja ter estoque.");
			System.out.println("2 - Cadastrar a quantidade atual de produtos.");
			System.out.println("3 - Mostrar estoque.");
			System.out.println("4 - Dar baixa.");
			System.out.println("5 - Repor estoque.");
			System.out.println("6 - Mudar quantidade minima.");
			System.out.println("7 - Verificar se precisa repor estoque.");
			System.out.println("8 - Sair do programa.");
			opc = sc.nextInt();
			
			while (opc > 8 || opc < 0){
				System.out.println("Opçao invalida. Tente novamente.");
				opc = sc.nextInt();
			}
			//Enquanto a opcao que o usuario digitar nao estiver entre aquelas dispostas no menu,
			//o laço fara voltar para o começo, até q o usuario digite uma opcao valida.
			
			if(opc == 0){
				System.out.println("Digite o nome do produto.");
				e.setNomeProduto(sc.next());
			}
			//Se a opcao digitada for igual a zero... a função "cadastrar produto" sera invocada
			
			//Os outros ifs funcionando basicamente da mesma forma, mas no caso, para cada opc um metodo sera invocado
			
			if(opc == 1){
				System.out.println("Digite a quantidade minima de produtos que deseja ter em estoque.");
				e.setQntMinima(sc.nextInt());
			}
			
			if(opc == 2){
				System.out.println("Digite a quantidade atual de produtos no estoque.");
				e.setQntAtual(sc.nextInt());
			}
			
			if(opc == 3){
				System.out.println(e.mostra());
			}
			
			else if(opc == 4){
				System.out.println("Digite a quantidade de produtos que deseja dar baixa.");
				e.darBaixa(sc.nextInt());
			}
			
			else if(opc == 5){
				System.out.println("Digite a quantidade de produtos que deseja repor.");
				e.repor(sc.nextInt());
			}
			
			else if(opc == 6){
				System.out.println("Digite a nova quantidade minima.");
				e.mudarQntMinima(sc.nextInt());
			}
			
			else if(opc == 7){
				e.precisaRepor();
			}
				
			else if(opc == 8){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
						
		}while(opc >= 0 && opc <= 8);
		//Enquanto o numero digitado como opcao satisfazer a essa condiçao, o laço funcionara
		//Nesse caso, se voce tiver mais opcoes para o usuario, vc tem que mudar a condicional de acordo.

	}

}