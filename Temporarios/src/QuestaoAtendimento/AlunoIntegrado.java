package QuestaoAtendimento;

public class AlunoIntegrado extends Aluno{
	
	public void CalculaMedia(double nota1, double nota2, double nota3, double nota4){
		this.mediaFinal = 0;
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(mediaFinal);
	}
	
	public AlunoIntegrado(String nome, String matricula, int serie, int anoInscriçao) {
		super(nome, matricula);	
		this.serie = serie;
		this.anoInscriçao = anoInscriçao;
		// TODO Auto-generated constructor stub
	}
	public int getAnoInscriçao() {
		return anoInscriçao;
	}
	public void setAnoInscriçao(int anoInscriçao) {
		this.anoInscriçao = anoInscriçao;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	private int anoInscriçao;
	private int serie;
	private String turma;
	
	

}
