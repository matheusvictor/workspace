package Estudos;

public class motor {

	private int potencia;
	private String modelo;
	private boolean funcionando;
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isFuncionando() {
		return funcionando;
	}
	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
	public void ligado(){
		System.out.println("Ligando motor ...");
		this.funcionando = true;
		System.out.println("Motor ligado !");
	}
	public void desligado(){
		System.out.println("Desligando motor ...");
		this.funcionando = false;
		System.out.println(" Motor desligado !");
	}
	
}
