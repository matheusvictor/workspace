package lampada.metodo;

public class Main {

	public static void main(String[] args) {
		
		
		Lampada lamp = new Lampada();
		
		System.out.println(lamp.isOn());
		lamp.setOn(true);
		System.out.println(lamp.isOn());
		
		/**Cod. feito em sala:
		 * 
		Lampada lamp = new Lampada(false); //estado inicial da lampada = desligada
	

		//System.out.println(lamp.isOn());
		//lamp.setOn(true);

		System.out.println(lamp.mudarStatus()); //cada vez invocado, o stts da lampada mudara
		 */
		
		

	}

}
