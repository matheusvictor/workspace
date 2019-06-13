package Avaliacao;

public class Funcionario {
	
	public double calculaGanhoAnual(){
		return (this.salario * 12);
	}
		
	public void recebeAumento (double aumento){
		this.salario += aumento;
		//this.salario = this.salario + aumento;
	}
	
	public String getNomeFuncionario(){
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario){
		this.nomeFuncionario = nomeFuncionario;
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
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	private String nomeFuncionario;
	private String departamento;
	private double salario;
	private String dataAdmissao;
	private String rg;

}
