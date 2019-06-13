import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		LocalGravacao localGravacao = new LocalGravacao();
		localGravacao.setPais("Canadá");
		localGravacao.setMesesDeGravacao(3);
		localGravacao.setCidade("cidade de Quebec");
		
		Filme filme = new Filme();
		filme.setCod("123");
		filme.setAnoLancamento(2004);
		filme.setTitulo("Titanic");
		filme.setLocalGravacao(localGravacao);
		
		EntradaDeCinema e = new EntradaDeCinema(21.30, 19, 14, filme);
		e.exibirInformacoes();

	}

}
