package criacao.lampada;

public class Interruptor {

	private String material, marca;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Funções que podem ser realizadas pelo Interruptor:
	
	private boolean ligado, desligado;
	
	public void ligar(){
		System.out.println("Ligando o interrutor...");
		this.ligado = true;
		this.desligado = false;
		System.out.println("Interruptor ligado!");
	}
	
	public boolean isLigado(){
		return ligado;
	}
	
	public void desligar(){
		System.out.println("Desligando o interruptor...");
		this.ligado = false;
		this.desligado = true;
		System.out.println("Interruptor desligado!");
	}
	
	public boolean isDesligado(){
		return desligado;
	}
}
