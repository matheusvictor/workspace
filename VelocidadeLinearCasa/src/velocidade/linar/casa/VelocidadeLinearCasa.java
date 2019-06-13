package velocidade.linar.casa;
import java.util.*;
public class VelocidadeLinearCasa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double latgraus, latmin, latseg = 0;
		
		long raioterra = 6371000;
		//O raio da Terra está em metros
		long rotacaoterra = 86400;
		//A rotação da Terra (24h) está em segundos
		double pi = 3.14159265;
		
		//As variaveis acima possuem valores preestabelecidos
		
		System.out.println("1º passo: localização (latitude) de sua casa.");
		System.out.println("A sua localização pode ser obtida atraves do Street View e sera dada em graus, minutos e segundos. Ex.: 34º 23'' 10'.");
		System.out.println("Siga os passos abaixo e preecha-os com os dados solicitados.");
		
		System.out.println("\nDigite a localizaçao em graus: ");
		latgraus = sc.nextDouble();
		System.out.println("Digite a localizaçao em minutos: ");
		latmin = sc.nextDouble();
		System.out.println("Digite a localizaçao em segundos: ");
		latseg = sc.nextDouble();
		
		double latminutos = latseg / 60;
		//Convertendo a parte da latitude que está em seg. para min.
		double lathoras = (latmin + latminutos) / 60;
		//Convertendo as partes da latitude que estão em min. para h
		double latradianos = (lathoras + latgraus) / 180;
		//Convertendo a latitude em horas (graus) para radianos.
		double cosseno = Math.cos(latradianos);
		//Formula para achar o cosseno  de alfa. Vale lembrar que, para que esta formula funcione
		//o cos recebe um valor em radianos
		
		//Agora, os dados preestabelecidos e os encontrados, serao 'jogados' nas fórmulas necessárias
		double raiocasa = raioterra * cosseno;
		//Fórmula para encontrar o raio da casa
		double velangularterra = (2*pi)/rotacaoterra;
		//Fórmula para encontrar a velocidade angular da Terra
		double vellinearcasa = velangularterra * raiocasa;
		//Fórmula para encontrar a velocidade linear da sua casa
		
		System.out.println("\nDados:");
		System.out.println("Raio da terra: " + raioterra + " m");
		System.out.println("Periodo de rotaçao da terra: " + rotacaoterra + " seg.");
		System.out.println("Localizaçao (latitude) da casa: " + latgraus + "º " + latmin + "'' " + latseg + "'");
		System.out.println("Localizaçao (latitude), em graus, da casa: " + (latgraus + lathoras) + " º");
		System.out.println("Localizaçao (latitude), em radianos, da casa: " + latradianos + " rad");
		System.out.println("Cosseno de Alfa: " + cosseno);
		System.out.println("Raio da casa: " + raiocasa + " m");
		System.out.println("Velocidade Angular da Terra: " + velangularterra + " rad/s");
		System.out.printf("Velocidade Linear da Terra: %.2f" , vellinearcasa); System.out.println(" m/s");
		
		
		
	}

}
