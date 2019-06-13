package lampada.metodo;

public class Lampada {
	
	
	public Lampada() {
		this.on = on;
	}

	public String isOn() {
		
		if(this.on)
		return "Ligada";
		
		else
			return "Desligada";
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	private boolean on;
	
	/** Cod feito em sala:
	 * 
	 * 	
	public Lampada(boolean on) {
		this.on = on;
	}	
	
	public String mudarStatus(){
		if(this.on){
			this.on = false;
			return "Desligada";
		}
		
		else{
			this.on = true; 
			return "Ligada";
		}
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	private boolean on;
	 */

}
