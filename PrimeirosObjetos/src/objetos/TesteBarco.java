package objetos;

public class TesteBarco {

	public static void main(String[] args) {
		Barco b = new Barco();
		
		b.nome = "Pescador de Ilusoes";
		b.material = "Fibra";
		b.tipo = "Canoa";
		b.capacidade = 5;
		b.uso = "Pesca";		
		
		System.out.println("Nome do barco: " + b.nome);
		System.out.println("Material: " + b.material);
		System.out.println("Tipo: " + b.tipo);
		System.out.println("Capacidade: " + b.capacidade + " pessoas");
		System.out.println("Uso comum: " + b.uso);

	}

}
