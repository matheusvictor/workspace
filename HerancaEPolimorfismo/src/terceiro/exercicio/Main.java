package terceiro.exercicio;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Veterinario v = new Veterinario();
		Animal a = new Cachorro();
		Animal a2 = new Cavalo();
		
		int opc;
		
		do{
			System.out.println("\nQual animal deseja examinar?");
			System.out.println("1- Cachorro");
			System.out.println("2- Cavalo");
			opc = sc.nextInt();
			
			if(opc == 3){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			
			if(opc == 1){
				System.out.println("Animal examinado: Cachorro.");
				System.out.println("Digite o nome do animal.");
				a.setNome(sc.next());
				System.out.println("Digite a idade (em anos) do animal.");
				a.setIdade(sc.nextInt());
				System.out.println("Examinando..");
				v.Examinar(a);
				System.out.println("\nAnimal examinado.");
				System.out.println("Nome do animal: " + a.getNome());
				System.out.println("Idade do animal: " + a.getIdade());
				System.out.println("Açao do animal: ");
				a.Acao();
				System.exit(0);
			}
			
			if(opc == 2){
				System.out.println("Animal examinado: Cavalo.");
				System.out.println("Digite o nome do animal.");
				a2.setNome(sc.next());
				System.out.println("Digite a idade (em anos) do animal.");
				a2.setIdade(sc.nextInt());
				System.out.println("Examinando..");
				v.Examinar(a2);
				System.out.println("\nAnimal examinado.");
				System.out.println("Nome do animal: " + a2.getNome());
				System.out.println("Idade do animal: " + a2.getIdade());
				System.out.println("Açao do animal: " + a2.getAçao());
				System.exit(0);
			}
	
		}while(opc != 3);
				
	

	}

}
