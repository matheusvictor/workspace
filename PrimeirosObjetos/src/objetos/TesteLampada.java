package objetos;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada l = new Lampada();

		l.marca = "Philips";
		l.tipo = "Fluorescente";
		l.tensao = 220;
		l.potencia = 40;
		l.vidautil = 2.7;
		
		System.out.println("Marca da lampada: " + l.marca);
		System.out.println("Tipo: " + l.tipo);
		System.out.println("Tensao: " + l.tensao + " Volts");
		System.out.println("Potencia: " + l.potencia + " Watts");
		System.out.println("Vida util: " + l.vidautil + " ano(s)");
	}

}
