
public class cliente {

	private String nome;
	private String cpf;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString(){ //Metodo para converter um obj em texto e permitir a exibi��o, La na lista de Usuarios por exemplo.
		return "Nome:  " + nome + " CPF: " + cpf + " Idade: " + idade;
	}
}
