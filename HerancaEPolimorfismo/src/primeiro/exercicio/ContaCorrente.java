package primeiro.exercicio;

public class ContaCorrente extends Conta {

	public void Bonus(double taxa){
		this.saldo += this.saldo * 2 * taxa;
		}
	public void Depositar(double valor){
		this.saldo += valor - 0.10;
	}
}
