package objeto;

public class TesteCarro {
	public static void main(String[] args) {
		
		/** Carro c = new Carro();
		
		c.setMarca("Chevrolet");
		c.setModelo("Sedan");
		c.setCor("Prata");
		c.setAno(2014);
		c.setPotencia(110);
		
		System.out.println("Marca: " + c.getMarca());
		System.out.println("Modelo: " + c.getModelo());
		System.out.println("Cor: " + c.getCor());
		System.out.println("Ano: " + c.getAno());
		System.out.println("Potencia: " + c.getPotencia() + " cv");
*/
		Carro[] garagem = new Carro [5];
		
		for (int i = 0; i <  garagem.length; i ++){
			Carro c = new Carro();
			garagem[i] = c;
			
			c.setMarca("Ford");
			c.setModelo("K.A");
			c.setCor("Preto");
			c.setAno(2010);
		}
		
		for (int i = 0; i < garagem.length; i ++){
			System.out.println("\nMarca: " + garagem[i].getMarca());
			System.out.println("Modelo: " + garagem[i].getModelo());
			System.out.println("Cor: " + garagem[i].getCor());
			System.out.println("Ano: " + garagem[i].getAno());			
		}
	}

}
