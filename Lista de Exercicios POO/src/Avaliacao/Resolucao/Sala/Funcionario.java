package Avaliacao.Resolucao.Sala;

public class Funcionario {

	public double calculaGanhoAnual(){
		//o Calucla retornara um valor, por isso nao pode ser void...
		//o valor retornado sera o salario (com ou sem aumento) vezes o nº de meses
		return this.salario * 12;
	}
	public void recebeAumento(double aumento){
		//this.salario += aumento;
		this.salario = this.salario + aumento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	private String nome;
	private String departamento;
	private String rg;
	private String dataAdmissao;
	private double salario;
}
