package criacao.ventilador;

public class Ventilador {

	//Atributos
	private String marca;
	private double potencia;
	private double voltagem;
	private Motor motor;
	private Helice helice;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Helice getHelice() {
		return helice;
	}
	public void setHelice(Helice helice) {
		this.helice = helice;
	}

	public void ligar(){
		if(motor.isFuncionando()){
			helice.ligar();
			System.out.println("Ventilador ligado!");
		}
		
		else{
			helice.desligar();
			System.out.println("Ventilador desligado!");
		}
	}
	
	
	

	


	

	
}
