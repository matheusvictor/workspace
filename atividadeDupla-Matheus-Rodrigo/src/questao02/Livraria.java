package questao02;

public class Livraria {
	
	private String nomeLivraria, telefone, endereco, cnpj;
	private Livro [] livros;
	
	public void listar(){
		boolean flag = false;
		for(int i = 0; i < livros.length; i++){	
			if(livros[i] != null){
				flag = true;
				System.out.println("####################################");
				System.out.println("Nome do livro: " + livros[i].getNomeLivro());
				System.out.println("Autor: " + livros[i].getAutor());
				System.out.println("Editora: " + livros[i].getEditora());
				System.out.println("Cod. do livro: " + livros[i].getCodigo());
			}
		}
		if(flag == false){
			System.out.println("Nao ha livros cadastrados!");
		}
	}
	
	public void pesquisar(int codigo){
		boolean flag = false;
		for(int i = 0; i < livros.length; i++){
			if(livros[i] != null && livros[i].getCodigo() == codigo){
				System.out.println("############################");
				System.out.println("Nome da livraria: " + this.nomeLivraria);
				System.out.println("CNPJ: " + this.cnpj);
				System.out.println("Nome do livro: " + livros[i].getNomeLivro());
				System.out.println("Autor: " + livros[i].getAutor());
				System.out.println("Editora: " + livros[i].getEditora());
				System.out.println("Cod. do livro: " + livros[i].getCodigo());
				flag = true;
				break;
			}
		}
		if(flag == false){
			System.out.println("Livro inexistente ou codigo invalido!");			
		}
	}
	
	public void excluir(int codigo){
		boolean flag = false;
		for(int i = 0; i < livros.length; i ++){
			if(livros[i] != null && livros[i].getCodigo() == codigo){
				livros[i] = null;
				flag = true;
				System.out.println("Livro excluido com sucesso!");
				break;
			}
		}
		if(flag == false){
			System.out.println("Livro inexistente ou cod. invalido!");			
		}
	}
	
	public void adicionar(Livro l){
		int i = 0;
		for(i = 0; i < livros.length; i ++){
			if(livros[i] == null){
				livros[i] = l;
				break;
			}
		}
		if(i == livros.length){
			System.out.println("Limite atingido!");
		} 
		else{
			System.out.println("Livro adicionado com sucesso!");
		}
	}
	
	public Livraria(String nomeLivraria, int qntd) {
		this.livros = new Livro[qntd];
		this.nomeLivraria = nomeLivraria;
	}

	public String getNomeLivraria() {
		return nomeLivraria;
	}

	public void setNomeLivraria(String nomeLivraria) {
		this.nomeLivraria = nomeLivraria;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

}
