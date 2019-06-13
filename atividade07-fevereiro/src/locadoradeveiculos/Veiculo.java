package locadoradeveiculos;

public class Veiculo {

	public Veiculo(int numeroChassi, String cor, String marca, String placa){
		this.cor = cor;
		this.marca = marca;
		this.numeroChassi = numeroChassi;
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumeroChassi() {
		return numeroChassi;
	}
	public void setNumeroChassi(int numeroChassi) {
		this.numeroChassi = numeroChassi;
	}
	private String cor, placa, marca;
	private int numeroChassi;

}
