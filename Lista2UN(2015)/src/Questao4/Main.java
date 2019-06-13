package Questao4;

public class Main {

	public static void main(String[] args) {
		
		Reta r = new Reta(3,2);
		
		Ponto p1 = new Ponto();
		p1.setX(5);
		p1.setY(4);
		
		Ponto p2 = new Ponto();
		p2.setX(8);
		p2.setY(3);
		
		Reta r2 = new Reta(p1, p2);
		
		System.out.println(r.verificaPonto(p1));
	}

}
