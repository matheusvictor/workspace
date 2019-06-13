package objeto;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno[] Classe = new Aluno[4]; 
	
		for (int i = 0; i < Classe.length; i ++){
			Aluno a = new Aluno();
			Classe[i] = a;
			
			a.setCurso("Informatica");
			a.setNome("Matheus");
			a.setMatricula("201500001");
			a.setSerie(2);
		}
		
		for (int i = 0; i < Classe.length; i ++){
			System.out.println("\nNome do aluno: " + Classe[i].getNome());
			System.out.println("Curso: " + Classe[i].getCurso());
			System.out.println("Serie: " + Classe[i].getSerie() + "º ano");
			System.out.println("Numero da matricula: " + Classe[i].getMatricula());
		}

	}

}
