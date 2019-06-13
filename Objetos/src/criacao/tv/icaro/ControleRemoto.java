package criacao.tv.icaro;

public class ControleRemoto {
	
	//Metodo construtor:
	public ControleRemoto (TV t){
		this.tv = t;
		this.marca = t.getMarca(); // A marca do controle eh sempre igual a marca da TV
	}
	
	//Metodos da classe:
	
	public void power(){
		if (this.tv.isLigado() == "Ligada")
			this.tv.setLigada(false);
		
		else
			this.tv.setLigada(true);
	}
	
	private String marca;
	private TV tv; //Um controle tem um TV especifica pra ligar

}
