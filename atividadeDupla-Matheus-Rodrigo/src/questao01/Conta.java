package questao01;

public class Conta {
	
	private int numero;
	private int agencia;
	private String senha;

	public Conta(int numero, int agencia, String senha) {
		this.numero = numero;
		this.agencia = agencia;
		this.senha = senha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
