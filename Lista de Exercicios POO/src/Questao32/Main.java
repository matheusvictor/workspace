package Questao32;

public class Main {

	public static void main(String[] args) {
		
		Pais brasil = new Pais ("Brasil");
		
		Estado[] estados = new Estado[27];
		
		Estado e1 = new Estado("Bahia", "Salvador");
		Estado e2 = new Estado ("Alagoas", "Maceió");
		
		brasil.setEstados(estados);
		
		estados[0] = e1;
		
		e1.setDimensao(564.733);
		e1.addFronteira(e2);
		
		if(e1.equals(e2)){
			System.out.println("Estados iguais!");
		}
		
		else
			System.out.println("Estados diferentes!");
		
		System.out.println("Estado: " + e1.getNomeEstado());
		System.out.println("Capital: " + e1.getCapital());
		System.out.println("Dimensão: " + e1.getDimensao() + " km²");
		System.out.println("Fronteiras: " + e1.getFronteiras());

	}

}
