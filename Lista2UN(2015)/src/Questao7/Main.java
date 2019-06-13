package Questao7;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Continente a = new Continente("America", 2);
		
		a.addPaises(new Pais("Brasil", 2000, 3000));
		a.addPaises(new Pais ("EUA", 4000, 5000));
		
		System.out.println("Pais com maior popula�ao: " + a.maiorPopulacao().getNome());
		System.out.println("Pais com menor popula�ao: " + a.menorPopulacao().getNome());
		System.out.println("Densidade populacional do continente: " + a.DensidadePopulacionalContinente() + "m�");
		System.out.println("Dimensao continental: " + a.dimensaoContinente() + "Km�");
		System.out.println("Popula��o continental: " + a.populacaoContinente() + " habs.");
		System.out.println("Razao terrirorial entre o maior e o o menor pais " + a.razaoTerritorial() + "Km�");

	}

}
