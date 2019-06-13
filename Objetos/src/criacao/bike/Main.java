package criacao.bike;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pedais pedais = new Pedais();
		
		pedais.setMaterial("Aluminio");
		
		Freio freio = new Freio();
		
		Rodas rodas = new Rodas();
		
		rodas.setAro(12);
		rodas.setFreio(freio);
		rodas.setMarca("Pirelli");
		
		Bicileta bike = new Bicileta();
		
		bike.setCor("Preta");
		bike.setFreio(freio);
		bike.setMaterial("Aluminio");
		bike.setRodas(rodas);
		
		pedais.pedalar();
		rodas.girar();
	}

}
