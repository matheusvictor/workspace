package Avaliacao;

public class Empresa {	
	
	public Empresa() {
		this.qntAtualFuncs = 0;
		this.funcionarios = new Funcionario[5];
	}
	
	public double despesaTotal(){
		double somaSalarios = 0;
		for(int i = 0; i < qntAtualFuncs; i ++){
			somaSalarios += this.funcionarios[i].calculaGanhoAnual();
		}
		return somaSalarios;
	}

	public int numeroFuncionarios(){
		return this.qntAtualFuncs;		
	}
	
	public void addFuncionario(Funcionario novo){
		this.funcionarios[this.qntAtualFuncs] = novo;
		this.qntAtualFuncs ++;
	}
	
	public void removerFuncionario(String rg){
		
		for(int i = 0; i < qntAtualFuncs; i++){
			if(this.funcionarios[i].getRg() == rg){
				this.funcionarios[i] = null;
			}
		}
		this.qntAtualFuncs --;
	}	
	
	public Funcionario getFuncionario(String rg){
		
		for(int i = 0; i < qntAtualFuncs; i++){
			if(this.funcionarios[i].getRg() == rg){
				return this.funcionarios[i];
			}
		}
		return null;
	}
	
	public Funcionario getFuncionario(int indice){
		return this.funcionarios[indice];
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	private String cnpj;
	private String nomeEmpresa;
	private Funcionario[] funcionarios;
	private int qntAtualFuncs;
}