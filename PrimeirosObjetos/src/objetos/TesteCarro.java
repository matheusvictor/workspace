package objetos;
public class TesteCarro {

	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.ano = 1969;
		c.modelo = "Charger";
		c.marca = "Dodge";
		c.cor = "Azul";
		c.potencia = 160;
		
		System.out.println("Marca do automovel: " + c.marca);
		System.out.println("Modelo: " + c.modelo);
		System.out.println("Ano: " + c.ano);
		System.out.println("Cor do automovel: " + c.cor);
		System.out.println("Potencia: " + c.potencia + " Cv");
		
	}
	


}
