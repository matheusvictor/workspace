package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	public void pesquisar(int cod) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getCodFuncionario() == cod) {
				System.out.println(funcionarios.get(i).toString());
			}
		}
	}

	public void listarSetor(String setor) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getSetor().equals(setor)) {
				System.out.println(funcionarios.get(i).toString());
			}
		}
	}

	public void listar() {
		System.out.println(funcionarios.toString());
	}

	public boolean remover(int cod) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getCodFuncionario() == cod) {
				funcionarios.remove(i);
				System.out.println("Funcionario removido!");
			}
		}
		return true;
	}

	public boolean cadastrar(Funcionario f) {
		return funcionarios.add(f);
	}

	public Empresa() {
		this.funcionarios = new ArrayList<Funcionario>();
	}

	private List<Funcionario> funcionarios;

}
