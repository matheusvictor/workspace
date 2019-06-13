package criacao.tv;

public class TesteTv {

	public static void main(String[] args) {
		
		Controle controle = new Controle();
		Tv tv = new Tv();
		
		controle.setMarca("LG");
		controle.setTv(tv);
		tv.setControle(controle);
		tv.setMarca("LG");
		tv.setPolegadas(21);
		
	
		//controle.ligar();
		tv.ligada();
		
		tv.desligada();
		
		
	}

}
