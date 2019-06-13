package matricula;

public class Main {

	public static void menu(){
		System.out.println("Selecione uma das opcoes:");
		System.out.println("#############################################");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Listar por professor.");
		System.out.println("5 - Sair");
		System.out.println("#############################################");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matricula m = new Matricula();
		int opc;
		
		do{
			menu();
			opc = Integer.parseInt(EntradaUsuario.obterEntrada());
			
			while(opc < 1 || opc > 5){
				System.out.println("Opcao invalida. Digite novamente.");
				opc = Integer.parseInt(EntradaUsuario.obterEntrada());
			}
			
			if(opc == 1){
				System.out.println("Cod. da disciplina.");
				int cod = Integer.parseInt(EntradaUsuario.obterEntrada());
				System.out.println("Nome da disciplina.");
				String nomeDisciplina = EntradaUsuario.obterEntrada();
				System.out.println("Carga horaria.");
				int cargaHoraria = Integer.parseInt(EntradaUsuario.obterEntrada());
				System.out.println("Nome do professor.");
				String professor = EntradaUsuario.obterEntrada();
				
				Disciplina d = new Disciplina();
				if(m.adicionar(d)){
					System.out.println("Cadastrado com sucesso!");
				} else{
					System.out.println("Problemas ao cadastrar.");
				}
			}
			
			else if(opc == 2){
				
			}
			
			else if(opc ==3){
				m.listarTodas();
			}
			
			else if(opc == 4){
				
			}
			else{
				System.out.println("Encerrado!");
				System.exit(0);
			}
		}while(opc != 5);
		
		

	}

}
