package Questao5;

public class Main {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		lamp.setVoltagem(220);
		lamp.setMarca("G-light");
		lamp.setPotencia(45);
		
		System.out.println("Marca da lampada: " + lamp.getMarca());
		System.out.println("Voltagem: " + lamp.getVoltagem() + " volts");
		System.out.println("Potencia: " + lamp.getPotencia() + " W\n");
		
		lamp.acessa();
		lamp.luzMedia();
		lamp.desligada();

	}

}
