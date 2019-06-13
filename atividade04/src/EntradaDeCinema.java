
public class EntradaDeCinema {
	
	public void exibirInformacoes(){
		System.out.println("Filme: " + this.filme.getTitulo());
		System.out.println("Ano de lançamento: " + this.filme.getAnoLancamento());
		System.out.println("Local de gravacao: " + this.filme.getLocalGravacao().getPais() + ", " + this.filme.getLocalGravacao().getCidade() + " (gravado em " + this.filme.getLocalGravacao().getMesesDeGravacao() + " meses)");
		System.out.println("Sala: " + this.sala);
		System.out.println("Horario: " + this.horario);
		System.out.println("Valor do ingresso: R$ " + this.valorIngresso);
	}
	
	public void calculaDesconto(int anoNascimentoCliente, int carteiraEstudante){
		 carteiraEstudante = 0;
		if((2016 - anoNascimentoCliente) >= 12 && (2016 - anoNascimentoCliente) <= 15){
			this.valorIngresso -= this.valorIngresso * (40/100);
		}
		else if((2016 - anoNascimentoCliente) >= 15 && (2016 - anoNascimentoCliente) <= 20){
			this.valorIngresso -= this.valorIngresso * (30/100);
		}
		else if((2016 - anoNascimentoCliente) > 20){
			this.valorIngresso -= this.valorIngresso * (20/100);
		}
	}
	
	public void calculaDesconto(int anoNascimentoCliente){
		if((2016 - anoNascimentoCliente) <= 12){
			this.valorIngresso = this.valorIngresso / 2;
		}
	}
	
	public EntradaDeCinema(double horario, int sala, double valorIngresso, Filme filme) {
		this.horario = horario;
		this.sala = sala;
		this.valorIngresso = valorIngresso;
		this.filme = filme;
	}
	
	public double getHorario() {
		return horario;
	}
	public void setHorario(double horario) {
		this.horario = horario;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public double getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	private double horario;
	private int sala;
	private double valorIngresso;
	private Filme filme;

}
