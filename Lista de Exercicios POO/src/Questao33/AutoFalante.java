package Questao33;

public class AutoFalante {
	
	public boolean estaLigado;
		
	public void liga(){
		System.out.println("Ligando o Auto-falante...");
		this.ligado = true;
	}
	
	public void desliga(){
		System.out.println("Desligando o Auto-falante...");
		this.ligado = false;
	}

	public void estaLigado(){
		if(ligado = true){
			System.out.println("Auto falante ligado!");
		}
		
		else
			System.out.println("Auto-falante desligado!");
	}
	
	public boolean isLigado() {
		return ligado;
	}
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	private boolean ligado;
	private double potencia;
	private double volume;
}
