package EstudosIniciais;
import java.util.*;
public class EstruturaRepeticao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean sair = false;
		int opc = 0;
		
		while (!sair){
			System.out.println("--------------------");
			System.out.println("1 - Cadastrar numero");
			System.out.println("2 - Mostrar pares");
			System.out.println("3 - Mostrar impares");
			System.out.println("4 - Sair");
			opc = sc.nextInt();
			
			if (opc == 1){
				
			}
			
			else if (opc == 2){
				System.out.println("Numeros pares");
			}
			
			else if (opc == 3){
				System.out.println("Numeros impares");
			}
			
			else if (opc == 4){
				sair = true;
			}
		}
	}

}
