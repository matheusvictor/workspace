package objeto;

public class Pessoa {

	String nome, sexo, profissao;
	int idade;
	double tamanho;
	
	public void setNome (String n){
		this.nome = n;
	}
	
	public String getNome() {
		return  nome;
	}
	
	public void setSexo (String s){
		this.sexo = s;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	public void setProfissao(String p){
		this.profissao = p;
	}
	
	public String getProfissao(){
		return profissao;
	}
	
	public void setIdade (int i){
		this.idade = i;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setTamanho (double t){
		this.tamanho = t;
	}
	
	public double getTamanho(){
		return tamanho;
	}

}