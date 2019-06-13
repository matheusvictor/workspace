package Questao1;

public class Contador {
	
	public void retornar(){
		System.out.println("Valor atual do contador: " + contador);
	}
	public void zerar(){
		this.contador = 0;
	}
	
	public void incrementar(){
		this.contador += 1;
	}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	private int contador;

}
