package Questao6;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		Pais p1 = new Pais("BRA", "Brasil", 8515767);
		Pais p2 = new Pais ("BOL", "Bolivia", 10426160);
		Pais p3 = new Pais ("ARG", "Argentina", 41281631);
		Pais p4 = new Pais("BRA", "Brasil", 8515767);

		if(p1.Comparacao(p2)){
			System.out.println("Paises iguais");
		}
		else
			System.out.println("Paises diferentes");
		
		if(p1.Comparacao(p4)){
			System.out.println("Paises iguais");
		}
		else
			System.out.println("Paises diferentes");

	}

}
