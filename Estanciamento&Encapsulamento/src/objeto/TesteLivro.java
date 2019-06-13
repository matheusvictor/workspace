package objeto;

public class TesteLivro {

	public static void main(String[] args) {
		
	Livro[] prateleira = new Livro[10];
	
	for(int i = 0; i < prateleira.length; i ++){
		
		Livro l = new Livro();
		prateleira[i] = l;
		
		l.setAutor("Machado de Assis");
		l.setTitulo("Dom Casmurro");
		l.setPaginas(251);
		l.setEdicao("Saraiva de Bolso");
	}
	
	for (int i = 0; i < prateleira.length; i ++){
		System.out.println("\nTitulo: " + prateleira[i].getTitulo());
		System.out.println("Autor: " + prateleira[i].getAutor());
		System.out.println("Edicao: " + prateleira[i].getEdicao());
		System.out.println("Paginas: " + prateleira[i].getPaginas());
	}
	}

}
