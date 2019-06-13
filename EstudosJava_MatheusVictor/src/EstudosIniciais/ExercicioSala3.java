package EstudosIniciais;

import java.util.*;

public class ExercicioSala3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		String mes;
		
		System.out.println("Digite o numero do mes correspondende ao mes");
		numero = sc.nextInt();
		
		sc.close();
		
		switch (numero) {
		case 1: mes = "Janeiro";
		case 2: mes = "Fevereiro";
		case 3: mes = "Março";
		case 4: mes = "Abril";
		case 5: mes = "Maio";
		case 6: mes = "Junho";
		case 7: mes = "Julho";
		case 8: mes = "Agosto";
		case 9: mes = "Setembro";
		case 10: mes = "Outubro";
		case 11: mes = "Novembro";
		case 12: mes = "Dezembro";
		break;
		
		default:
			System.out.println("Mes inexistente.");
		}

	}

}
