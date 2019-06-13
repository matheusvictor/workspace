package segundo.exercicio;

public class Carro extends Veiculo{
	
	public boolean Autorizada(){
		return false;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	private String marca;

}
