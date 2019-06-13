package matricula;
import java.util.ArrayList;

public class Matricula {

	private ArrayList<Disciplina> disciplinas; //criando um arraay de disciplinas
	
	//Construtor inicializando o atributo:
	public Matricula(){
		this.disciplinas = new ArrayList<Disciplina>();
	}
	
	public boolean adicionar(Disciplina novaDisciplina){
		return disciplinas.add(novaDisciplina);
	}
	
	public boolean remover(int codigo){
		for(int i = 0; i < disciplinas.size(); i ++){
			if(disciplinas.get(i).getCodDisciplina() == codigo){ //verificando se o codigo da disciplina da posi�ao i � o mesmo que o recebido do usu�rio
				disciplinas.remove(i); //remove a disciplina da posi�ao i caso a condi��o seja verdadeira
				return true;
			}
		}
		return false;
	}
	
	public void listarTodas(){
		System.out.println(disciplinas.toString());
	}
	
	public void listarPorProfessor(String nomeProfessor){
		for(int i = 0; i < disciplinas.size(); i ++){
			if(disciplinas.get(i).getNomeProfessor().equals(nomeProfessor)){
				System.out.println(disciplinas.get(i).toString());
			}
		}
	}
}