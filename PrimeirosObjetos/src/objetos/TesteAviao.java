package objetos;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao a = new Aviao();
		
		a.modelo = "Boeing 727";
		a.tipo = "Comercial";
		a.velocidade = 1102;
		a.numeropoltronas = 189;
		a.teto = 13000;
		
		
		System.out.println("Modelo do aviao: " + a.modelo);
		System.out.println("Tipo: " + a.tipo);
		System.out.println("Velocidade: " + a.velocidade + " Km/h");
		System.out.println("Numero de poltronas: " + a.numeropoltronas);
		System.out.println("Teto máximo: " + a.teto + " m");
	}

}
