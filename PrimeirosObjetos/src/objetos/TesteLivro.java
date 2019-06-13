package objetos;

public class TesteLivro {
	public static void main(String[] args) {
		Livro l = new Livro();
		
		l.nome = "A Guerra dos Tronos";
		l.autor = "George R. R. Martin";
		l.genero = "Fantasia";
		l.editora = "Leya";
		l.ano = 1996;
		
		
		System.out.println("Título do livro: " + l.nome);
		System.out.println("Autor: " + l.autor);
		System.out.println("Genero: " + l.genero);
		System.out.println("Editora (no Brasil): " + l.editora);
		System.out.println("Ano de publicaçao: " + l.ano);
		
	}

}