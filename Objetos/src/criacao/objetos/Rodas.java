package criacao.objetos;

public class Rodas {
	
	//Atributos do objeto Rodas:
	private String marca;
	private double aro;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getAro() {
		return aro;
	}
	public void setAro(double aro) {
		this.aro = aro;
	}
	
	//Funções que podem ser realizadas pelo objeto Rodas:
	
	private boolean girar, frear;
	
	public void girar(){
		System.out.println("Rodas girando...");
		this.girar = true;
		this.frear = false;
		System.out.println("Carro em movimento!");
	}
	
	public boolean isGirar() {
		return girar;
	}
	
	public void frear(){
		System.out.println("Rodas parando...");
		this.frear = true;
		this.girar = false;
		System.out.println("Carro parando!");
	}
	
	public boolean isFrear(){
		return frear;
	}

}