package Questao7;

public class Pais {
	
	public Pais() {

	}
	
	public Pais(String nome, float populacao, float dimensao) {
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPopulacao() {
		return populacao;
	}
	public void setPopulacao(float populacao) {
		this.populacao = populacao;
	}
	public float getDimensao() {
		return dimensao;
	}
	public void setDimensao(float dimensao) {
		this.dimensao = dimensao;
	}
	private String nome;
	private float populacao;
	private float dimensao;
}
