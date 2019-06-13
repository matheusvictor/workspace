package QuestaoAtendimento;

public class AlunoSubsequente extends Aluno{
	
	public AlunoSubsequente(String nome, String matricula, int anoInscriçao) {
		super(nome, matricula);
		this.anoInscriçao = anoInscriçao;
		// TODO Auto-generated constructor stub
	}
	public int getModulo() {
		return modulo;
	}
	public void setModulo(int modulo) {
		this.modulo = modulo;
	}
	public int getAnoInscriçao() {
		return anoInscriçao;
	}
	public void setAnoInscriçao(int anoInscriçao) {
		this.anoInscriçao = anoInscriçao;
	}
	private int modulo;
	private int anoInscriçao;

}
