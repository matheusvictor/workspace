package criacao.objetos;

public class Carro {
	
	
	//Atributos o objeto Carro
	private Portas portas[]; //Como ha varias portas, usando um vetor
	private Motor motor; //Como há apenas um motor no carro, n é necessario vetor
	private Rodas rodas[];
	
	public Portas[] getPortas() {
		return portas;
	}
	public void setPortas(Portas[] portas) {
		this.portas = portas;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Rodas[] getRodas() {
		return rodas;
	}
	public void setRodas(Rodas[] rodas) {
		this.rodas = rodas;
	}
	

	//Funções que podem ser realizadas por esse objeto:
	
	public void ligar(){
		System.out.println("Ligando o carro...");
		motor.ligar(); // Para o carro estar ligado, o motor precisa esta tambem ligado.
		System.out.println("Carro ligado!");
	}
	
	public void mover(){
		System.out.println("Movimentando o carro...");
		if (motor.isLigado()){ //O carro só pode estar em movimento se o motor estiver ligado
			for(int i = 0; i < rodas.length; i ++){ 
				rodas[i].girar(); //Se todas as rodas estiverem se movendo e o motor estiver ligado..
			}
			System.out.println("Carro em movimento!");
		}
	}
	
	public void desligar(){
		System.out.println("Desligando o carro...");
		motor.desligar(); 
		System.out.println("Carro desligado!");
	}
	
	public void parar(){
			System.out.println("Parando o carro...");
			if (motor.isDesligado()){
				for (int i = 0; i < rodas.length; i ++){
					rodas[i].frear();
				}
				System.out.println("Carro parado!");
			}
			
	}

}