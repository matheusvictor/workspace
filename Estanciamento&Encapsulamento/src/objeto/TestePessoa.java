package objeto;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Matheus Victor");
		p.setSexo("Masculino");
		p.setProfissao("Estudante");
		p.setIdade(17);
		p.setTamanho (1.75);
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Sexo: " + p.getSexo());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Tamanho: " + p.getTamanho() + "m");
		System.out.println("Profissao: " + p.getProfissao());
		
	}

}
