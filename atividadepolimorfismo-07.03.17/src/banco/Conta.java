package banco;

public abstract class Conta {
	
	public abstract void atualizarSaldo(); //método abstrato
	
	public boolean Sacar (double qnt){
		this.saldo -= qnt;
		return true;
	}
	
	public boolean Depositar (double qnt){
		//double novoSaldo = 0;
		//novoSaldo = this.numero += qnt;
		this.saldo = this.saldo + qnt;
		return true;
	}
	
	public void exibirSaldo(){
		System.out.println(this.saldo);
	}
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + "]";
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	protected double saldo;
	private int numero;

}
