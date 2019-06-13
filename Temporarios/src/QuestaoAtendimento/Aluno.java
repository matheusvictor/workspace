package QuestaoAtendimento;

public class Aluno {
	
	public String toString(){ //Metodo para converter um obj em texto e permitir a exibição, La na lista de Usuarios por exemplo.
		return "Nome:  " + nome + "\nMatricula: " + matricula + "\nMedia final: " + mediaFinal;
	}
	public void CalculaMedia(double media1, double media2, double media3){
		this.mediaFinal = 0;
		mediaFinal = (media1 + media2 + media3)/3;
		System.out.println(mediaFinal);
	}
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getMediaFinal() {
		return mediaFinal;
	}
	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	private String nome;
	private String matricula;
	private String sexo;
	protected double mediaFinal;

}
