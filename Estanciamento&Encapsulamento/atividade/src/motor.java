
public class motor {

	private int potencia;
	private String marca;
	private boolean ligado;
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ligar()
	{
		System.out.println("Ligando o motor ...");
		this.ligado = true;
		System.out.println("Motor ligado !");
	}
	
	public void desligar()
	{
		System.out.println("Desligando o motor ...");
		this.ligado = false;
		System.out.println("Motor desligado!");
	}
	public boolean isLigado()
	{
	return ligado;	
	}
	
}
