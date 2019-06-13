package objeto;

public class Carro {
	
	private String modelo, cor, marca;
	private int ano, potencia;

	//Atribuindo valoers 
	public void setModelo (String m){ 
		this.modelo = m;		
	}
	
	public void setCor (String c){
		this.cor = c;
	}
	
	public void setMarca (String mc){
		this.marca = mc;
	}
	
	public void setAno (int a){
		this.ano = a;
	}
	
	public void setPotencia (int p){
		this.potencia = p;
	}
	
	//Retornando valores
	public String getModelo(){
		return modelo;
	}
	
	public String getCor(){
		return cor;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public int getPotencia(){
		return potencia;
	}
	
	public int getAno(){
		return ano;
	}

}