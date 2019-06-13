package criacao.bike;

public class Pedais {

	private String material;
	private boolean funcionando;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isFuncionando() {
		return funcionando;
	}
	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
	public void pedalar(){
		System.out.println("Pedalando...");
		this.funcionando = true;
	}
	
	public void parar(){
		System.out.println("Parando de pedalar...");
		this.funcionando = false;
	}
	
}
