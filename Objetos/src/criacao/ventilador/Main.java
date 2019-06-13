package criacao.ventilador;

public class Main {

	public static void main(String[] args) {
		
		Motor motor = new Motor();
		
		motor.setPotencia(500);
		motor.setVoltagem(110);
	
		Helice helice = new Helice();
		
		Ventilador v = new Ventilador();
		v.setPotencia(500);
		v.setVoltagem(110);
		v.setMarca("Tabajara");
		v.setMotor(motor);
		v.setHelice(helice);
		
		System.out.println("Caracteristicas do ventilador : ");
		System.out.println("Seu ventilador tem a potência: " + motor.getPotencia() + "W");
		System.out.println("Seu ventilador eh da marca: " + v.getMarca());
		System.out.println("A voltagem do aparelho eh: " + v.getVoltagem() + "volts");
		System.out.println("\nVamos ver ele funcionando agora ?\n");
		
		motor.on();
		v.ligar();
		System.out.println(" ");
		motor.off();
		v.ligar();
		

	}

}
