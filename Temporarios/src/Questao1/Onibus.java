package Questao1;

public class Onibus extends Veiculo{
	public void Alugado(){
		System.out.println("Qnt de pessoas: " + this.qntAssentos);
		System.out.println("Status (alugado): " + this.isStatus());
	}
	public int getQntAssentos() {
		return qntAssentos;
	}
	public void setQntAssentos(int qntAssentos) {
		this.qntAssentos = qntAssentos;
	}
	public int getAnosUso() {
		return anosUso;
	}
	public void setAnosUso(int anosUso) {
		this.anosUso = anosUso;
	}
	private int qntAssentos, anosUso;

}
