package objeto;

public class TesteAviao {
	public static void main(String[] args) {
		
		/**
		 *
		Aviao a = new Aviao(); //Estaciando o objeto com os tributos definidos antes
		
		//Atribuindo um valor � pot�ncia...
		a.setPotencia(1000);
		//Atribuindo qnt de pilotos...
		a.setPilotos(4);
		//Atribuindo nome da empresa...
		a.setEmpresa("TAM");
		
		
		System.out.println("A potencia do aviao eh: " + a.getPotencia());
		System.out.println("Quantidade de pilotos: " + a.getPilotos());
		System.out.println("Empresa: " + a.getEmpresa());
*/
		//Criando 300 avioes iguais:
		Aviao[] hangar = new Aviao[300];
		//Criando um vetor para "guardar" o objeto criado antes
		//Ou seja, uma varial hangar, tera 300 espa�os para 300 avioes c/ os atribuitos definidos
		
		for(int i = 0; i < hangar.length; i ++){ //lan�o de repeti��o para criar os objetos
			Aviao a = new Aviao();
			hangar[i] = a;
			
			//Atribuindo um valor � pot�ncia...
			a.setPotencia(1000);
			//Atribuindo qnt de pilotos...
			a.setPilotos(4);
			//Atribuindo nome da empresa...
			a.setEmpresa("TAM");
		}
		
		for(int i = 0; i <hangar.length; i++){ // la�o de repeti��o para mostrar os atributos do objeto 
			System.out.println("\nA potencia do aviao eh: " + hangar[i].getPotencia());
			System.out.println("Quantidade de pilotos: " + hangar[i].getPilotos());
			System.out.println("Empresa: " + hangar[i].getEmpresa());

		}
	}

}
