package lavajato;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntradaUsuario {
	
	
	public static String obterEntrada(){
		String entrada = "";
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);

		try {
			entrada = bfr.readLine();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entrada;
	}


}
