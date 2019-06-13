package criacao.tv;

public class Controle {
	
	//Metodos: executa uma ação
	
	public void ligar(){
		System.out.println("Ligando a TV...");
		this.ligar = true;
		this.desligar = false;
	}
	
	public boolean isLigar(){
		return ligar;
	}
	
	public void desligar(){
		System.out.println("Desligando a TV...");
		this.ligar = false;
		this.desligar = true;
	}
	
	public boolean isDesligar(){
		return desligar;
	}
	
	//
	
	public Tv getTv() {
		return tv;
	}

	public void setTv(Tv tv) {
		this.tv = tv;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Atributos: define uma propriedade!
	
	private String marca;
	private Tv tv;
	private boolean ligar; 
	private boolean desligar;
	
	

	
	
}
