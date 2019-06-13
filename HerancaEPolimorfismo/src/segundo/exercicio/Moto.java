package segundo.exercicio;

public class Moto extends Veiculo{

	public boolean Autorizada(){
		return true;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	private String estilo;

}

