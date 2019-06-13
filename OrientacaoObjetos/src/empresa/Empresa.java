package empresa;

public class Empresa {
	
	public void addFuncionario(Funcionario f){
		int i = 0;
		
		for(i = 0; i < funcionarios.length; i ++){
			if(funcionarios[i] == null){
				funcionarios[i] = f;
				break;
			}
		}
		
		if(i == funcionarios.length) //Se o contador atingir o limite e nao houver local vazio no vetor...
			System.out.println("Sem vagas!");
	}
	
	
	public void demitirFuncionario(String rg){
		
		for(int i = 0; i < funcionarios.length; i ++){
			if(funcionarios[i] != null && funcionarios[i].getRg().equals(rg)){
				funcionarios[i] = null;
				break;
			}
		}
	}

	public Empresa(String nome, String cnpj, int qtnEmpregados) {
		this.nome = nome;
		this.cnpj = cnpj;
		funcionarios = new Funcionario[qtnEmpregados];
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
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
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;

}
