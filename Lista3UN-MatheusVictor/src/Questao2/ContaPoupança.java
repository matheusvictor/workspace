package Questao2;

public class ContaPoupança extends Conta{
	
	public void AtualizarConta(double taxa){
		this.saldo += (saldo * (3*(taxa/100)));
	}


}
