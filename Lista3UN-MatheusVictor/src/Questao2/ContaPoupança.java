package Questao2;

public class ContaPoupanša extends Conta{
	
	public void AtualizarConta(double taxa){
		this.saldo += (saldo * (3*(taxa/100)));
	}


}
