package Avaliacao;

public class Main {

	public static void main(String[] args) {
	
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		Funcionario f4 = new Funcionario();
		Funcionario f5 = new Funcionario();
		Empresa empresa = new Empresa();
		
		f1.setNomeFuncionario("Matheus");
		f1.setRg("123");
		f1.setDepartamento("Informatica");
		f1.setSalario(10);
		f1.recebeAumento(30);
		
		f2.setNomeFuncionario("Icaro");
		f2.setRg("999");
		f2.setDepartamento("Informatica");
		f2.setSalario(100);
		f1.recebeAumento(30);
		
		empresa.setNomeEmpresa("Google");
		empresa.setCnpj("000");
		
		empresa.addFuncionario(f1);
		empresa.addFuncionario(f2);
		System.out.println(" ");
		System.out.println("Numero de funcionarios: " + empresa.numeroFuncionarios());
		empresa.removerFuncionario("123");
		System.out.println(empresa.numeroFuncionarios());
		
	}

}
