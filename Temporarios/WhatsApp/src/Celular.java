
public class Celular extends Contato{
	private String operadora;
	private int posicaoGPS;
	public Celular(int numero, String operadora) {
		super(numero);
		this.operadora = operadora;
		// TODO Auto-generated constructor stub
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public int getPosicaoGPS() {
		return posicaoGPS;
	}
	public void setPosicaoGPS(int posicaoGPS) {
		this.posicaoGPS = posicaoGPS;
	}

}
