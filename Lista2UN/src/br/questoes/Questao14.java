package br.questoes;
import java.util.*;
public class Questao14 {

	/**
	 * Fa�a um Programa para uma loja de tintas. O programa dever� pedir o tamanho em metros quadrados da �rea a
ser pintada. Considere que a cobertura da tinta � de 1 litro para cada 6 metros quadrados e que a tinta � vendida em latas
de 18 litros, que custam R$ 80,00 ou em gal�es de 3,6 litros, que custam R$ 25,00.
o Informe ao usu�rio as quantidades de tinta a serem compradas e os respectivos pre�os em 3 situa��es:
o comprar apenas latas de 18 litros;
o comprar apenas gal�es de 3,6 litros;
o misturar latas e gal�es, de forma que o pre�o seja o menor. Acrescente 10% de folga e sempre arredonde os valores para
cima, isto �, considere latas cheias.
	 */
	public static void main(String[] args) {
		
		double area = 0;
		Scanner sc =  new Scanner (System.in);
		
		System.out.println("Seja bem-vindo(a) a loja de tintas Super Cor!");
		System.out.println("Tecle ENTER para continuar.");
		sc.nextLine();
		
		System.out.println("Digite o tamanho da area (em m�) que deseja pintar.");
		System.out.println("Obs.: Digite apenas numeros. O mesmo pode conter virgula.");
		area = sc.nextDouble();
		sc.close();
				
		double areaporlitro =  6 / 1;
		//Formula para o numero de area (m�) pintada por litro.
		
		double areaporlata = 18 * areaporlitro;
		//Area que cada lata cobre.
		double latasnecessarias = area / areaporlata;
		//Calculo para a quantidade de latas.
		double totalpagarlata = latasnecessarias * 80;
		
		double areaporgalao = 3.6 * areaporlitro;
		//Area que cada gal�o cobre.
		double galoesnecessarios = area / areaporgalao;
		//Calculo para a quantidade de latas.
		double totalpagargalao = galoesnecessarios * 25;
		
		System.out.println(" ");
		System.out.println("Tamanho da area a ser pintada: " + area + " m�");
		System.out.println(" ");
		
		System.out.println("Op�ao 1: ");
		System.out.println("Quantidade de latas necessarias: " + Math.ceil(latasnecessarias));
		//O comando Math.floor diminuiria a quantidade de latas necessarias ao inves de arrendondar para o maior.
		System.out.println("Total a pagar: R$ " + Math.ceil(totalpagarlata));
		System.out.println(" ");
		
		double latasgaloes = (galoesnecessarios + latasnecessarias)/area;
		double totallatasgaloes = (latasgaloes * 10)/100;
		
		System.out.println("Op�ao 3: ");
		System.out.println("Quantidade de latas e galoes necessarias: " + Math.ceil(latasgaloes));
		//O comando Math.floor diminuiria a quantidade de latas necessarias ao inves de arrendondar para o maior.
		System.out.println("Total a pagar: R$ " + Math.ceil(totallatasgaloes));
		

		
		System.out.println("Op�ao 2: ");
		System.out.println("Quantidade de galoes necessarios: " + Math.ceil(galoesnecessarios));
		//O comando Math.floor diminuiria a quantidade de latas necessarias ao inves de arrendondar para o maior.
		System.out.println("Total a pagar: R$ " + Math.ceil(totalpagargalao));
		System.out.println(" ");
	}
}