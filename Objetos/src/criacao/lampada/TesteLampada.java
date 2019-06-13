package criacao.lampada;

public class TesteLampada {

	public static void main(String[] args) {
	
		Interruptor inter = new Interruptor();
		
		inter.setMarca("Radil");
		inter.setMaterial("Plastico");
		
		Lampada lamp = new Lampada();
		
		lamp.setInterruptor(inter);
		lamp.setMarca("G-ligth");
		lamp.setPotencia(45);
		lamp.setTipo("Flourescente");

	
		lamp.acender();
		System.out.println(" ");
		lamp.apagar();
	}

}
