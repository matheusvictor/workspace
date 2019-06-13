import java.util.ArrayList; //Import do Array, ver os vetores.
import java.util.Scanner;


public class testaCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<cliente> Cliente = new ArrayList<cliente>(); // Coleçao de Objetos, sem um valor minimo.
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true; // Opc para quando terminar um programa, repetir as opc definidas. 
		
		int op1;
		int op2=0;
		int op3=0;
		String idCpf;
		
		System.out.println("........................");
		System.out.println("INDIQUE A OPÇÃO DESEJADA");
		System.out.println("........................");
		System.out.println("1 - Cadastrar   | 2 - Sair");
		System.out.println("..........................");
		op1 = sc.nextInt();
		
		switch(op1){
			
		case 1: //Cadastro do Usuario.
			do{	
				cliente c = new cliente();
				System.out.println("Nome");
				c.setNome(sc.next());
				System.out.println("CPF");
				c.setCpf(sc.next());
				System.out.println("Idade");
				c.setIdade(sc.nextInt());
				Cliente.add(c);
				
				System.out.println("Cadastrar novo? | SIM - 1 | NAO - 2|");
				op2 = sc.nextInt();  //Opc para cadastrar um novo usuario, se opc escolhida for "sim"	
				                     //O programa retorna para o cadastramento, se opc escolhida for "nao" 
			}while(op2==1);          //O usuario é redirecionado para a Flag. 
			
			while(flag){ // Quando o usuario terminar de usar algo, volta para as opc do menu abaixo.
			System.out.println("DIGITE A OPCAO DESEJADA");
			System.out.println("1 - Listar Cadastros");
			System.out.println("2 - Excluir Cadastros");
			System.out.println("3 - Consultar");
			System.out.println("4 - Sair");
			op3 =  sc.nextInt();
			
				switch(op3){
				
					case 1: 
							for(cliente c : Cliente){
								System.out.println(c);
							}
							System.out.println("Numero de clientes no sistema" + Cliente.size());
							break; //Cliente.size diz o total de usuarios cadastrados no sistema.
					case 2:
						System.out.println("Informe o cpf da pessoa que deseja exclui"); 
					    idCpf = sc.next();
						// Removendo usuario cadastrado pelo cpf... 
						for(cliente c : Cliente){
							// Metodo para varrer a array 
							
							
							if(idCpf.equals(c.getCpf())){ // comparando CPF digitado com os cadastrados. 
								Cliente.remove(c);
							}else if(c.getCpf()!=idCpf){ 
								System.out.println("Digite um cpf correto");
							}
							}
						
						break;
					case 3: 
						System.out.println("Informe o cpf da pessoa que deseja consultar"); 
					    idCpf = sc.next();
						// Consultando usuario cadastrado pelo cpf... 
						for(cliente c : Cliente){
							// Metodo para varrer a array 
							
							
							if(c.getCpf() == idCpf){ // comparando CPF digitado com os cadastrados. 
								System.out.println(c);
							}else if(c.getCpf()!=idCpf){ 
								System.out.println("Cpf nao encontrado");
							}
							}
							break;
							
					case 4: flag = false; //se flag for igual a false, encerra o menu e o programa sucessivamente
					System.out.println("Menu encerrado");
				}
				
		}
		
		
		
		
		
	}
	}
}
