package QuestaoAtendimento;

public class AlunoSubsequente extends Aluno{
	
	public AlunoSubsequente(String nome, String matricula, int anoInscri�ao) {
		super(nome, matricula);
		this.anoInscri�ao = anoInscri�ao;
		// TODO Auto-generated constructor stub
	}
	public int getModulo() {
		return modulo;
	}
	public void setModulo(int modulo) {
		this.modulo = modulo;
	}
	public int getAnoInscri�ao() {
		return anoInscri�ao;
	}
	public void setAnoInscri�ao(int anoInscri�ao) {
		this.anoInscri�ao = anoInscri�ao;
	}
	private int modulo;
	private int anoInscri�ao;

}
