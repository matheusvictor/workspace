package Questao32;

public class Pais {
	
	
	public Pais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	public Estado[] getEstados() {
		return estados;
	}
	public void setEstados(Estado[] estados) {
		this.estados = estados;
	}
	
	private String nomePais;
	private Estado[] estados = new Estado[27]; //21 estados no caso do BR

}
