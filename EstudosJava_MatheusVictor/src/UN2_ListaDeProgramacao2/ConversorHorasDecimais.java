package UN2_ListaDeProgramacao2;

import java.util.*;

public class ConversorHorasDecimais {

	/**
	 * Programa criado para converter horas decimais, para o formato horas minutos segundos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double horasdecimais = 0;
		//Declarando a variavel correspondente �s horas decimais.
		
		System.out.println("Digite um valor em horas decimais:");
		System.out.println("Obs.: Digite apenas numeros. Ex.: 2,3");
		
		horasdecimais = sc.nextDouble();
		//recebendo do usu�rio o valor de horas decimais.
		
		int horas = (int) horasdecimais;
		//Declarando a vari�vel que ir� guardar o n�mero de horas inteiras, ou seja, "excluir�" as horas em decimais.
		
		double decimais = horasdecimais - horas;
		//Aqui, ser� considerado apenas o n�meros de horas decimais, ou seja, o n�mero de horas inteiro ser� "exclu�do". Por exemplo: se o n�mero foi 2.3, ser� considerado apenas 0.3.
		
		double min = decimais * 60;
		//Ou seja, o valor decimal encontrado ser� multiplicado por 60, correspondendo assim, aos minutos.
		
		int minutos = (int) min;
		//Aqui o processo ser� semelhante ao anterior, ou seja, do numero encotrado apenas os inteiros ser�o considerados.
		
		double s = min - minutos;
		//Atribuindo a uma nova variavel a subtra��o entre os minutos decimais, dos minutos inteiros. Ex.: 2.3 min - 2 min = 0.3 min
		
		double seg = s * 60;
		//Convertendo o valor decimal encontrado (correspondende aos minutos), para segundos
		
		int segundos = (int) seg;
		//Caso o valor dos segundos, na opera��o acima, seja encontrado em formato decimal, apenas o seu valor inteiro ser� lido pelo programa.
		

		
		/**
		 * double  = sc.nextDouble();
		int horas = (int) numero;
		//Convertendo o numero (double) digitado em um numero inteiro, ou seja, sera conservado apenas o numero inteiro inicialmente.
	    double tt = numero - horas;
	    //Aqui, o numero inteiro que foi conservado anteriormente � ignorando, restando apenas a parte decimal.
	    double min = tt*60;
	    //Convertendo as horas decimais em inteiros, correspondende aos minutos.
	    int minutos = (int) min;
	    //Conservando o valor de minutos convertidos e guardando-o em uma nova variavel.
	    double cd = min - minutos;
	    //Se o valor dos minutos foi achado em forma decimal, aqui sera feito um procedimento semelhante ao anterior para transform�-lo em inteiro, correspondende aos segundos.
	    double seg = cd*60;
	    //Convertendo os minutos decimais em inteiros, correspondende aos segundos.
	    int segundos = (int) seg;
	    //Numero convertido atribuido a uma nova variavel inteira.
	     * 
	  	   */ 
	    System.out.println("Valor: " + horas + " h " + minutos + " min " + segundos + " seg");

	}

}
