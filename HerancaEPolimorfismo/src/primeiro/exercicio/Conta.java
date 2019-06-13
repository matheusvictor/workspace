package primeiro.exercicio;

public class Conta {
	
	public void Bonus(double taxa){
		this.saldo += this.saldo * taxa;
	}
	public void Sacar(double valor){
		this.saldo -= valor;
	}
	public void Depositar(double valor){
		this.saldo += valor;
	}
	public double Extrato(){
		return saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	protected double saldo;
	private String usuario;
	private String numeroConta;

}
