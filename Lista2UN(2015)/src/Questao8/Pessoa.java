package Questao8;

public class Pessoa {

	public boolean Antecessor(Pessoa outro){	
		if (Comparacao(outro)){
			return true;
		}
		else
			return false;
	}
	
	public boolean Irmas(Pessoa outro){
		if(this.pai.equals(outro.getPai()) || this.mae.equals(outro.getMae())){
			return true;
		}
		else
			return false;
	}

	public boolean Comparacao(Pessoa outro){
		if(this.nome.equals(outro.getNome()) && this.mae.equals(outro.getMae())){
			return true;
		}
		else
			return false;
	}

	public Pessoa(String nome) {
		this.nome = nome;
		this.pai = null;
		this.mae = null;
	}
	
	public Pessoa(String nome, Pessoa pai, Pessoa mae) {
		this.nome = nome;
		this.pai = pai;
		this.mae = mae;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa getPai() {
		return pai;
	}
	public void setPai(Pessoa pai) {
		this.pai = pai;
	}
	public Pessoa getMae() {
		return mae;
	}
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}

	private String nome;
	private Pessoa pai;
	private Pessoa mae;
}