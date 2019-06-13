package Avaliacao.Resolucao.Sala;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[5];
		Empresa e = new Empresa();
		e.setNome("Google");
		e.setCnpj("1234");
		
		for (int i = 0; i < funcionarios.length; i ++){
			
			Funcionario f = new Funcionario();
	
			f.setNome("Matheus" + i);
			f.setDataAdmissao("26.10.15");
			f.setDepartamento("Informatica");
			f.setRg("00" + i);
			f.setSalario(10 + i);

			
			funcionarios[i] = f;
		}
		
		e.setFuncionarios(funcionarios); //Add os funcionarios criados à empresa
		
		//Aumentando o salario de tds os funcionarios da empresa
		for(int i = 0; i < funcionarios.length; i++){
			funcionarios[i].recebeAumento(i); 
		}
		
		e.demitirFuncionario("003");
		
		for(int i = 0; i < funcionarios.length; i++){
			
			Funcionario f = e.getFuncionarios()[i];		
				
			if(f != null){ //Se a posição do vetor n estiver vazia...
				System.out.println("\nNome: " + f.getNome());
				System.out.println("RG: " + f.getRg());
				System.out.println("Departamento: " + f.getDepartamento());
				System.out.println("Data de admissao: " + f.getDataAdmissao());
				System.out.println("Salario: R$ " + f.getSalario());
				System.out.println(" ");
			}
		}
		
		System.out.println("Despeza total da empresa: R$ " + e.despezaTotal());
			

	}

}
