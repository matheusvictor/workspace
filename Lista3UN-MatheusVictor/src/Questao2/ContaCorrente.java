package Questao2;

public class ContaCorrente extends Conta{
	
	public void AtualizarConta(double taxa){
		this.saldo += (saldo * (2*(taxa/100)));
	}
	public void Depositar(double valor){
		this.saldo += (valor - 0.1);
	}

}
