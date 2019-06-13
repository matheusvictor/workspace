package criacao.tv.icaro;

public class Main {

	public static void main(String[] args) {

		TV tv = new TV("TV1");
		TV tv2 = new TV("TV2", "LG", "Preta", 21);
		
		ControleRemoto contr = new ControleRemoto(tv);
	
		
		System.out.println(tv.getId() + " " + tv.getCor() + ": " + tv.isLigado());
		contr.power();
		System.out.println(tv.getId() + " " + tv.getCor() + ": " + tv.isLigado());
	}

}
