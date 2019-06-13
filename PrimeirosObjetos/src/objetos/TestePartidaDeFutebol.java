package objetos;

public class TestePartidaDeFutebol {

	public static void main(String[] args) {
		PartidaDeFutebol f = new PartidaDeFutebol();
		
		f.time = "Barcelona";
		f.adversario = "Real Madrid";
		f.estagio = "Camp Nou";
		f.pais = "Espanha";
		f.tecnico1 = "Luis Enrique Martínez";
		f.tecnico2 = "Rafael Benítez";
		
		System.out.println("Time da casa: " + f.time);
		System.out.println("Tecnico: " + f.tecnico1);
		System.out.println("Time adversaio: " + f.adversario);
		System.out.println("Tecnico: " + f.tecnico2);
		System.out.println("Estagio: " + f.estagio);
		System.out.println("Pais: " + f.pais);

	}

}
