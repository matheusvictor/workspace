package UN2_ListaDeProgramacao2;
import java.util.*;
public class LojaDeTintas {

	/**
	 * Fa�a um programa para uma loja de tintas. O programa dever� pedir o tamanho em metros quadrados da �rea a
ser pintada. Considere que a cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a tinta � vendida em latas
de 18 litros, que custam R$ 80,00. Informe ao usu�rio a quantidades de latas de tinta a serem compradas e o pre�o total.
	 */
	public static void main(String[] args) {
		
		double area, litros = 0;
		int opc = 0;
		
		Scanner sc = new Scanner (System.in);		
		
		System.out.println("Ola, usuario. Sou um programa feito para calcular o quanto de tinta ser� necessario para pintar determinada area, em metros quadrados (m�).");
		System.out.println("Sabe-se que cada lata possui 18 L, e cada a cada 1 L sao pintados 3 m� de area.");
		System.out.println(" ");
		System.out.println("Digite 0 (zero) para continuar.");
		opc = sc.nextInt();
		
		while (opc == 0){
			
		System.out.println(" ");
		System.out.println("Digite o tamanho da area (m�) a ser pintada.");
		System.out.println("Obs.: Digite apenas numeros.");
		area = sc.nextDouble();
		
		double areaporlitro =  3;
		//Formula para o numero de area (m�) pintada por litro.
		double areaporlata = 18 * areaporlitro;
		//Area que cada cobre.
		double latasnecessarias = area / areaporlata;
		//Calculo para a quantidade de latas.
		double totalpagar = latasnecessarias * 80.0;
		
		System.out.println(" ");
		System.out.println("Area a ser pintada: " + area + " m�");
		System.out.println("Latas necessarias: " + Math.ceil(latasnecessarias));
		//System.out.println("Quantidade necessaria de latas: " + Math.floor(latasnecessarias)); --> O floor seria para converter inteiros em decimais.
		System.out.printf("Total a pagar: " + Math.ceil(totalpagar));
		System.out.println("Obs.: Cada lata de tinta custa R$ 80,00.");
		
		System.out.println(" ");
		System.out.println("Para continuar usando o programa, digite 0 (zero). Para sair, digite 1 (um).");
		opc = sc.nextInt();
		
		if (opc != 0){
			System.out.println("Programa encerrado!");
		}
		
		}

	}

}
