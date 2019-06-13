
public class PC extends Contato{
	private String browsser;
	public PC(int numero, String browser) {
		super(numero);
		this.browsser = browser;
		// TODO Auto-generated constructor stub
	}
	public String getBrowsser() {
		return browsser;
	}
	public void setBrowsser(String browsser) {
		this.browsser = browsser;
	}

}
