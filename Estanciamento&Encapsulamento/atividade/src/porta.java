
public class porta {

	private String cor;
	private String material;
	private boolean aberta;

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
	
	public void abrir()
	{
	
	System.out.println("Abrindo a porta ..");
	this.aberta = true;
	System.out.println("porta aberta!");
	}
	public void fechar()
	{
	System.out.println("fechando a porta ..");
	this.aberta = false;
	System.out.println("porta fechada!");
		
	}
	public boolean isAberta()
	{
		return aberta;
	}
}
