package objetos;

public class TesteArvore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arvore a = new Arvore();
		
		a.nome = "Macieira";
		a.origem = "Asia Ocidental";
		a.especie = "Caducifólia";
		a.estacaofrutos = "Outono";
		a.reino = "Plantae";
		a.fruta = "Maça";
		
		
		System.out.println("Nome da arvore: " + a.nome);
		System.out.println("Reino: " + a.reino);
		System.out.println("Origem: " + a.origem);
		System.out.println("Especie: " + a.especie);
		System.out.println("Fruto: " + a.fruta);
		System.out.println("Estaçao de produçao dos frutos: " + a.estacaofrutos);

	}

}
