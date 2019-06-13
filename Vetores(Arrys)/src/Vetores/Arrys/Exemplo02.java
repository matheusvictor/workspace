package Vetores.Arrys;
import java.util.Scanner;
import java.util.Arrays;
public class Exemplo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Arrays serve para preencher determinados intervalos de um vetor, com quaisquer numero desejado. Ex:
		
		int vetor [] = new int [10];
		
		java.util.Arrays.fill(vetor, 2,5 ,3);
		
		for (int i = 0; i < vetor.length; i ++){
			System.out.println(vetor[i]);
		}
		
		}

}
