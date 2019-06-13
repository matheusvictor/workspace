package empregado.metodo;

public class Empregado {
	
	public Empregado (String nome, String rg){
		this.nome = nome;
		this.rg = rg;
	}

	public Empregado(){ //Construtor "basico"
		this.nome = "Fulano";
	}
	
	/**
	 * public Empregado(){ //construtor "basico"
	 * 	this.nome = "Fulano";
	 * 	this.rg = "123";
	 *}
	 * 
	 * Neste caso os dados sao passados ja na classe e nao no main, portanto, 
	 * quando estaciados variaos objetos Empregado, todos terão as mesmas caracteristicas
	 * 
	 */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	private String nome;
	private String rg;
	private String departamento;
	private double salario;
}
