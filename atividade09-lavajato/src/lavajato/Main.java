package lavajato;

public class Main {

	public static void menuPrincipal(){ //static pode ser chamado a qualquer hora, sem precisar criar um ojeto
		System.out.println("#############################################");
		System.out.println("1 - Cadastrar criminoso");
		System.out.println("2 - Remover Criminoso");
		System.out.println("3 - Listar criminosos");
		System.out.println("4 - Listar criminosos por crime");
		System.out.println("5 - Pesquisar criminoso");
		System.out.println("6 - Sair");
		System.out.println("#############################################");
	}
	
	public static void main(String[] args) {
			
			Processo fase1 = new Processo();
			int opc = 0;
			
			do{
				System.out.println("Selecione uma das opções:");
				menuPrincipal();
				opc = Integer.parseInt(EntradaUsuario.obterEntrada());
				
				while(opc < 1 || opc > 6){
					System.out.println("Opçao invalida! Tente novamente.");
					opc = Integer.parseInt(EntradaUsuario.obterEntrada());
				}
				
				if(opc == 1){
					System.out.println("CPF do criminoso.");
					int cpf = Integer.parseInt(EntradaUsuario.obterEntrada());
					System.out.println("Nome do criminoso.");
					String nome = EntradaUsuario.obterEntrada();
					System.out.println("Cargo do criminoso.");
					String cargo = EntradaUsuario.obterEntrada();
					System.out.println("Crime.");
					String crime = EntradaUsuario.obterEntrada();
					
					Criminoso c = new Criminoso(cpf, nome, cargo, crime);
					fase1.cadastrar(c);
				}
				
				if(opc == 2){
					System.out.println("CPF do criminoso.");
					int cpf = Integer.parseInt(EntradaUsuario.obterEntrada());
					
					fase1.remover(cpf);
				}
				
				if(opc == 3){
					fase1.listar();
				}
				
				if(opc == 4){
					System.out.println("Crime.");
					String crime = EntradaUsuario.obterEntrada();
					
					fase1.listarPorCrime(crime);
				}
				
				if(opc == 5){
					System.out.println("CPF do criminoso.");
					int cpf = Integer.parseInt(EntradaUsuario.obterEntrada());
					
					fase1.pesquisar(cpf);
				}
				
				else if(opc == 6){
					System.out.println("Programa encerrado!");
					System.exit(0);
				}
				
			}while(opc != 6);
			
	}
}
