package objetos;

public class TesteCasa {

	public static void main(String[] args) {
		Casa c = new Casa();
		
		c.comodos = 11;
		c.dono = "Fulano";
		c.cor = "Verde";
		c.portas = 15;
		c.andares = 2;
		
		System.out.println("Dono da casa: " + c.dono);
		System.out.println("Cor: " + c.cor);
		System.out.println("Quantidade de comodos: " + c.comodos);
		System.out.println("Quantidade de portas: " + c.portas);
		System.out.println("Quantidade de andares: " + c.andares);

	}

}
