package Questao32;

public class Estado {
	
	public boolean equals(Estado outro){
		
		if(this.nomeEstado == outro.nomeEstado && this.capital == outro.capital)
			//Se o nome do estado e a capital forem iguais... 
			return true;
		
		else
			return false;
		
	}
	
	public void addFronteira(Estado outro){
		
		if(!this.equals(outro)){
		
		}
	
			
			for(int i = 0; i < fronteiras.length; i++){
				
				if(fronteiras[i]==null){
					fronteiras[i]=outro;
				}
				break;
		
				
			}
	}
	
	public Estado(String nomeEstado, String capital) {
		this.nomeEstado = nomeEstado;
		this.capital = capital;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	public void setFronteiras(Estado[] fronteiras) {
		this.fronteiras = fronteiras;
	}
	public String getNomeEstado() {
		return nomeEstado;
	}
	public String getCapital() {
		return capital;
	}
	public double getDimensao() {
		return dimensao;
	}
	public Estado[] getFronteiras() {
		return fronteiras;
	}

	private String nomeEstado;
	private String capital;
	private double dimensao;
	private Estado fronteiras[];	
}