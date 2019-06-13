package EstudosIniciais;

import java.util.Scanner;

public class ExercicioSala2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int mes = 1;
		
		System.out.println("Usuario, digite o numero correspondente ao mes do ano.");
		mes = sc.nextInt();
		
		if (mes == 1 ){
			System.out.println("Janeiro");
		}
		
		if (mes == 2 ){
			System.out.println("Fevereiro");
		}
		
		if (mes == 3 ){
			System.out.println("Março");
		}
		
		if (mes == 4){
			System.out.println("Abril");
		}
		
		if (mes == 5){
			System.out.println("Maio");
		}
		
		if (mes == 6){
			System.out.println("Junho");
			
		if (mes == 7){
			System.out.println("Julho");
		}
		
		if (mes == 8){
			System.out.println("Agosto");
		}
		
		if (mes == 9){
			System.out.println("Setembro");
		}
	
		if (mes == 10){
			System.out.println("Outubro");
		}
		
		if (mes == 11){
			System.out.println("Novembro");
			
		if (mes == 12){
			System.out.println("Dezembro");
		}
		
					
	
}

		else {
			System.out.println("mes invalido");
		
		}
	
}
	}
}
