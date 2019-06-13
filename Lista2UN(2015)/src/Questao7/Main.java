package Questao7;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Continente a = new Continente("America", 2);
		
		a.addPaises(new Pais("Brasil", 2000, 3000));
		a.addPaises(new Pais ("EUA", 4000, 5000));
		
		System.out.println("Pais com maior populaçao: " + a.maiorPopulacao().getNome());
		System.out.println("Pais com menor populaçao: " + a.menorPopulacao().getNome());
		System.out.println("Densidade populacional do continente: " + a.DensidadePopulacionalContinente() + "m²");
		System.out.println("Dimensao continental: " + a.dimensaoContinente() + "Km²");
		System.out.println("População continental: " + a.populacaoContinente() + " habs.");
		System.out.println("Razao terrirorial entre o maior e o o menor pais " + a.razaoTerritorial() + "Km²");

	}

}
