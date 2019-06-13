package velocidade.linar.casa;
import java.util.*;
public class VelocidadeLinearCasa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double latgraus, latmin, latseg = 0;
		
		long raioterra = 6371000;
		//O raio da Terra est� em metros
		long rotacaoterra = 86400;
		//A rota��o da Terra (24h) est� em segundos
		double pi = 3.14159265;
		
		//As variaveis acima possuem valores preestabelecidos
		
		System.out.println("1� passo: localiza��o (latitude) de sua casa.");
		System.out.println("A sua localiza��o pode ser obtida atraves do Street View e sera dada em graus, minutos e segundos. Ex.: 34� 23'' 10'.");
		System.out.println("Siga os passos abaixo e preecha-os com os dados solicitados.");
		
		System.out.println("\nDigite a localiza�ao em graus: ");
		latgraus = sc.nextDouble();
		System.out.println("Digite a localiza�ao em minutos: ");
		latmin = sc.nextDouble();
		System.out.println("Digite a localiza�ao em segundos: ");
		latseg = sc.nextDouble();
		
		double latminutos = latseg / 60;
		//Convertendo a parte da latitude que est� em seg. para min.
		double lathoras = (latmin + latminutos) / 60;
		//Convertendo as partes da latitude que est�o em min. para h
		double latradianos = (lathoras + latgraus) / 180;
		//Convertendo a latitude em horas (graus) para radianos.
		double cosseno = Math.cos(latradianos);
		//Formula para achar o cosseno  de alfa. Vale lembrar que, para que esta formula funcione
		//o cos recebe um valor em radianos
		
		//Agora, os dados preestabelecidos e os encontrados, serao 'jogados' nas f�rmulas necess�rias
		double raiocasa = raioterra * cosseno;
		//F�rmula para encontrar o raio da casa
		double velangularterra = (2*pi)/rotacaoterra;
		//F�rmula para encontrar a velocidade angular da Terra
		double vellinearcasa = velangularterra * raiocasa;
		//F�rmula para encontrar a velocidade linear da sua casa
		
		System.out.println("\nDados:");
		System.out.println("Raio da terra: " + raioterra + " m");
		System.out.println("Periodo de rota�ao da terra: " + rotacaoterra + " seg.");
		System.out.println("Localiza�ao (latitude) da casa: " + latgraus + "� " + latmin + "'' " + latseg + "'");
		System.out.println("Localiza�ao (latitude), em graus, da casa: " + (latgraus + lathoras) + " �");
		System.out.println("Localiza�ao (latitude), em radianos, da casa: " + latradianos + " rad");
		System.out.println("Cosseno de Alfa: " + cosseno);
		System.out.println("Raio da casa: " + raiocasa + " m");
		System.out.println("Velocidade Angular da Terra: " + velangularterra + " rad/s");
		System.out.printf("Velocidade Linear da Terra: %.2f" , vellinearcasa); System.out.println(" m/s");
		
		
		
	}

}
