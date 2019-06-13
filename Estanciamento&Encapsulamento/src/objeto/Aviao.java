package objeto;

public class Aviao {
	
	private int potencia, pilotos;
	private String empresa;
	
	public void setPotencia (int p){
		//Set = Atribui um valor
		this.potencia = p;
		//Ou seja, o valor deste atributo (potencia), será igual a um valor inteiro P
		//P sera atribuido
	}
	
	public void setPilotos (int pp){
		this.pilotos = pp;
	}
	
	public void setEmpresa (String e){
		this.empresa = e;
	}
	
	public int getPotencia(){
		//Get = Retorna um valor
		return potencia;
		//retornando o valor atribuido
			}
	
	public int getPilotos(){
		return pilotos;
	}
	
	public String getEmpresa(){
		return empresa;
	}
	
}