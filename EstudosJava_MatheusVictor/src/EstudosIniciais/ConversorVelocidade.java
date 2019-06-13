package EstudosIniciais;
import java.util.*;
public class ConversorVelocidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int opc = 0;
		int continuar = 0;
		
		System.out.println("Executar o programa?");
		System.out.println("1- Sim");
		System.out.println("2- Nao");
		continuar = sc.nextInt();
		
		while ((continuar != 1) && (continuar != 2)){
			System.out.println("Erro! Tente novamente.");
			continuar = sc.nextInt();
		}
		
		if (continuar == 2){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		while (continuar == 1){
		System.out.println(" ");
		System.out.println("Deseja converter:");
		System.out.println("1- Km/h em m/s");
		System.out.println("2- M/s em Km/h");
		opc = sc.nextInt();
		
		while ((opc !=1) && (opc != 2)){
			System.out.println("Erro! Tente novamente.");
			opc = sc.nextInt();	
		}
		
		if (opc == 1){
			double km = 0;
			System.out.println("Digite quantos quilometros por hora deseja converter para metros por segundo.");
			km = sc.nextDouble();
			
			double ms = km * 3.6;
			
			System.out.println(km + " Km/h corresponde a:");
			System.out.println(Math.ceil(ms) + " m/s");
		}
		
		if (opc ==2){
			double ms = 0;
			System.out.println("Digite quantos metros por segundo deseja converter para quilometros por hora.");
			ms = sc.nextDouble();
			
			double km = ms / 3.6;
			
			System.out.println(ms + " m/s corresponde a:");
			System.out.println(Math.ceil(km) + " km/h");
		}
		}
	}

}
