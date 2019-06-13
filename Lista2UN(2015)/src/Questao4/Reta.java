package Questao4;

public class Reta {
	
	public Reta(Reta outraReta){
		
	}
	
	public boolean verificaPonto (Ponto p){
		if (p.getY() == (this.a * p.getX()) + this.b){ //Correnpondente a expressão y = ax + b
			return true;
		}
		else
			return false;
	}
	public Reta (double a, double b){
		this.a = a;
		this.b = b;
	}
	public Reta(Ponto p1, Ponto p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public Ponto getP1() {
		return p1;
	}
	public void setP1(Ponto p1) {
		this.p1 = p1;
	}
	public Ponto getP2() {
		return p2;
	}
	public void setP2(Ponto p2) {
		this.p2 = p2;
	}
	private double a;
	private double b;
	private Ponto p1;
	private Ponto p2;
}
