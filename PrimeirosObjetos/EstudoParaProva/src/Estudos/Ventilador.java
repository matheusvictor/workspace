package Estudos;

public class Ventilador {

private aelice aelice;
private motor motor;

public aelice getAelice() {
	return aelice;
}
public void setAelice(aelice aelice) {
	this.aelice = aelice;
}
public motor getMotor() {
	return motor;
}
public void setMotor(motor motor) {
	this.motor = motor;
}

public  void ligar(){
	if(motor.isFuncionando()){
		System.out.println("Ventilador ligado !");
		aelice.ligar();
	
	}else{ System.out.println(" Ventilador desligado !");
	aelice.desligar();
	}

}}
