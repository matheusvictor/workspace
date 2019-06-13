package criacao.ventilador;

public class Helice {

	private boolean girando;

	public boolean isGirando() {
		return girando;
	}

	public void setGirando(boolean girando) {
		this.girando = girando;
	}
	
	public void ligar(){
		this.girando = true;
		System.out.println("Helices girando!");
	}
		
	public void desligar(){
		this.girando = false;
		System.out.println("Helices paradas!");
		}
}