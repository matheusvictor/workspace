package Questao6;

public class Pais {
	
	public boolean Lista(Pais outro){
		for(int i = 0; i < paises.length; i ++){
			if(paises[i].Limitrofe(outro)){ //refere-se as fronteiras
				return true;
			}
		}
				return false;
	}	
	
	public boolean Limitrofe(Pais outro){
		for(int i = 0; i < paises.length; i ++){
			if(paises[i].Comparacao(outro)){ //refere-se as fronteiras
				return true;
			}
		}
				return false;
	}
	
	public double Densidade(){
		double densidade = this.população / this.dimensao;
		return densidade;
	}
	
	
	/**
	 *@Override
	  public boolean equals(Object obj) {
		  Pais outro = (Pais) obj;
		
		if(this.iso.equals(outro.getIso())){ //Recebe o iso de um pais e o compara do iso recebido de outro (getIso)
			return true;
		}
		else
			return false;
	}
	 
	 */
	
	
	public boolean Comparacao(Pais outro){
		if(this.iso.equals(outro.getIso())){ //Recebe o iso de um pais e o compara do iso recebido de outro (getIso)
			return true;
		}
		else
			return false;
	}
	
	public String getIso() {
		return iso;
	}
	public void setIso(String iso) {
		this.iso = iso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPopulação() {
		return população;
	}
	public void setPopulação(float população) {
		this.população = população;
	}
	public float getDimensao() {
		return dimensao;
	}
	public void setDimensao(float dimensao) {
		this.dimensao = dimensao;
	}
	public Pais[] getPaises() {
		return paises;
	}

	public void setPaises(Pais[] paises) {
		this.paises = paises;
	}
	
	public Pais() { //COnstrutor padrao
		this.iso = iso;
		this.nome = nome;
		this.dimensao = dimensao;
	}

	public Pais(String iso, String nome, float dimensao) { //Construtor sobrecarregado
		this.iso = iso;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	
	private String iso;
	private String nome;
	private float população;
	private float dimensao;
	private Pais[] paises; //refere-se às fronteiras
}