package Questao8;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Pessoa mae = new Pessoa("Mainha");
		Pessoa pai = new Pessoa("Painho");
		
		Pessoa p1 = new Pessoa("Fulano");
		p1.setMae(mae);
		p1.setPai(pai);
		
		Pessoa p2 = new Pessoa("Fulano");
		p2.setMae(mae);
		p2.setPai(pai);

		Pessoa mae2 = new Pessoa("D. Fulana");
		Pessoa pai2 = new Pessoa("Sr. Beltrano");
		
		Pessoa p3 = new Pessoa("Alguem");
		p3.setMae(mae2);
		p3.setPai(pai2);
	
		
		if(p1.Comparacao(p3)){
			System.out.println("Sao iguais");
		}
		else{
			System.out.println("Sao diferentes");
		}
		
		if(p1.Irmas(p3)){
			System.out.println("Sao irmas");
		}
		else{
			System.out.println("Nao sao irmas");
		}
		
		if(p1.Antecessor(p3)){
			System.out.println("Sao antecessores");
		}
		else{
			System.out.println("Nao sao antecessores");
		}
		
		if(p1.Comparacao(p2)){
			System.out.println("Sao iguais");
		}
		else{
			System.out.println("Sao diferentes");
		}
		
		if(p1.Irmas(p2)){
			System.out.println("Sao irmas");
		}
		else{
			System.out.println("Nao sao irmas");
		}
		
		if(p1.Antecessor(p2)){
			System.out.println("Sao antecessores");
		}
		else{
			System.out.println("Nao sao antecessores");
		}
		
	}

}