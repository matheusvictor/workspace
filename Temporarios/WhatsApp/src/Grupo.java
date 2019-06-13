
public class Grupo {
	private String nome;
	private Contato Administrador;
	public Grupo(String nome, Contato administrador) {
		this.nome = nome;
		Administrador = administrador;
	}
	private Contato[] Membros = new Contato[100];
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato getAdministrador() {
		return Administrador;
	}
	public void setAdministrador(Contato administrador) {
		Administrador = administrador;
	}
	public Contato[] getMembros() {
		return Membros;
	}
	public void setMembros(Contato[] membros) {
		Membros = membros;
	}  
}
