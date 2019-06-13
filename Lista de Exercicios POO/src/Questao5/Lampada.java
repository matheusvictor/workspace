package Questao5;

public class Lampada {

	public boolean on;
	public boolean meiaLuz;
	
	public void luzMedia(){
		this.meiaLuz = true;
	}
	
	public void LuzMedia(){
		this.meiaLuz = false;
	}
	
	public boolean isMeiaLuz(){
		return meiaLuz;
	}
	
	public void acessa(){
		System.out.println("Lampada acessa!");
		this.on = true;
		if(meiaLuz = true){
			System.out.println("Lampada acessa a meia luz!");
		}
		
	}

	public void desligada(){
		System.out.println("lampada desligada!");
		this.on = false;
	}
	
	public boolean isAcessa(){
		return on;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	private String marca;
	private double voltagem;
	private double potencia;
}