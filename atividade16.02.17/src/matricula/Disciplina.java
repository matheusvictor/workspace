package matricula;

public class Disciplina {
	
	@Override
	public String toString() {
		return "Disciplina [codDisciplina=" + codDisciplina
				+ ", nomeDisciplina=" + nomeDisciplina + ", cargaHoraria="
				+ cargaHoraria + ", nomeProfessor=" + nomeProfessor + "]";
	}
	public int getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	private int codDisciplina;
	private String nomeDisciplina;
	private int cargaHoraria;
	private String nomeProfessor;

}
