package questao02;

public class Livro {
	
	private String nomeLivro, autor, editora;
	private int codigo;
	
	public Livro(String nomeLivro, String autor, String editora, int codigo) {
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.editora = editora;
		this.codigo = codigo;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
