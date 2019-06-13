package QuestaoAtendimento;

public class AlunoLC extends Aluno{
	
	public AlunoLC(String nome, String matricula) {
		super(nome, matricula);
		// TODO Auto-generated constructor stub
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	private String semestre;

}
