package criacao.lampada;

public class Lampada {
	
	private double potencia;
	private String marca, tipo;
	private Interruptor interruptor; // OU seja, a lampada, alem dos atributos, possui um interruptor
	
	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Interruptor getInterruptor() {
		return interruptor;
	}

	public void setInterruptor(Interruptor interruptor) {
		this.interruptor = interruptor;
	}

	public void acender(){
		System.out.println("Acendendo a lampada...");
		interruptor.ligar();
		System.out.println("Lampada acessa!");
	}
	
	public void apagar(){
		System.out.println("Desligando a lampada...");
		interruptor.desligar();
		System.out.println("Lampada desligada!");
	}

	
}
