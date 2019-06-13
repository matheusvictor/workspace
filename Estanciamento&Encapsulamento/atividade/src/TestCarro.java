
public class TestCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rodas [] rodas = new rodas[4];
		for(int i = 0; i <4; i++){
			rodas roda = new rodas();
			roda.setAro(3);
			roda.setModelo("Pirelli");
		
			rodas[i] = roda;
		}
		Carro carro = new Carro();
		
		carro.setRodas(rodas);
		
		motor motor= new motor();
		
		motor.setMarca("Mercedes");
		motor.setPotencia(10000);
		
		porta[] portas = new porta[4];
		
		for(int i = 0; i<4 ; i ++){
			porta porta = new porta();
		
			porta.setCor("Preta");
			porta.setMaterial("Alumínio");
			
			portas[i] = porta;
		}
	
		Carro Carro = new Carro();
		
		Carro.setRodas(rodas);
		Carro.setMotor(motor);
		Carro.setPortas(portas);
		
		Carro.ligar();
		Carro.mover();
		
		System.out.println(" ");
		System.out.println(" ");
		
		motor.desligar();
		rodas[0].frear();
		rodas[1].frear();
		rodas[2].frear();
		rodas[3].frear();
		Carro.mover();
	}

}
