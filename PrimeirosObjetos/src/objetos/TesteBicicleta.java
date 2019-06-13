package objetos;

public class TesteBicicleta {

	public static void main(String[] args) {
		Bicicleta b = new Bicicleta();
		
		b.marca = "Caloi";
		b.marcapneu = "Pirelli";
		b.material = "Ferro";
		b.tamanhoaro = 20;
		b.cor = "Azul metalico";
		
		System.out.println("Marca da bicicleta: " + b.marca);
		System.out.println("Material: " + b.material);
		System.out.println("Cor: " + b.cor);
		System.out.println("Marca do pneu: " + b.marcapneu);
		System.out.println("Tamanho do aro: " + b.tamanhoaro);
		

	}

}
