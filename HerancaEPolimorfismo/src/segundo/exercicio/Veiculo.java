package segundo.exercicio;

public class Veiculo {
	
	public boolean Autorizada(){
		return false;
	}
		
	public Veiculo() {
		this.placa = placa;
		this.cor = cor;
		this.dataApreensao = dataApreensao;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDataApreensao() {
		return dataApreensao;
	}
	public void setDataApreensao(String dataApreensao) {
		this.dataApreensao = dataApreensao;
	}
	public String getDataRetirado() {
		return dataRetirado;
	}
	public void setDataRetirado(String dataRetirado) {
		this.dataRetirado = dataRetirado;
	}
	public boolean isLibera() {
		return libera;
	}
	public void setLibera(boolean libera) {
		this.libera = libera;
	}

	private String placa;
	private String cor;
	private String dataApreensao;
	private String dataRetirado;
	protected boolean libera;
	

}
