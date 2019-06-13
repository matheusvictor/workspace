package criacao.bike;

public class Freio {
	
	private boolean frear;
	
	public void ativado(){
		System.out.println("Freando as rodas...");
		this.frear = true;
	}
	
	public boolean isAtivado(){
		return frear;
	}
	
	public void desativado(){
		this.frear = false;
	}
	
	public boolean isDesativado(){
		return frear;
	}

}
