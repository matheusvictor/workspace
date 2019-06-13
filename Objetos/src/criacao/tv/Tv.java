package criacao.tv;

public class Tv {
	
	private String marca;
	private double polegadas;
	private Controle controle;
		
	public void setMarca (String marca){
		this.marca = marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setPolegadas (double polegadas){
		this.polegadas = polegadas;
	}
	
	public double getPolegadas(){
		return polegadas;
	}
	
	public Controle getControle() {
		return controle;
	}

	public void setControle(Controle controle) {
		this.controle = controle;
	}
	
	//Estados da TV:
	
	private boolean ligada, desligada;

	public void ligada(){
		controle.ligar();
		this.ligada = true;
		System.out.println("TV ligada!");
	}
	
	public void desligada(){
		controle.desligar();
		System.out.println("TV desligada!");
	}
}