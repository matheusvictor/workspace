
public class Carro {
	private porta portas[];
	private motor motor;
	private rodas rodas[];
	public porta[] getPortas() {
		return portas;
	}
	public void setPortas(porta[] portas) {
		this.portas = portas;
	}
	public motor getMotor() {
		return motor;
	}
	public void setMotor(motor motor) {
		this.motor = motor;
	}
	
	public rodas[] getRodas() {
		return rodas;
	}
	public void setRodas(rodas[] rodas) {
		this.rodas = rodas;
	}
	public void ligar()
	{
		System.out.println("Ligando o carro ...");
		motor.ligar();
		System.out.println("Carro ligando!");
	}
	
	public void mover()
	{
		
		if(motor.isLigado()){
			System.out.println("Movimentando o carro ...");
			for(int i = 0; i < rodas.length; i++)
			{
			rodas[i].girar();
			
			}
		
		
		
			
		}else{
			System.out.println("Parando o carro ...");
		System.out.println("Carro parado!");System.exit(0);
		
		}
		System.out.println("Carro movendo" +"!");
	}
	

}

