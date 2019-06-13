package criacao.bike;

public class Bicileta {
	
	private String cor;
	private String material;
	private Freio freio;
	private Pedais pedais;
	private Rodas rodas;
	
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
	public Freio getFreio() {
		return freio;
	}
	public void setFreio(Freio freio) {
		this.freio = freio;
	}
	public Rodas getRodas() {
		return rodas;
	}
	public void setRodas(Rodas rodas) {
		this.rodas = rodas;
	}
	
	public void andar(){
		if(pedais.isFuncionando()){
			pedais.pedalar();
			freio.desativado();
			System.out.println("Bike em movimento!");
		}
		
		else{
			pedais.parar();
			freio.ativado();
			System.out.println("Bike parada!");
		}
	}
	
	
	

}
