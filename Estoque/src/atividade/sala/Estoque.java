package atividade.sala;

public class Estoque {
	
	/**
	 * Escreva uma classe em Java chamada Estoque. Ela deverá possuir:

a) os atributos nomeProduto (String), quantidadeAtual (int) e quantidadeMinima (int).

b) um construtor sem parâmetros e um outro contendo os parâmetros nome, quantidadeAtual, e quantidadeMinima.

c) Os métodos de acesso (get/set)

d) os métodos com as seguintes assinaturas:

    public void mudarQtdMinima(int qtdMinima)
    public void repor(int qtd)
    public void darBaixa(int qtd)
    public String mostra()
    public boolean precisaRepor()
    
    Os atributos quantidadeAtual e quantidadeMinima jamais poderão ser negativos.
    O método repor aumenta quantidadeAtual de acordo com o parâmetro quantidade.
    O método darBaixa diminui quantidadeAtual de acordo com o parâmetro quantidade.
    O método mostra() retorna uma String contendo o nome do produto, sua quantidade mínima e sua quantidade atual
    O método precisaRepor retorna true caso a quantidade atual esteja menor ou igual à quantidade mínima e false, caso contrário.
	 */
	
	public boolean precisaRepor(){
		
		if(qntAtual < qntMinima){
			System.out.println("Precisa repor a quantidade de produtos.\n");
			return true;
		}
		
		else
			System.out.println("Nao precisa repor a quantidade de produtos.\n");
			return false;
	}

	 public String mostra(){
		return "Nome do produto: " + nomeProduto + "\nQnt Minima: " + qntMinima + "\nQnt Atual: " + qntAtual + "\n";
	} 
	 	
	public void darBaixa(int Qnt){
		
		if(qntAtual >= Qnt){
				qntAtual = qntAtual - Qnt;
				//precisaRepor(); //Ao dar baixa, verifica automaticamente se precisa repor
		}	
		
		else
			System.out.println("A quantidade que deseja dar baixar eh maior que o estoque atual.\n");
	}
	
	public void repor(int Qnt){
		qntAtual += Qnt;
	}
	
	public void mudarQntMinima(int quantidadeMinima){
		qntMinima = quantidadeMinima;
	}
	
	public Estoque(){
		this.nomeProduto = "Nao tem produto.";
		this.qntAtual = 0;
		this.qntMinima = 0;
	}
	
	public Estoque(String nomeProduto, int qntAtual, int qntMinima) {
		this.nomeProduto = nomeProduto;
		this.qntAtual = qntAtual;
		this.qntMinima = qntMinima;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQntAtual() { 
		return qntAtual;
	}
	public void setQntAtual(int qntAtual) {
		this.qntAtual = qntAtual;
	}
	public int getQntMinima() {
		return qntMinima;
	}
	public void setQntMinima(int qntMinima) {
		this.qntMinima = qntMinima;
	}
	
	private String nomeProduto;
	private int qntAtual;
	private int qntMinima;
}