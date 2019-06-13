package lavajato;

public class Criminoso {
	
	@Override
	public String toString() {
		return "###################\nDados do Criminoso: Cpf: " + cpf + "\nNome: " + nome + "\nCargo=" + cargo + ", \nCrime=" + crime + "\n#####################";
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCrime() {
		return crime;
	}
	public void setCrime(String crime) {
		this.crime = crime;
	}
		
	public Criminoso(int cpf, String nome, String cargo, String crime) {
		this.cpf = cpf;
		this.nome = nome;
		this.cargo = cargo;
		this.crime = crime;
	}

	private int cpf;
	private String nome, cargo, crime;

}
