package empresa;

public class Funcionario {
		
	public Funcionario() {
		this.nome = nome;
		this.rg = rg;
	}
	public double calculaGanhoAnual(){
		double ganhoAnual = 0;
		ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}
	public void recebeAumento(double aumento){
		this.salario += aumento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	private String nome;
	private String rg;
	private String departamento;
	private double salario;

}
