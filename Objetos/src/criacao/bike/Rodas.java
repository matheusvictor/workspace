package criacao.bike;

public class Rodas {

	private double aro;
	private String marca;
	private Pedais pedais;
	private Freio freio;
	private boolean rodando;
	
	public double getAro() {
		return aro;
	}
	public void setAro(double aro) {
		this.aro = aro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Pedais getPedais() {
		return pedais;
	}
	public void setPedais(Pedais pedais) {
		this.pedais = pedais;
	}
	public boolean isRodando() {
		return rodando;
	}
	public void setRodando(boolean rodando) {
		this.rodando = rodando;
	}
	public Freio getFreio() {
		return freio;
	}
	public void setFreio(Freio freio) {
		this.freio = freio;
	}

	public void girar(){
		if(pedais.isFuncionando()){
			pedais.pedalar();
			freio.desativado();
			System.out.println("Rodas em movimento!");
		}
		
		else{
			pedais.parar();
			freio.ativado();
			System.out.println("Rodas paradas!");
		}
	}
	
	
}

