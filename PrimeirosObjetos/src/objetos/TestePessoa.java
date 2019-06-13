package objetos;
public class TestePessoa {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Matheus Victor";
		p.sexo = "Masculino";
		p.tamanho = 1.75;
		p.idade = 17;
		p.signo = "Gemeos";
		
		System.out.println("Nome: " + p.nome);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Idade: " + p.idade);
		System.out.println("Tamanho: " + p.tamanho + " m");
		System.out.println("Signo: " + p.signo);

	}

}
