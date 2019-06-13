package objeto;

public class Livro {
	
	String titulo, autor, edicao;
	int paginas;
	
	public void setTitulo (String t){
		this.titulo = t;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setAutor (String a){
		this.autor = a;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void setEdicao (String e){
		this.edicao = e;
	}
	
	public String getEdicao(){
		return edicao;
	}
	
	public void setPaginas (int p){
		this.paginas = p;
	}
	
	public int getPaginas(){
		return paginas;
	}

}
