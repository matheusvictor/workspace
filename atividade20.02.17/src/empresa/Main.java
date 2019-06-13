package empresa;

public class Main {

	public static void menu() {
		System.out.println("#######################");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Listar por setor");
		System.out.println("5 - Pesquisar");
		System.out.println("6 - Sair");
		System.out.println("#######################");
	}

	public static void main(String[] args) {

		Empresa e = new Empresa();
		int opcao = 0;

		do {
			menu();
			System.out.println("Digite uma opc.");
			opcao = Integer.parseInt(EntradaUsuario.obterEntrada());

			// while....
			if (opcao == 1) {
				System.out.println("Nome.");
				String nome = EntradaUsuario.obterEntrada();
				System.out.println("setor.");
				String setor = EntradaUsuario.obterEntrada();
				System.out.println("Cod.");
				int cod = Integer.parseInt(EntradaUsuario.obterEntrada());

				Funcionario f = new Funcionario();
				f.setNomeFuncionario(nome);
				f.setCodFuncionario(cod);
				f.setSetor(setor);
				
				e.cadastrar(f);
			}
			
			else if(opcao == 2){
				System.out.print("Digite o cod.");
				int cod = Integer.parseInt(EntradaUsuario.obterEntrada());
				
				e.remover(cod);
			}
			
			else if(opcao == 3){
				e.listar();
			}
			
			else if(opcao == 4){
				System.out.println("Digite o setor.");
				String setor = EntradaUsuario.obterEntrada();
				
				e.listarSetor(setor);
			}
			
			else if(opcao == 5){
				System.out.print("Digite o cod.");
				int cod = Integer.parseInt(EntradaUsuario.obterEntrada());
				
				e.pesquisar(cod);
			}
			
			else{
				System.out.println("Encerrado.");
				System.exit(0);
			}

		} while (opcao != 6);

	}

}
