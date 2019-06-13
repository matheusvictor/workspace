package Avaliacao.Resolucao.Sala;

public class Empresa {
	
	public double despezaTotal(){
		
		double despesaEmpresa = 0;
		for(int i = 0; i < funcionarios.length; i ++){
			
			Funcionario f = funcionarios[i];
			
			if (f != null){ //Se o espaço do vetor nao tiver vazio e haver um funcionario f na posição...	
				despesaEmpresa += f.calculaGanhoAnual();
				//Soma os ganhos anuais de todos os funcionarios presentes na empresa
				//No caso de haver um espaço vazio, o salario do funcionario que havia antes sera desconsiderado
			}
		}
			return despesaEmpresa;
	}
	
	public void demitirFuncionario(String rg){ //O paramento para demissao sera o rg do funcionario
		for(int i = 0; i < funcionarios.length; i ++){
			
			Funcionario f = funcionarios[i]; //Atribuindo a cada funcionario do vetor f os mesmo atributos
											//da classe Funcionario
			if(f !=null && f.getRg().equals(rg)){
				//Se o funcionario f da posicao atual for diferente de nulo, ou seja, se o espaço do vetor nao estiver vazio
				//e o numero do rg deste funcionario for igual ao rg que recebe como paramento...
				
				funcionarios[i] = null; //Esvaziando o espaço do vetor = fUncionario demitido
			}
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;

}
