package QuestaoAtendimento;

public class AlunoIntegrado extends Aluno{
	
	public void CalculaMedia(double nota1, double nota2, double nota3, double nota4){
		this.mediaFinal = 0;
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(mediaFinal);
	}
	
	public AlunoIntegrado(String nome, String matricula, int serie, int anoInscri�ao) {
		super(nome, matricula);	
		this.serie = serie;
		this.anoInscri�ao = anoInscri�ao;
		// TODO Auto-generated constructor stub
	}
	public int getAnoInscri�ao() {
		return anoInscri�ao;
	}
	public void setAnoInscri�ao(int anoInscri�ao) {
		this.anoInscri�ao = anoInscri�ao;
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
	private int anoInscri�ao;
	private int serie;
	private String turma;
	
	

}
