package objeto;

public class Aluno {
	
	
	private String nome, matricula, curso;
	private int serie;
	
	
	public void setNome (String n){
		this.nome = n;
	}
	
	public void setMatricula (String m){
		this.matricula = m;
	}
	
	public void setCurso (String c){
		this.curso = c;
	}
	
	public void setSerie (int s){
		this.serie = s;
	}
	
	public String getNome() {
		return  nome;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public String getCurso(){
		return curso;
	}
	
	public int getSerie(){
		return serie;
	}
	

}