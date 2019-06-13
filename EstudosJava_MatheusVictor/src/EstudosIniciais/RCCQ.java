package EstudosIniciais;
import java.util.*;
public class RCCQ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double altura, peso, cintura, quadril, abdomen;
		
		System.out.println("Ola, usuario. Sou um programa criado para calcular, inicialmente, o Indice de Massa Corporal (IMC) de uma pessoa.");
		System.out.println("O IMC eh calculado atraves da razao entre peso divido por altura ao quadrado e serve para indicar o nivel de obesidade.");
		System.out.println(" ");
		System.out.println("Pressione enter para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o seu peso (em Kg).");
		peso = sc.nextDouble();
		
		System.out.println("Digite a sua altura.");
		altura = sc.nextDouble();
		
		double IMC = peso / (altura*altura);
		
		System.out.println(" ");
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + IMC);
		
		if (IMC < 18.5){
			System.out.println("Voce esta abaixo do peso!");
		}
		
		if ((IMC == 18.5) && (IMC < 24.9)){
			System.out.println("Voce esta com peso normal!");
	}

}

}