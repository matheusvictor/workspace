package Questao1;

public class Automovel extends Veiculo{
	public void Alugado(){
		System.out.println("Qnt de pessoas: " + this.qntPessoas);
		System.out.println("Status (alugado): " + this.isStatus());
	}
	public int getQntPessoas() {
		return qntPessoas;
	}
	public void setQntPessoas(int qntPessoas) {
		this.qntPessoas = qntPessoas;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	private int qntPessoas;
	private double potencia;
}
