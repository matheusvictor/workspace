package objetos;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		a.nome = "Matheus Victor";
		a.curso = "Informatica";
		a.serie = "2º ano";
		a.matricula = 00010010101;
		a.turno = "Matutino";
		
		
		System.out.println("Nome do aluno: " + a.nome);
		System.out.println("Curso: " + a.curso);
		System.out.println("Serie: " + a.serie);
		System.out.println("Numero da matricula: " + a.matricula);
		System.out.println("Turno: " + a.turno);
		

	}

}
