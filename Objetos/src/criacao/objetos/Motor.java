package criacao.objetos;

public class Motor {
	
	//Atributos do objeto Motor:
	private String marca;
	private double potencia;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	//Funções que podem ser realizadas pelo Motor:
	
	private boolean ligado, desligado;
	
	public void ligar(){
		System.out.println("Ligando o  motor...");
		this.ligado = true;
		System.out.println("Motor ligado!");
	}
	
	public boolean isLigado() {
		return ligado;
	}
	
	public void desligar(){
		System.out.println("Desligando o motor...");
		this.ligado = false;
		System.out.println("Motor desligado!");
	}
	
	public boolean isDesligado() {
		return desligado;
	}
}