package Estudos;

public class TesteVentilador {

	
	public static void main(String[] args) {
		
		aelice aelice = new aelice();
		
		aelice.setCor("Azul");
		
		motor motor = new motor();
		
		motor.setPotencia(5000);
		motor.setModelo("Aspire");
		
		Ventilador Ventilador = new Ventilador();
		Ventilador.setMotor(motor);
		Ventilador.setAelice(aelice);
		
		
		System.out.println("Caracteristicas do ventilador : ");
		System.out.println("Seu ventilador é modelo : "+motor.getModelo());
		System.out.println("Seu ventilado tem a potência: "+motor.getPotencia());
		System.out.println("Seu ventilado tem a cor: "+aelice.getCor());
		System.out.println(" ");
		System.out.println("Vamos ver ele funcionando agora ?");
		System.out.println(" ");
		
		
		
		motor.ligado();
		Ventilador.ligar();
		System.out.println(" ----------------------------------------------------------------------------");
		motor.desligado();
		Ventilador.ligar();
		
	}

}
