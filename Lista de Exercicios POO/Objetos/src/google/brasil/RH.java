package google.brasil;
import java.util.Scanner;

public class RH {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	
		Funcionario[] funcionarios = new Funcionario[2];
		
		for(int i = 0; i < funcionarios.length; i ++){
		
			Funcionario funcionario = new Funcionario();
			
			System.out.println("Digite o nome do funcionario: ");
			funcionario.setNome(sc.next());
			System.out.println("Digite o departamento do funcionario:");
			funcionario.setDepartamento(sc.next());
			System.out.println("Digite o salario do funcionario:");
			funcionario.setSalario(sc.nextDouble());
			
			 funcionarios[i] = funcionario;
		}
				
		Empresa empresa = new Empresa();
		
		empresa.setNome("Google Brasil");
		empresa.setFuncioraios(funcionarios);
			
		System.out.println("\nNome da empresa: " + empresa.getNome());
		System.out.println("Salario total da empresa: R$ " + empresa.calculoSalarioTotal());
		

	}

}
