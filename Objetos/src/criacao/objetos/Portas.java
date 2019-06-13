package criacao.objetos;

public class Portas {
	
	private String cor, material;

	//Atributos do objeto Portas:
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	//Funções que podem ser realizadas pelo objeto:
	
	private boolean aberta, fechada;
	
	public void abrir(){
		System.out.println("Abrindo as portas...");
		this.aberta = true;
		this.fechada = false;
		System.out.println("Portas abertas!");
	}

	public boolean isAberta() { 	//Como a variavel é booleana, o IS 'toma' o lugar do get
		return aberta;
	}
	
	public void fechar(){
		System.out.println("Fechando as portas...");
		this.aberta = false;
		this.fechada = true;
		System.out.println("Portas fechadas!");
	}
	
	public boolean isFechada(){
		return  fechada;
	}
	

}
