package questao01;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opc;

		System.out.println("Digite o nome do cliente.");
		String nome = sc.next();
		System.out.println("Digite o CPF.");
		String cpf = sc.next();
		System.out.println("Digite o telefone.");
		String telefone = sc.next();
		System.out.println("Digite o ano de nascimento.");
		int nascimento = sc.nextInt();
		System.out.println("Digite o numero de contas que deseja cadastrar para este cliente.");
		int qntd = sc.nextInt();
		
		Clientes cliente = new Clientes(nome, qntd);
				
		do{
			System.out.println("#################################");
			System.out.println("Digite a opçao desejada:");
			System.out.println("1 - Cadastrar conta.");
			System.out.println("2 - Excluir conta.");
			System.out.println("3- Listar contas.");
			System.out.println("4- Pesquisar conta.");
			System.out.println("0 - Sair");
			System.out.println("##################################");
			opc = sc.nextInt();
			
			while(opc < 0 || opc > 4){
				System.out.println("Tente novamente.");
				opc = sc.nextInt();
			}
			
			if(opc == 1){			
				
				System.out.println("Numero da conta.");
				int numero = sc.nextInt();
				System.out.println("Numero da agencia.");
				int agencia = sc.nextInt();
				System.out.println("Senha.");
				String senha = sc.next();
				
				Conta c = new Conta(numero, agencia, senha);
				cliente.adicionar(c);
						
			}
	
			else if(opc == 2){
				System.out.println("Digite o numero da conta que deseja excluir.");
				int numero = sc.nextInt();
								
				if(cliente.getContas() != null){
					cliente.excluir(numero);
				
				}
			}
			
			else if(opc == 3){
				cliente.listar();
			}
			
			else if(opc == 4){
				System.out.println("Digite o numero da conta que deseja pesquisar.");
				int numero = sc.nextInt();
				
				if(cliente.getContas() != null){
					cliente.pesquisar(numero);
				}

			}
			
			else if(opc  == 0){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			
			
		}while(opc != 0);
		
	
	}

}
