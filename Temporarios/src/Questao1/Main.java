package Questao1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opc;
		
		do{
			System.out.println("1- Cadastrar veiculo.");
			System.out.println("2- Cadastrar onibus.");
			System.out.println("3 - Cadastrar automovel.");
			System.out.println("4 - Sair do programa.");
			opc = sc.nextInt();
			
			if(opc == 4){
				System.out.println("\nPrograma encerrado!");
				System.exit(0);			
				
			}
			
			if(opc == 1){
				Veiculo v = new Veiculo();
				System.out.println("Digite a placa do veiculo.");
				v.setPlaca(sc.next());
				System.out.println("Digite a marca.");
				v.setMarca(sc.next());
				System.out.println("Digite a cor.");
				v.setCor(sc.next());
				System.out.println("Digite a quilometragem.");
				v.setQuilometragem(sc.nextFloat());
				System.out.println("Digite o status (true se alugado ou false caso não)");
				v.setStatus(sc.nextBoolean());
				System.out.println("--------------------------------------------");
				System.out.println("Veiculo cadastrado!");
				v.Alugado();
				System.out.println("\n--------------------------------------------");
			}
			
			if(opc == 2){
				Automovel a = new Automovel();
				System.out.println("Digite a placa do automovel.");
				a.setPlaca(sc.next());
				System.out.println("Digite a marca.");
				a.setMarca(sc.next());
				System.out.println("Digite a cor.");
				a.setCor(sc.next());
				System.out.println("Digite a quilometragem.");
				a.setQuilometragem(sc.nextFloat());
				System.out.println("Digite o status (true se alugado ou false caso não)");
				a.setStatus(sc.nextBoolean());
				System.out.println("--------------------------------------------");
				System.out.println("Veiculo cadastrado!");
				a.Alugado();
				System.out.println("\n--------------------------------------------");
			}
			
			if(opc == 3){
				Onibus o = new Onibus();
				System.out.println("Digite a placa do onibus.");
				o.setPlaca(sc.next());
				System.out.println("Digite a marca.");
				o.setMarca(sc.next());
				System.out.println("Digite a cor.");
				o.setCor(sc.next());
				System.out.println("Digite a quilometragem.");
				o.setQuilometragem(sc.nextFloat());
				System.out.println("Digite o status (true se alugado ou false caso não)");
				o.setStatus(sc.nextBoolean());
				System.out.println("--------------------------------------------");
				System.out.println("Veiculo cadastrado!");
				o.Alugado();
				System.out.println("\n--------------------------------------------");
			}
			
		}while(opc !=4);

	}

}
