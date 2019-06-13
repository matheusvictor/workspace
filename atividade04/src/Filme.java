
public class Filme {
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public LocalGravacao getLocalGravacao() {
		return localGravacao;
	}
	public void setLocalGravacao(LocalGravacao localGravacao) {
		this.localGravacao = localGravacao;
	}
	private String cod;
	private String titulo;
	private int anoLancamento;
	private LocalGravacao localGravacao;

}
