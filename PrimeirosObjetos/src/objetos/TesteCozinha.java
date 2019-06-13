package objetos;

public class TesteCozinha {

	public static void main(String[] args) {
		Cozinha c = new Cozinha();
		
		c.cor = "Preta e branca";
		c.tamanho = "1,80 x 2,70 m";
		c.aparelhos = 4;
		c.pias = 1;
		c.materialarmarios = "Aluminio";
		
		System.out.println("Tamanho: " + c.tamanho);
		System.out.println("Cor: " + c.cor);
		System.out.println("Quantidade de aprelhos eletrodomesticos: " + c.aparelhos);
		System.out.println("Quantidade de pias: " + c.pias);
		System.out.println("Material dos armarios: " + c.materialarmarios);
		

	}

}
