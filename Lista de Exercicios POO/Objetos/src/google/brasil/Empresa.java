package google.brasil;

public class Empresa {

	private String nome;
	private Funcionario funcionarios[];
	//private double calculoSalarioTotal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario[] getFuncioraios() {
		return funcionarios;
	}
	public void setFuncioraios(Funcionario[] funcioraios) {
		this.funcionarios = funcioraios;
	}
	public double calculoSalarioTotal(){
		double salarioTotal = 0;
		for (int i = 0; i < funcionarios.length; i ++){
			salarioTotal += funcionarios[i].getSalario();
			//O salario inicial de zero, sera sempre somado com o salario do funcionario na posicao i
		}
		return salarioTotal;
	}	
}
