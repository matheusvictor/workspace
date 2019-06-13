package Estudos;

public class aelice {

	private String cor;
	private boolean girando;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isGirando() {
		return girando;
	}
	public void setGirando(boolean girando) {
		this.girando = girando;
	}
	public void ligar(){
		
		System.out.println("Aelice girando ...");
		this.girando = true;
	}
	public void desligar(){
		System.out.println("Aelice parando ...");
		this.girando = false;
	}
	
	}

