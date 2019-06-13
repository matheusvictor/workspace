package atividade.sala;

public class Estoque {
	
	/**
	 * Escreva uma classe em Java chamada Estoque. Ela dever� possuir:

a) os atributos nomeProduto (String), quantidadeAtual (int) e quantidadeMinima (int).

b) um construtor sem par�metros e um outro contendo os par�metros nome, quantidadeAtual, e quantidadeMinima.

c) Os m�todos de acesso (get/set)

d) os m�todos com as seguintes assinaturas:

    public void mudarQtdMinima(int qtdMinima)
    public void repor(int qtd)
    public void darBaixa(int qtd)
    public String mostra()
    public boolean precisaRepor()
    
    Os atributos quantidadeAtual e quantidadeMinima jamais poder�o ser negativos.
    O m�todo repor aumenta quantidadeAtual de acordo com o par�metro quantidade.
    O m�todo darBaixa diminui quantidadeAtual de acordo com o par�metro quantidade.
    O m�todo mostra() retorna uma String contendo o nome do produto, sua quantidade m�nima e sua quantidade atual
    O m�todo precisaRepor retorna true caso a quantidade atual esteja menor ou igual � quantidade m�nima e false, caso contr�rio.
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