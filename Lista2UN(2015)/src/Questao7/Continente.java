package Questao7;

public class Continente {
	
	public float razaoTerritorial(){
		float razao = this.maiorDimensao().getDimensao()/this.menorDimensao().getDimensao();
		return razao;
	}
	
	public Pais menorPopulacao(){
		Pais pMenorPop = paises[0];
		for(int i = 1; i < paises.length; i ++){
			if(paises[i].getPopulacao() < pMenorPop.getPopulacao()){
				pMenorPop = paises[i];
			}
		}
			return pMenorPop;
	}
	
	public Pais maiorPopulacao(){
		Pais pMaiorPop = paises[0];
		for(int i = 1; i < paises.length; i ++){
			if(paises[i].getPopulacao() > pMaiorPop.getPopulacao()){
				pMaiorPop = paises[i];
			}
		}
			return pMaiorPop;
	}
	
	public Pais menorDimensao(){
		Pais pMenor = paises[0];
		for(int i = 1; i < paises.length; i ++){
			if(paises[i].getDimensao() < pMenor.getDimensao()){
				pMenor = paises[i];
			}
		}
			return pMenor;
	}
	
	public Pais maiorDimensao(){
		Pais pMaior = paises[0];
		for(int i = 1; i < paises.length; i ++){
			if(paises[i].getDimensao() > pMaior.getDimensao()){
				pMaior = paises[i];
			}
		}
			return pMaior;
	}
	
	
	
	public float DensidadePopulacionalContinente (){
		float densidade = this.populacaoContinente()/this.dimensaoContinente();
		return densidade;
	}
	
	public float populacaoContinente(){
		float populacao = 0;
		for(int i = 0; i < paises.length; i ++){
			populacao += paises[i].getPopulacao();
		}
		return populacao;
	}
	
	public float dimensaoContinente(){
		float dimensao = 0;
		for(int i = 0; i < paises.length; i ++){
			dimensao += paises[i].getDimensao();	
		}
		return dimensao;
	}
	
	public void addPaises(Pais novo){
		this.paises[this.qntPaises] = novo;
		this.qntPaises ++;
	}
	
	public int numeroPaises(){
		return this.qntPaises;		
	}
	
	public Continente(String nome, int qntPaises) { // COnstrutor
		this.nome = nome;
		this.qntPaises = 0;
		this.paises = new Pais[qntPaises];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais[] getPaises() {
		return paises;
	}

	public void setPaises(Pais[] paises) {
		this.paises = paises;
	}

	public int getQntPaises() {
		return qntPaises;
	}

	public void setQntPaises(int qntPaises) {
		this.qntPaises = qntPaises;
	}
	
	private String nome;
	private Pais[] paises;
	private int qntPaises;
}