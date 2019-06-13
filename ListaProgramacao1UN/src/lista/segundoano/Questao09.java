package lista.segundoano;
import java.util.*;
public class Questao09 {

	/**
	 * Faça a leitura do ano atual e do ano de nascimento de uma pessoa e exibir sua idade. A seguir,
informe se a pessoa é bebê (0 a 3 anos), criança (4 a 10 anos), adolescente (11 a 18 anos), adulta
(19 a 50 anos) ou idosa (51 anos em diante).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int anoatual[] = new int [1];
		int nascimento[] = new int[1];
		
		for (int i = 0; i < 1; i++){
		System.out.println("Informe o ano atual.");
		anoatual[i] = sc.nextInt();
		
		while (anoatual[i] < 0){
			System.out.println("Erro! Tente novamente.");
			anoatual[i] = sc.nextInt();
		}

		System.out.println("Informe o ano de seu nascimento.");
		nascimento[i] = sc.nextInt();
		
		while (nascimento[i] > anoatual[i] || nascimento[i] < 0){
			System.out.println("Erro! Tente novamente.");
			nascimento[i] = sc.nextInt();
		}
		
		int idade = (anoatual[i] - nascimento[i]);
		
		if (idade >= 0 && idade <= 3){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um bebe.");
		}
		
		else if (idade >=4 && idade <= 10){
			System.out.println("Idade: " + idade);
			System.out.println("Eh uma criança.");
		}
		
		else if (idade >= 11 && idade <= 18){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um adolescente.");
		}
		
		else if (idade >= 19 && idade <= 50){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um adulto.");
		}
		
		else if (idade >= 51){
			System.out.println("Idade: " + idade);
			System.out.println("Eh um idoso.");
		}
			}
		}
}