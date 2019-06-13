package Questao1;
import java.util.*;
public class MainTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Veterinario v = new Veterinario();
		Animal c = new Cachorro();
		Animal cav = new Cavalo();
		Animal p = new Preguiça();
		
		int opc;
		
		do{
			System.out.println("-------------------------------");
			System.out.println("Digite uma opçao:");
			System.out.println("1- Examinar cachorro");
			System.out.println("2- Examinar cavalo");
			System.out.println("3- Examinar bicho preguiça");
			System.out.println("4- Sair do programa");
			System.out.println("-------------------------------");
			opc = sc.nextInt();
			
			while(opc < 1 || opc > 4){
				System.out.println("Opçao invalida. Tente novamente!");
				opc = sc.nextInt();
			}
			
			if(opc == 4){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			if(opc == 1){
				v.Examinar(c);
			}
			if(opc == 2){
				v.Examinar(cav);
			}
			if(opc == 3){
				v.Examinar(p);
			}
			
		}while(opc != 4);

	}

}
