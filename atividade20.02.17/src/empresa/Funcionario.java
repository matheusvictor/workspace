package empresa;

public class Funcionario {
		
	@Override
	public String toString() {
		return "Funcionario [nomeFuncionario=" + nomeFuncionario
				+ ", codFuncionario=" + codFuncionario + ", setor=" + setor
				+ "]";
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public int getCodFuncionario() {
		return codFuncionario;
	}
	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	private String nomeFuncionario;
	private int codFuncionario;
	private String setor;
}
