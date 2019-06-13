package criacao.tv.icaro;

public class TV {

	//Metodo construtor:
	public TV (String identidade){
		this.id = identidade;
		this.cor = "Branca";
		this.marca = "Icaro's TV";
		this.polegadas = 32;
		this.ligada = false;
	}

	public TV (String identidade, String marca, String cor, double polegadas){
		this.id = identidade; 
		this.cor = cor;
		this.marca = marca;
		this.polegadas = polegadas;
		this.ligada = false;
	}
	
	//Metodos da classe (especificos):
	
	public String isLigado(){
		if (this.ligada){
			return "Ligada";		
		}
		else {
			return "Desligada";	
		}
	}
	
	//Metodos acessores:
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}
	public String getId() {
		return id;
	}
	
	public void setLigada(boolean ligada){
		this.ligada = ligada;
	}

	//Atributos
	private String id;
	private String marca;
	private String cor;
	private double polegadas;
	private boolean ligada;
}
