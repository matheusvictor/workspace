package empresa;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Empresa e = new Empresa("Google", "123", 3);
		Funcionario f = new Funcionario();

		int opc;		

		do{
			System.out.println("\nDigite a opçao desejada:\n");
			System.out.println("1- Adicionar funcionario a empresa.");
			System.out.println("2 - Demitir funcionario.");
			System.out.println("3- Listar funcionarios.");
			System.out.println("4 - Sair do programa.");
			opc = sc.nextInt();
			
			while (opc > 4 || opc < 1){
				System.out.println("\nError!\n");
				System.out.println("Digite a opçao desejada:");
				System.out.println("1- Adicionar funcionario a empresa.");
				System.out.println("2 - Demitir funcionario.");
				System.out.println("3- Listar funcionarios.");
				System.out.println("4 - Sair do programa.");
				opc = sc.nextInt();
			}
			
			if(opc == 1){
				e.addFuncionario(f);
				System.out.println("Digite o nome do funcionario.");
				f.setNome(sc.next());
				System.out.println("Digite o RG do funcionario.");
				f.setRg(sc.next());
				System.out.println("Digite o departamento do funcionario.");
				f.setDepartamento(sc.next());
				System.out.println("Digite o salario do funcionario.\n");
				f.setSalario(sc.nextDouble());
			}
			
			if (opc == 2){
				System.out.println("Digite o RG do funcionario que deseja demitir.");
				f.setRg(sc.next());
				e.demitirFuncionario(f.getRg());
				System.out.println("Fundionario dadad");
			}
			
			if (opc == 3){
		
				
			}
				
			if (opc == 4){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}

			
			
			
			} while(opc > 1 || opc < 4);	

			
			}
			
	}