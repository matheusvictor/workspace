package objetos;
public class TesteComputador {

	public static void main(String[] args) {
		Computador c = new Computador();
		
		c.modelo = "Notebook";
		c.marca = "Lenovo";
		c.cor = "prata";
		c.processador = "Intel i5";
		c.tamanhotela = 21;
		c.hd = 500;
		
		System.out.println("Marca do PC: " + c.marca);
		System.out.println("Modelo: " + c.modelo);
		System.out.println("Cor: " + c.cor);
		System.out.println("Processador: " + c.processador);
		System.out.println("Tamanho da tela: " + c.tamanhotela + "'");
		System.out.println("HD: " + c.hd + " GB");
	}

}
