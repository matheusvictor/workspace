package lavajato;

import java.util.ArrayList;
import java.util.List;

public class Processo {

		private List<Criminoso> criminosos; //Lista tipada
		private int numeroProcesso;
		//DICA: Pesquisar e ler sobre Coleções - ARRAYLIST e LIST

		public boolean cadastrar(Criminoso c) {
			return criminosos.add(c);
		}

		//Métodos REMOVER e PESQUISAR: implementar e trazer na proxima aula, dia 14/02
		public boolean remover(int cpf) {
			
			for(int i = 0; i < criminosos.size(); i ++){
				if(criminosos.get(i).getCpf() == cpf){
					criminosos.remove(i);
					System.out.println("Criminoso removido com sucesso!");
					return true;
				}
			}
			
			return false;

		}

		public boolean pesquisar(int cpf){
			for(int i = 0; i < criminosos.size(); i ++){
				if(criminosos.get(i).getCpf() == cpf){
					System.out.println(criminosos.toString());
					return true;
				}
			}
				return false;
		}

		public void listar() { // imprimir todos os criminosos cadastrados
			System.out.println(criminosos.toString());
		}

		public void listarPorCrime(String crimeEspecifico) {
			for (int i = 0; i < criminosos.size(); i++) {
				if (criminosos.get(i).getCrime().equals(crimeEspecifico)) {
					System.out.println(criminosos.get(i).toString());
				}
			}
		}

		public Processo() {
			this.criminosos = new ArrayList<Criminoso>();
		}

}