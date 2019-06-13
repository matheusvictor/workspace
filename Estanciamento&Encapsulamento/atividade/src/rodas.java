
public class rodas {

	private String modelo;
	private double aro;
	private boolean girando;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getAro() {
		return aro;
	}
	public void setAro(double aro) {
		this.aro = aro;
	}
	
	public void girar()
	{
		System.out.println("Girando a roda ...");
		this.girando = true;
		System.out.println("Rodas girando!");
	}
	public void frear()
	{
		System.out.println("Freando a roda...");
		this.girando = false;
		System.out.println("Roda parada!");
	}

	public boolean isGirando()
	{
		return girando;
	}
}
