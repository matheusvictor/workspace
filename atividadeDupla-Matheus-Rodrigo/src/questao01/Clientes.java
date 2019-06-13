package questao01;

public class Clientes {
	
	private String nome;
	private int anoNascimento;
	private String CPF;
	private String telefone;
	private Conta [] contas;
	
	public void listar(){
		boolean flag = false;
		for(int i = 0; i < contas.length; i++){	
			if(contas[i] != null){
				flag = true;
				System.out.println("####################################");
				System.out.println("Nome do cliente: " + this.nome);
				System.out.println("Nº conta: " + contas[i].getNumero());
				System.out.println("Ag.: " + contas[i].getAgencia());
				System.out.println("Senha: ********");;
			}
		}
		if(flag == false){
			System.out.println("Nao ha contas cadastradas!");
		}
	}
	
	public void pesquisar(int numero){
		boolean flag = false;
		for(int i = 0; i < contas.length; i++){
			if(contas[i] != null && contas[i].getNumero() == numero){
				System.out.println("############################");
				System.out.println("Nome do cliente: " + this.nome);
				System.out.println("Nº conta: " + contas[i].getNumero());
				System.out.println("Ag.: " + contas[i].getAgencia());
				System.out.println("Senha: ********");
				flag = true;
				break;
			}
		}
		if(flag == false){
			System.out.println("Conta inexistente ou numero invalido!");			
		}
	}
	
	public void excluir(int numero){
		boolean flag = false;
		for(int i = 0; i < contas.length; i ++){
			if(contas[i] != null && contas[i].getNumero() == numero){
				contas[i] = null;
				flag = true;
				System.out.println("Conta excluida com sucesso!");
				break;
			}
		}
		if(flag == false){
			System.out.println("Conta inexistente ou numero invalido!");			
		}
	}
	
	public void adicionar(Conta c){
		int i = 0;
		for(i = 0; i < contas.length; i ++){
			if(contas[i] == null){
				contas[i] = c;
				break;
			}
		}
		if(i == contas.length){
			System.out.println("Limite de contas por usuário atingido!");
		} 
		else{
			System.out.println("Conta adicionada com sucesso!");
		}
	}
	
	public Clientes(String nome, int qntd) {
		this.contas = new Conta[qntd];
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Conta[] getContas() {
		return contas;
	}
	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

}
