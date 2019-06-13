package primeiro.exercicio;

public class ContaPoupanca extends Conta {
	
	public void Bonus(double taxa){
		this.saldo += this.saldo * 3 * taxa;
		}
}
