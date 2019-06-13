package criacao.ventilador;


public class Motor {	
	
	private double potencia;
	private double voltagem;
	private boolean funcionando;
	
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
	public boolean isFuncionando() {
		return funcionando;
	}
	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
	public void on(){
		System.out.println("Ligando o motor...");
		this.funcionando = true;
		System.out.println("Motor funcionando!");
	}

	public void off(){
		System.out.println("Desligando o motor...");
		this.funcionando = false;
		System.out.println("Motor desligado!");
	}	
}