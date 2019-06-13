package criacao.objetos;

public class TesteCarro {
	
	public static void main(String[] args) {
			
		Rodas[] roda = new Rodas [4]; //Definindo a quantidade de rodas
		
		for (int i = 0; i < roda.length; i ++){ //Definindo, atraves do FOR, as caracteristicas de todas as rodas
			
			Rodas rodas = new Rodas(); // Estanciando o objeto Rodas criado antes
					
			rodas.setAro (16); 
			rodas.setMarca("Pirelli");
			
			roda[i] = rodas; //Toda roda, na posicao i, tera as caractericas definidas em "rodas"
		}
		
		Portas[] porta = new Portas[2];
		
		for (int i = 0; i < porta.length; i ++){
			
			Portas portas = new Portas();
			
			portas.setCor("Preta");
			portas.setMaterial("Ferro");
			
			porta[i] = portas;
		}
		
		Motor motor = new Motor();
		
		motor.setMarca("Mercedes");
		motor.setPotencia(10000);

		
		Carro car = new Carro(); 
		
		car.setMotor(motor);
		car.setPortas(porta);
		car.setRodas(roda);
		
	//O carro criado tem todas os atributos ja criados, e todos esses atributos tem 
	//caracteristicas pre-definidas

		car.ligar();
		car.mover();
		
		System.out.println(" ");
		
		car.parar();
		car.desligar();
	
	}
}