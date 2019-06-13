package UN2_ListaDeProgramacao2;

import java.util.*;

public class MinutosEmHoras {

	/**
	 * Programa criado para converter minutos em horas decimais.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double minutos;
		System.out.println("Digite o numero de minutos que deseja converter em horas. (Ex.: 140).");
		minutos = sc.nextDouble();

		double horas = minutos / 60;
		double h = horas % 60;
						
		System.out.println(minutos + " minuto (s) eh igual a: " + h + " hora (s).");
		

		
	
	

	}

}
