package Questao2;

public class Conta {

	public void AtualizarConta(double taxa){
		this.saldo += (saldo * (taxa/100));
	}
	public void Depositar(double valor){
		this.saldo += valor;
	}
	public void Sacar(double valor){
		this.saldo -= valor;
	}
	public void VerificarSaldo(){
		this.saldo = saldo;
		System.out.println(this.saldo);
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	protected double saldo;
	
}
