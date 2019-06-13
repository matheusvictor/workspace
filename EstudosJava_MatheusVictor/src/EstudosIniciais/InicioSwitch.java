package EstudosIniciais;
import java.util.*;
public class InicioSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//O comando (v.toUpperCase()); torna as letras maiuscula

				Scanner sc = new Scanner (System.in);
				
				char v;
				
				System.out.println("Usuario, digite uma vogal qualquer.");
				System.out.println("Obs.: Digite a letra minuscula.");
				v = sc.nextLine().charAt(0);
				sc.close();
				
				switch (v){
				
				case 'a': case 'A':
				System.out.println("Voce digitou a vogal: a ou A");
				break;
				
				case 'e':
				System.out.println("Voce digitou a vogal: e");
				break;
				
				case 'i':
				System.out.println("Voce digitou a vogal: i");
				break;
				
				case 'o':
				System.out.println("Voce digitou a vogal: o");
				break;

				case 'u':
				System.out.println("Voce digitou a vogal: u");
				break;
				
				default:
					System.out.println("A letra que voce digitou nao eh uma vogal.");
					System.out.println("Vc digitou:" + v);
				}
	}

}
