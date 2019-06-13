package questao02;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opc;

		System.out.println("Digite o nome da livraria.");
		String nomeLivraria = sc.nextLine();
		System.out.println("Digite o CNPJ.");
		String cnpj = sc.nextLine();
		System.out.println("Digite o telefone.");
		String telefone = sc.nextLine();
		System.out.println("Digite o endereço.");
		String endereco = sc.nextLine();
		System.out.println("Digite o numero de livros que deseja cadastrar para esta livraria.");
		int qntd = sc.nextInt();
		
		Livraria livraria = new Livraria(nomeLivraria, qntd);
				
		do{
			System.out.println("#################################");
			System.out.println("Digite a opçao desejada:");
			System.out.println("1 - Cadastrar livro.");
			System.out.println("2 - Excluir livro.");
			System.out.println("3- Listar livros.");
			System.out.println("4- Pesquisar livro.");
			System.out.println("0 - Sair");
			System.out.println("##################################");
			opc = sc.nextInt();
			
			while(opc < 0 || opc > 4){
				System.out.println("Tente novamente.");
				opc = sc.nextInt();
			}
			
			if(opc == 1){	
				
				System.out.println("Nome do livro. (sem espaços)");
				String nomeLivro = sc.next();
				System.out.println("Autor.");
				String autor = sc.next();
				System.out.println("Editora.");
				String editora = sc.next();
				System.out.println("Cog. do livro.");
				int codigo = sc.nextInt();
				
				Livro l = new Livro(nomeLivro, autor, editora, codigo);
				livraria.adicionar(l);
						
			}
	
			else if(opc == 2){
				System.out.println("Digite o cod. do livro que deseja excluir.");
				int codigo = sc.nextInt();
								
				if(livraria.getLivros() != null){
					livraria.excluir(codigo);
				}
				
			}
			
			else if(opc == 3){
				livraria.listar();
			}
			
			else if(opc == 4){
				System.out.println("Digite o cod. do livro que deseja pesquisar.");
				int codigo = sc.nextInt();
				
				if(livraria.getLivros() != null){
					livraria.pesquisar(codigo);
				}

			}
			
			else if(opc  == 0){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			
			
		}while(opc != 0);
	
	}

}