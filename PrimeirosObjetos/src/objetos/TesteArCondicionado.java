package objetos;

public class TesteArCondicionado {

	public static void main(String[] args) {
		
		ArCondicionado a = new ArCondicionado();

		a.marca = "Comfee";
		a.consumo = 25.6;
		a.tensao = 220;
		a.material = "Metal e Plastico";
		a.peso = 22;
		
		System.out.println("Marca do ar condicionado: " + a.marca);
		System.out.println("Tensao: " + a.consumo + " Kw/h");
		System.out.println("Potencia: " + a.tensao+ " Volts");
		System.out.println("Material: " + a.material);
		System.out.println("Peso: " + a.peso + " Kg");

	}

}
