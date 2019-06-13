package UN2_ListaDeProgramacao2;

import java.util.*;
public class Distancia {

	/**
	 * Prorgrama criado para calcular a distancia entre os trechos AD.
	 * Detalhando AB, BC, CD.
	 */
			public static void main(String[] args) {
				
				Scanner sc = new Scanner (System.in);
				
				double vab, dab;
				double vbc, dbc;
				double vcd, dcd;
				
				System.out.println("Usuario, sou um programa que calcula a distancia, o tempo e a velocidade entre os trechos AD.");
				System.out.println(" ");
				System.out.println("O primeiro trecho deve passar por AB.");
				System.out.println("O segundo trecho deve passar por BC.");
				System.out.println("O terceiro trecho deve passar por CD.");
				System.out.println(" ");
				System.out.println("Pressione enter para continuar.");
				sc.nextLine();
				
				System.out.println("Trecho AB.");
				System.out.println("Veiculo: Barco.");
				System.out.println("Digite sua velocidade media nesse trecho. (Digite apenas numeros. Ex.: 250)");
				vab = sc.nextDouble();
				System.out.println("Digite a distancia entre os trechos(Digite apenas numeros. O mesmo devera ser em km):");
				dab = sc.nextDouble();
				double tab = vab * dab;
				System.out.println("Tempo gasto entre AB: " + tab + " h");
				
				System.out.println(" ");
				System.out.println("Trecho BC.");
				System.out.println("Veiculo: Carro.");
				System.out.println("Digite sua velocidade media nesse trecho. (Digite apenas numeros. Ex.: 100)");
				vbc = sc.nextDouble();
				System.out.println("Digite a distancia entre os trechos(Digite apenas numeros. O mesmo devera ser em km):");
				dbc = sc.nextDouble();
				double tbc = vbc * dbc;
				System.out.println("Tempo gasto entre BC: " + tbc + " h");
				
				System.out.println(" ");
				System.out.println("Trecho CD.");
				System.out.println("Veiculo: Aviao.");
				System.out.println("Digite sua velocidade media nesse trecho. (Digite apenas numeros. Ex.: 1000)");
				vcd = sc.nextDouble();
				System.out.println("Digite a distancia entre os trechos(Digite apenas numeros. O mesmo devera ser em km):");
				dcd = sc.nextDouble();
				
				double tcd = vcd * dcd;
				System.out.println("Tempo gasto entre AB: " + tcd + " h");
				
				System.out.println(" ");
				double dt = dab + dbc + dcd;
				System.out.println("Portanto, entre os trechos A e D...");
				System.out.println("A distancia  total (em km) eh : " + dt + " km");
				double tt = tab + tbc + tcd;
				System.out.println("O tempo total (em horas) eh: " + tt + " h");
				double vt = dt/tt;
				System.out.println("A velocidade media total eh (em km/h): " + vt + " km/h");
				
				System.out.println("Obs.: Se os valores forem dados em decimais, considere somente a primeira casa depois da virgula.");
				System.out.println(" ");
				System.out.println("Obrigado por utilizar o programa.");
						
			
			}

		}
