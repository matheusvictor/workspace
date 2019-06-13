package banco;

public class ContaCorrente extends Conta{
		
	public void atualizarSaldo(){
		this.saldo *= 1.07;
	}
	
	public boolean Sacar (double qnt){
		if(qnt <= this.limite){
			this.saldo += qnt;
			return true;			
		}
		return false;
	}
		
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	private double limite;
}
