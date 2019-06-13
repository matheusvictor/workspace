package mercado;

public class Main {

	public static void menu() {
		System.out.println("\nSelecione uma das opcoes:");
		System.out.println("#############################################");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Listar por marca.");
		System.out.println("5 - Sair");
		System.out.println("#############################################");
	}

	public static void main(String[] args) {
		Mercado m = new Mercado();
		int opc = 0;

		do {
			menu();
			opc = Integer.parseInt(EntradaUsuario.obterEntrada());

			if (opc == 1) {
				System.out.println("Nome");
				String nome = EntradaUsuario.obterEntrada().toUpperCase();
				System.out.println("Marca");
				String marca = EntradaUsuario.obterEntrada().toUpperCase();
				System.out.println("Cod.");
				int cod = Integer.parseInt(EntradaUsuario.obterEntrada());
				System.out.println("Peso.");
				int peso = Integer.parseInt(EntradaUsuario.obterEntrada());
				System.out.println("Preço.");
				int preco = Integer.parseInt(EntradaUsuario.obterEntrada());

				Produto p = new Produto();
				p.setCodigo(cod);
				p.setNome(nome);
				p.setMarca(marca);
				p.setPeso(peso);
				p.setPreco(preco);

				if (m.adicionar(p)) {
					System.out.println("Adicionado com sucesso!");
				} else {
					System.out.println("Erro ao cadastrar.");
				}
			}

			else if (opc == 2) {
				System.out.println("Digite o cod.");
				int cod = Integer.parseInt(EntradaUsuario.obterEntrada());

				m.remover(cod);
			}

			else if (opc == 3) {
				m.listar();
			}

			else if (opc == 4) {
				System.out.println("Digite a marca.");
				String marca = EntradaUsuario.obterEntrada().toUpperCase();

				m.listarMarca(marca);
			} else {
				System.out.println("Encerrado!");
				System.exit(0);
			}
		} while (opc != 5);

	}

}
