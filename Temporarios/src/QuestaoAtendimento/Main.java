package QuestaoAtendimento;
import java.util.*;

import org.w3c.dom.ls.LSInput;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean flag = true;
		int opc = 0;
		int i = 0;
		
		AlunoIntegrado listaAlunos[] = new AlunoIntegrado[5];
		
		while(flag){
			System.out.println("####################################");
			System.out.println("#Digite uma das seguintes opções   #");
			System.out.println("# 1 - Cadastrar aluno do integrado #");
			System.out.println("# 2 - Consultar aluno do integrado #");
			System.out.println("# 3 - Remover aluno do integrado   #");
			System.out.println("# 4 - Calcular média de um aluno do integrado   #");
			System.out.println("# 5 - Sair do program              #");
			System.out.println("####################################");
			opc = sc.nextInt();
			
			switch(opc){
			case 1:
				System.out.println("Digite o nome do aluno.");
				String nome = sc.next();
				System.out.println("Digite o numero de matricula.");
				String matricula = sc.next();
				System.out.println("Digite o ano de inscrição.");
				int anoInscriçao = sc.nextInt();
				System.out.println("Digite a serie.");
				int serie = sc.nextInt();
				AlunoIntegrado a =  new AlunoIntegrado(nome, matricula, serie, anoInscriçao);
				listaAlunos[i] = a;
				i++;
				break;
			case 2: 
				System.out.println("Digite o numero de matricula do aluno a ser consultado.");
				String matricula2 = sc.next();
				for(int aux = 0; aux < i; aux ++){
					if(matricula2 == listaAlunos[aux].getMatricula()){
						System.out.println("Nome: "+ listaAlunos[aux].getNome());
						System.out.println("Serie: "+ listaAlunos[aux].getSerie() + "º ano");
						System.out.println("Turma: "+ listaAlunos[aux].getTurma());
						System.out.println("Média: "+ listaAlunos[aux].getMediaFinal());
						aux=i;
					}
				}
				break;
			case 3:
				
			}
		}
	}

}
